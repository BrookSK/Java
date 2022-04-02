
public class ProdutoDTO {
    private String nome;
    private double quantidade;
    private double valor;
    private float codbar;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setQuantidade(double quantidade) {
        this.quantidade = quantidade;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public void setCodbar(float codbar) {
        this.codbar = codbar;
    }

    public String getNome() {
        return nome;
    }

    public double getQuantidade() {
        return quantidade;
    }

    public double getValor() {
        return valor;
    }

    public float getCodbar() {
        return codbar;
    }
    
    
}
