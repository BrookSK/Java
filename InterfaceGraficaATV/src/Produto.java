
import javax.swing.JOptionPane;


public class Produto {
    public void imprimirProduto(String nome, double quantidade, double valor, float codbar, float ncm){
        JOptionPane.showMessageDialog(null, nome + "\n" + quantidade + "\n" + valor + "\n" + codbar + "\n" + ncm);
    }
    
    public void imprimirCliente(String nome, double cpf, double rg, String endereco, double telefone, String cidade, String estado, String email){
        JOptionPane.showMessageDialog(null, nome + "\n" + cpf + "\n" + rg + "\n" + endereco + "\n" + telefone + "\n" + cidade + "\n" + estado + "\n" + email);
    }
    
    public void imprimirFuncionario(String nome, double cpf, double rg, String endereco, double telefone, String cidade, String estado, String email, String categoria){
        JOptionPane.showMessageDialog(null, nome + "\n" + cpf + "\n" + rg + "\n" + endereco + "\n" + telefone + "\n" + cidade + "\n" + estado + "\n" + email + "\n" + categoria);
    }
    
    public void imprimirFornecedor(String razaosocial, double cnpj, double ie, String endereco, double telefone, String cidade, String estado, String email){
        JOptionPane.showMessageDialog(null, razaosocial + "\n" + cnpj + "\n" + ie + "\n" + endereco + "\n" + telefone + "\n" + cidade + "\n" + estado + "\n" + email);
    }
}
