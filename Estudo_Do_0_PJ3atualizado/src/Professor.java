
import javax.swing.JOptionPane;

public class Professor {
    public void imprimirnovosalario(double salario){
        double novosalario = salario * 1.50;
        JOptionPane.showMessageDialog(null, novosalario);
        
        if(novosalario < 1000){
            JOptionPane.showMessageDialog(null, "Precisa trabalhar mais");
        }else{
            JOptionPane.showMessageDialog(null, "Show de bola !!!");
        }
    }
}
