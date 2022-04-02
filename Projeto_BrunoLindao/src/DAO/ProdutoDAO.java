package DAO;


import DTO.FuncionarioDTO;
import DTO.ProdutoDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class ProdutoDAO {
    
    Connection conn;
    PreparedStatement pstm;
    
    public void cadastrarProduto(ProdutoDTO objProdutoDTO){
        String sql = "insert into tb_produto(nome_produto, quantidade_produto, codigoDeBarras_produto, valor_produto) values (?,?,?,?)";
        conn = new ConexaoDAO().conectaBD();
        
        try {
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, objProdutoDTO.getNome());
            pstm.setString(2, objProdutoDTO.getQuantidade());
            pstm.setString(3, objProdutoDTO.getCodbar());
            pstm.setString(4, objProdutoDTO.getValor());
            
            pstm.execute();
            pstm.close();
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "ProdutoDAO " + erro);
        }
    }
    
    public ResultSet ListaBusca (ProdutoDTO objProdutoDTO){
   
        try {
            String sql="SELECT * FROM tb_produto";

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
    
    public void AlterarProduto(ProdutoDTO objProdutoDTO){
       String sql = "update tb_produto set nome_produto = ?, quantidade_produto = ?, codigoDeBarras_produto = ?, valor_produto = ? where id_produto = ?";
       conn = new ConexaoDAO().conectaBD();
       
        try {
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, objProdutoDTO.getNome());
            pstm.setString(2, objProdutoDTO.getQuantidade());
            pstm.setString(3, objProdutoDTO.getCodbar());
            pstm.setString(4, objProdutoDTO.getValor());
            pstm.setInt(5, objProdutoDTO.getId());
            
            pstm.execute();
            pstm.close();
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "ProdutoDAO " + erro);
        }
    }
    
    public void ExcluirProduto(ProdutoDTO objProdutoDTO){
       String sql = "delete from tb_produto where id_produto = ?";
       conn = new ConexaoDAO().conectaBD();
       
        try {
            pstm = conn.prepareStatement(sql);
            pstm.setInt(1, objProdutoDTO.getId());
            
            pstm.execute();
            pstm.close();
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "ProdutoDAO " + erro);
        }
    }
}
