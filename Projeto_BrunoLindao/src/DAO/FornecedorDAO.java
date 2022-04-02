package DAO;


import DTO.FornecedorDTO;
import DTO.FuncionarioDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class FornecedorDAO {
    
    Connection conn;
    PreparedStatement pstm;
    
    public void cadastrarFornecedor(FornecedorDTO objFornecedorDTO){
       String sql = "insert into tb_fornecedor (razaosocial_fornecedor, endereco_fornecedor, cidade_fornecedor, estado_fornecedor, email_fornecedor, telefone_fornecedor) values (?,?,?,?,?,?)";
       conn = new ConexaoDAO().conectaBD();
       
        try {
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, objFornecedorDTO.getRazaosocial());
            pstm.setString(2, objFornecedorDTO.getEndereco());
            pstm.setString(3, objFornecedorDTO.getCidade());
            pstm.setString(4, objFornecedorDTO.getEstado());
            pstm.setString(5, objFornecedorDTO.getEmail());
            pstm.setString(6, objFornecedorDTO.getTelefone());
            
            
            pstm.execute();
            pstm.close();
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "FornecedorDAO " + erro);
        }
    }
    
    public ResultSet ListaBusca (FornecedorDTO objFornecedorDTO){
   
        try {
            String sql="SELECT * FROM tb_fornecedor";

            conn = new ConexaoDAO().conectaBD();
            pstm = conn.prepareStatement(sql);

            ResultSet rs = pstm.executeQuery();
            return rs;

        } 
        catch (SQLException ex) {
            System.out.println(ex.getMessage());
            return null;
        }
    }
    
    public void AlterarFornecedor(FornecedorDTO objFornecedorDTO){
       String sql = "update tb_fornecedor set razaosocial_fornecedor = ?, endereco_fornecedor  = ?, cidade_fornecedor  = ?, estado_fornecedor  = ?, email_fornecedor  = ?, telefone_fornecedor  = ? where id_fornecedor = ?";
       conn = new ConexaoDAO().conectaBD();
       
        try {
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, objFornecedorDTO.getRazaosocial());
            pstm.setString(2, objFornecedorDTO.getEndereco());
            pstm.setString(3, objFornecedorDTO.getCidade());
            pstm.setString(4, objFornecedorDTO.getEstado());
            pstm.setString(5, objFornecedorDTO.getEmail());
            pstm.setString(6, objFornecedorDTO.getTelefone());
            pstm.setInt(7, objFornecedorDTO.getId());
            
            pstm.execute();
            pstm.close();
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "FornecedorDAO " + erro);
        }
    }
    
    public void ExcluirFornecedor(FornecedorDTO objFornecedorDTO){
       String sql = "delete from tb_fornecedor where id_fornecedor = ?";
       conn = new ConexaoDAO().conectaBD();
       
        try {
            pstm = conn.prepareStatement(sql);
            pstm.setInt(1, objFornecedorDTO.getId());
            
            pstm.execute();
            pstm.close();
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "FornecedorDAO " + erro);
        }
    }
}
