
import javax.swing.JOptionPane;


public class ReajPrincipal {
    
    public static void main(String[] args) {
        double salario, aumento = 0, reajuste = 0;
        
        salario=Double.parseDouble(JOptionPane.showInputDialog("Digite o salário"));
        
        Reaj objreajustado = new Reaj();
        objreajustado.imprimirCont(aumento, reajuste, salario);
    }
    
}
