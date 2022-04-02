
import javax.swing.JOptionPane;


public class ClienteDAO {
    public void ImprimirCliente(ClienteDTO objClienteDTO){
        String nome, endereco, cidade, estado, telefone;
        
        nome=objClienteDTO.getNome();
        endereco=objClienteDTO.getEndereco();
        cidade=objClienteDTO.getCidade();
        estado=objClienteDTO.getEstado();
        telefone=objClienteDTO.getTelefone();
        
        JOptionPane.showInputDialog("Nome: "+nome+"\nCidade: "+cidade+"\nEstado: "+estado+"\nEndereço: "+endereco+"\nTelefone: "+telefone);
    }
}
