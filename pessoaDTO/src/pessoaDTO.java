
import javax.swing.JOptionPane;

public class pessoaDTO {
    private String nome, endereco, cidade, estado, telefone;
    
    public void setNome(String nome, String endereco, String cidade, String estado, String telefone){
        this.nome = nome;
        this.endereco = endereco;
        this.cidade = cidade;
        this.estado = estado;
        this.telefone = telefone;
        
        JOptionPane.showMessageDialog(null, nome + "\n" + endereco + "\n" + telefone + "\n" + cidade + "\n" + estado);
    }
    
    public String getNome(){
        return nome;
    }
    
    public void setEndereco(){
        this.endereco = endereco;
    }
    
    public String getEndereco(){
        return endereco;
    }
    
    public void setCidade(){
        this.cidade = cidade;
    }
    
    public String getCidade(){
        return cidade;
    }
    
    public void setEstado(){
        this.estado = estado;
    }
    
    public String getEstado(){
        return estado;
    }
    
    public void setTelefone(){
        this.telefone = telefone;
    }
    
    public String getTelefone(){
        return telefone;
    }
}
