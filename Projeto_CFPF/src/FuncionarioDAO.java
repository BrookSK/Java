
import javax.swing.JOptionPane;


public class FuncionarioDAO {
    public void ImprimirFuncionario(funcionarioDTO objFuncionarioDTO){
        String nome, endereco, cidade, estado;
        double telefone;
        
        nome=objFuncionarioDTO.getNome();
        endereco=objFuncionarioDTO.getEndereco();
        cidade=objFuncionarioDTO.getCidade();
        estado=objFuncionarioDTO.getEstado();
        telefone=objFuncionarioDTO.getTelefone();
        
        JOptionPane.showInputDialog("Nome: "+nome+"\nCidade: "+cidade+"\nEstado: "+estado+"\nEndereço: "+endereco+"\nTelefone: "+telefone);
    }
}
