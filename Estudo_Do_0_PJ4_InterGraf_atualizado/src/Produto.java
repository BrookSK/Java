
import javax.swing.JOptionPane;

public class Produto {
    public void imprimirpruduto(String nome, double quantidade, double valor){
        JOptionPane.showMessageDialog(null, "Nome do Produto: " + nome + "\nQuantidade do Produto: " + quantidade + "\nValor do Produto: " + valor);
    }
}
