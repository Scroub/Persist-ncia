import java.io.Serializable;

public class Jogos implements Serializable{
    private int id;
    private String nome;
    private String Personagem;
    private int dificuldade;
    private String categoria;

    public Jogos(){

    }

    public Jogos(int id, String nome, String Personagem, int dificuldade, String categoria){
        this.id = id;
        this.nome = nome;
        this.Personagem = Personagem;
        this.dificuldade = dificuldade;
        this.categoria = categoria;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPersonagem() {
        return Personagem;
    }

    public void setPersonagem(String personagem) {
        Personagem = personagem;
    }

    public int getDificuldade() {
        return dificuldade;
    }

    public void setDificuldade(int dificuldade) {
        this.dificuldade = dificuldade;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String toString() {
        return "Jogo [id:" + id + ", Nome: " + nome + ", Personagem: " + Personagem + ", Dificuldade: " + dificuldade + ", Categoria: " + categoria + "]";  
    }
    
}
