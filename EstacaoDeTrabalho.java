import java.io.Serializable;
import javax.persistence.*;

@Entity
@Table(name = "ESTACAO_TRABALHO")
public class EstacaoDeTrabalho implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(name = "NOME")
    private String nome;
    
    @Column(name = "REDE")
    private String rede;
    
    // Construtores
    public EstacaoDeTrabalho() {
    }
    
    public EstacaoDeTrabalho(String nome, String rede) {
        this.nome = nome;
        this.rede = rede;
    }
    
    // Getters e Setters
    public Long getId() {
        return id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }
    
    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String getRede() {
        return rede;
    }
    
    public void setRede(String rede) {
        this.rede = rede;
    }
    
    @Override
    public String toString() {
        return "EstacaoDeTrabalho [id=" + id + ", nome=" + nome + ", rede=" + rede + "]";
    }
}
