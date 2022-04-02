
import javax.swing.JOptionPane;


public class EX1m2Principal {
    
    public static void main(String[] args) {
        String nome, rg, cpf;
        
        nome = JOptionPane.showInputDialog("Digite o nome: ");
        rg=JOptionPane.showInputDialog("Digite o RG: ");
        cpf=JOptionPane.showInputDialog("Digite o CPF: ");
        
        EX1m2 objDados = new EX1m2();
        objDados.imprimirDados(nome, rg, cpf);
    }
    
}
