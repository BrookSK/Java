
import javax.swing.JOptionPane;


public class Teste {
    
    public static void main(String[] args) {
        Double v1, v2, v3, med;
        
        v1=Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro valor: "));
        v2=Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo valor: "));
        v3=Double.parseDouble(JOptionPane.showInputDialog("Digite o terceiro valor: "));
        
        med=(v1+v2+v3)/3;
        
        System.out.println("Valor 1: " + v1 + "\n" + "Valor 2: " + v2 + "\n" + "Valor 3: " + v3 + "\nMédia: " + med);
        
    }
    
}
