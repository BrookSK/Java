
package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;




public class Conexao {
   
    public Connection conectaBD(){  
    Connection conn = null;
    
        try {
         String url = "jdbc:mysql://localhost:3306/bd_cep?user=root&password=";
         conn = DriverManager.getConnection(url);
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Conexão"+e.getMessage());
        }
        return conn;
    }
            
     
}


