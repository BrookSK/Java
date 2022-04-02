
package DAO;

import DTO.cepDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;


public class cepDAO {
    Connection conn;
   PreparedStatement pstm;
       
public void cadastrarCEP(cepDTO objDTO){
    
   String sql = "insert into cep (rua,cep,bairro,cidade,uf) values (?,?,?,?,?)";
   
   conn = new Conexao().conectaBD();
   
    try {
        
        pstm=conn.prepareStatement(sql);
        pstm.setString(1, objDTO.getRua());
        pstm.setString(2, objDTO.getCEP());
         pstm.setString(2, objDTO.getBairro());
          pstm.setString(2, objDTO.getCidade());
           pstm.setString(2, objDTO.getUf());
        
        pstm.execute();
        pstm.close();
    } 
    catch (Exception erro) {
        JOptionPane.showMessageDialog(null, "cepDTO" + erro);
    }
    
}
    
}
