
import javax.swing.JOptionPane;


public class EX1m1Principal {
    
    public static void main(String[] args) {
        String nome, rg, cpf;
        
        nome = JOptionPane.showInputDialog("Digite o nome: ");
        rg=JOptionPane.showInputDialog("Digite o RG: ");
        cpf=JOptionPane.showInputDialog("Digite o CPF: ");
        
        System.out.println("O NOME é: "+nome+"\nO RG é: "+rg+"\nO CPF é: "+cpf);
    }
    
}
