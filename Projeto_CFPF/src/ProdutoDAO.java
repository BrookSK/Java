
import javax.swing.JOptionPane;


public class ProdutoDAO {
    public void ImprimirProduto(ProdutoDTO objProdutoDTO){
        String nome;
        double quantidade, valor;
        float codbar;
        
        nome=objProdutoDTO.getNome();
        quantidade=objProdutoDTO.getQuantidade();
        valor=objProdutoDTO.getValor();
        codbar=objProdutoDTO.getCodbar();
        
        JOptionPane.showInputDialog("Nome: "+nome+"\nQuantidade: "+quantidade+"\nValor: "+valor+"\nCodigo de Barras: "+codbar);
    }
}
