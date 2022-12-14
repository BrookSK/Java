
import javax.swing.JOptionPane;


public class ProdutoPrincipal {
    
    public static void main(String[] args) {
        String nome;
        double quantidade, valor;
        
        nome = JOptionPane.showInputDialog("Digite o nome do Produto:");
        quantidade = Double.parseDouble(JOptionPane.showInputDialog("Digite o quantidade do Produto:"));
        valor = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do Produto:"));
        
        Produto objproduto = new Produto();
        objproduto.imprimirproduto(nome, quantidade, valor);
    }
    
}
