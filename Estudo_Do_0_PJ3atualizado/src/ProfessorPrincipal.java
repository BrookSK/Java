
import javax.swing.JOptionPane;


public class ProfessorPrincipal {
    
    public static void main(String[] args) {
        double salario;
        
        salario = Double.parseDouble(JOptionPane.showInputDialog("Digite o Salário: "));
        
        Professor objprofessor = new Professor();
        objprofessor.imprimirnovosalario(salario);
    }
    
}
