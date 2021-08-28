
import javax.swing.JOptionPane;


public class ProdutoPrincipal {
    
    public static void main(String[] args) {
        String nome;
        double quantidade, valor;
        
        //              caixa-digitação
        nome=JOptionPane.showInputDialog("Digite o nome: ");
        quantidade=Double.parseDouble(JOptionPane.showInputDialog("Digite a quantidade do produto: "));
        valor=Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do produto: "));
        
        Produto objProduto = new Produto();
        objProduto.ImprimirProduto(nome, valor, quantidade);
        
    }
    
}
