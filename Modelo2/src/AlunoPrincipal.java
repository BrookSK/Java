
import javax.swing.JOptionPane;


public class AlunoPrincipal {
    
    public static void main(String[] args) {
        String nome, rg;
        nome=JOptionPane.showInputDialog("Digite o nome: ");
        rg=JOptionPane.showInputDialog("Digite o RG: ");
        
        //enviar o valor do nome para a classe java
        //nomeDaClasse nomeDoObj = construtor nomeDaClasse();
        //instanciar a classe. criando um obj
        Aluno objaluno = new Aluno();
        objaluno.imprimirNomeRg(nome, rg);
    }
    
}
