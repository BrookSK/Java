
import javax.swing.JOptionPane;


public class FornecedorDAO {
    public void ImprimirFornecedor(FornecedorDTO objFornecedorDTO){
        String razaosocial, endereco, cidade, estado, email;
        double telefone;
        
        razaosocial=objFornecedorDTO.getRazaosocial();
        endereco=objFornecedorDTO.getEndereco();
        cidade=objFornecedorDTO.getCidade();
        estado=objFornecedorDTO.getEstado();
        email=objFornecedorDTO.getEmail();
        telefone=objFornecedorDTO.getTelefone();
        
        JOptionPane.showInputDialog("Razão Social: "+razaosocial+"\nCidade: "+cidade+"\nEstado: "+estado+"\nEndereço: "+endereco+"\nTelefone: "+telefone+"\nE-mail: "+email);
    }
}
