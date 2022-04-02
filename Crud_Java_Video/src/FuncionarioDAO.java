
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class FuncionarioDAO {
    
    Connection conn;
    PreparedStatement pstm;
    
    public void cadastrarFuncionario(FuncionarioDTO objFuncionarioDTO){
       String sql = "insert into tb_funcionario (nome_funcionario, endereco_funcionario) values (?,?)";
       conn = new ConexaoDAO().conectaBD();
       
        try {
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, objFuncionarioDTO.getNome_funcionario());
            pstm.setString(2, objFuncionarioDTO.getEndereco_funcionario());
            
            pstm.execute();
            pstm.close();
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "FuncionarioDAO " + erro);
        }
    }
    
    public ResultSet ListaBusca (FuncionarioDTO objFuncionarioDTO){
   
        try {
            String sql="SELECT * FROM tb_funcionario";

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
    
    public void AlterarFuncionario(FuncionarioDTO objFuncionarioDTO){
       String sql = "update tb_funcionario set nome_funcionario = ?, endereco_funcionario = ? where id_funcionario = ?";
       conn = new ConexaoDAO().conectaBD();
       
        try {
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, objFuncionarioDTO.getNome_funcionario());
            pstm.setString(2, objFuncionarioDTO.getEndereco_funcionario());
            pstm.setInt(3, objFuncionarioDTO.getId_funcionario());
            
            pstm.execute();
            pstm.close();
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "FuncionarioDAO " + erro);
        }
    }
    
    public void ExcluirFuncionario(FuncionarioDTO objFuncionarioDTO){
       String sql = "delete from tb_funcionario where id_funcionario = ?";
       conn = new ConexaoDAO().conectaBD();
       
        try {
            pstm = conn.prepareStatement(sql);
            pstm.setInt(1, objFuncionarioDTO.getId_funcionario());
            
            pstm.execute();
            pstm.close();
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "FuncionarioDAO " + erro);
        }
    }
}
