
import javax.swing.JOptionPane;


public class ContPrincipal {
    
    public static void main(String[] args) {
        double v1, v2, som = 0, sub = 0, mult = 0, div = 0;

        v1=Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro valor: "));
        v2=Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo valor: "));
        //nomeDaClasse nomeDoObj = construtor nomeDaClasse();
        //instanciar a classe. criando um obj
        Cont objContador = new Cont();
        objContador.imprimirCont(som, sub, mult, div, v1, v2);
        
    }
    
}
