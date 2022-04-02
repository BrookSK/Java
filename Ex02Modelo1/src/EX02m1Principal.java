
import javax.swing.JOptionPane;


public class EX02m1Principal {
    
    public static void main(String[] args) {
        String nome;
        Double preco, qtde;
        
        nome = JOptionPane.showInputDialog("Digite o nome: ");
        //preco = double
        //      Double --> String (String --> usuario)
        preco = Double.parseDouble(JOptionPane.showInputDialog("Digite o Preço: "));
        qtde = Double.parseDouble(JOptionPane.showInputDialog("Digite a Quantidade: "));
        
        System.out.println("O NOME é: "+nome+"\nO PREÇO é: "+preco+"\nA QUANTIDADE é: "+qtde);
    }
    
}
