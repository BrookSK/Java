
import javax.swing.JOptionPane;


public class ClienteDAO {
    public void ImprimirCliente(ClienteDTO objClienteDTO){
        String nome;
        
        nome=objClienteDTO.getNome();
        
        JOptionPane.showInputDialog("Nome: "+nome);
    }
}
