
import javax.swing.JOptionPane;


public class Produto {
    public void imprimirProduto(String nome, double quantidade, double valor){
        JOptionPane.showMessageDialog(null, nome + " " + quantidade + " " + valor + " ");
    }
}
