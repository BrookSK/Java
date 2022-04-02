package DAO;


import DTO.ClienteDTO;
import DTO.FuncionarioDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class ClienteDAO {
    
    Connection conn;
    PreparedStatement pstm;
    
    public void cadastrarCliente(ClienteDTO objClienteDTO){
       String sql = "insert into tb_cliente (nome_cliente, endereco_cliente, cidade_cliente, estado_cliente, telefone_cliente) values (?,?,?,?,?)";
       conn = new ConexaoDAO().conectaBD();
       
        try {
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, objClienteDTO.getNome());
            pstm.setString(2, objClienteDTO.getEndereco());
            pstm.setString(3, objClienteDTO.getCidade());
            pstm.setString(4, objClienteDTO.getEstado());
            pstm.setString(5, objClienteDTO.getTelefone());
            
            
            pstm.execute();
            pstm.close();
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "ClienteDAO " + erro);
        }
    }
    
    public ResultSet ListaBusca (ClienteDTO objClienteDTO){
   
        try {
            String sql="SELECT * FROM tb_cliente";

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
    
    public void AlterarCliente(ClienteDTO objClienteDTO){
       String sql = "update tb_cliente set nome_cliente = ?, endereco_cliente = ?, estado_cliente = ?, cidade_cliente = ?, telefone_cliente = ? where id_cliente = ?";
       conn = new ConexaoDAO().conectaBD();
       
        try {
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, objClienteDTO.getNome());
            pstm.setString(2, objClienteDTO.getEndereco());
            pstm.setString(3, objClienteDTO.getEstado());
            pstm.setString(4, objClienteDTO.getCidade());
            pstm.setString(5, objClienteDTO.getTelefone());
            pstm.setInt(6, objClienteDTO.getId());
            
            pstm.execute();
            pstm.close();
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "ClienteDAO " + erro);
        }
    }
    
    public void ExcluirCliente(ClienteDTO objClienteDTO){
       String sql = "delete from tb_cliente where id_cliente = ?";
       conn = new ConexaoDAO().conectaBD();
       
        try {
            pstm = conn.prepareStatement(sql);
            pstm.setInt(1, objClienteDTO.getId());
            
            pstm.execute();
            pstm.close();
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "ClienteDAO " + erro);
        }
    }
}
