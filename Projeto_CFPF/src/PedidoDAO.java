
import javax.swing.JOptionPane;

public class PedidoDAO {
    public void imprimirPedido(PedidoDTO objPedidoDTO){
        
        double quantidade, valor;     
        
        quantidade=objPedidoDTO.getQuantidade();
        valor=objPedidoDTO.getValor();
        JOptionPane.showInputDialog("Quantidade: " +quantidade+ "\nValor: " +valor);
    }
}
