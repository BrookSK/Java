
public class ProdutoPrincipal {
    
    public static void main(String[] args) {
        String nome;
        double quantidade, valor;
        
        nome = "Pão";
        quantidade = 10;
        valor = 2;
        
        //nomedaclasse nomedoobjeto = contrutor nomedaclasse();
          Produto objproduto = new Produto();
          objproduto.imprimirProduto(nome, quantidade, valor);
    }
    
}
