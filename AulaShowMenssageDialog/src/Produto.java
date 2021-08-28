
import javax.swing.JOptionPane;


public class Produto {
    public void ImprimirProduto(String nome, double valor, double quantidade){
        JOptionPane.showMessageDialog(null, nome + " " + quantidade + " " + valor + " ");
    }
}
