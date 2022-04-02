
import javax.swing.JOptionPane;


public class EX02m2Principal {
    
    public static void main(String[] args) {
        String nome;
        Double preco, qtde;
        
        nome = JOptionPane.showInputDialog("Digite o nome: ");
        preco = Double.parseDouble(JOptionPane.showInputDialog("Digite o Preço: "));
        qtde = Double.parseDouble(JOptionPane.showInputDialog("Digite a Quantidade: "));
        
        EX02m2 objDados=new EX02m2();
        objDados.imprimirDados(nome, preco, qtde);
    }
    
}
