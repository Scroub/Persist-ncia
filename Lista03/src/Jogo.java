public class Jogo implements java.io.Serializable{
    private int id;
    private String nome;
    private String Personagem;
    private int dificuldade;
    
    Jogo(int id, String nome, String Personagem, int dificuldade){
        this.id = id;
        this.nome = nome;
        this.Personagem = Personagem;
        this.dificuldade = dificuldade;
    }

    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id = id;
    } 

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    } 

    public String getPersonagem(){
        return Personagem;
    }

    public void setPersonagem(String Personagem){
        this.Personagem = Personagem;
    } 

    public int getDificuldade() {
        return dificuldade;
    }

    public void setDificuldade(int dificuldade) {
        this.dificuldade = dificuldade;
    }

    public String toString() {
        return "Jogo [id:" + id + ", Nome: " + nome + ", Personagem " + Personagem + ", Dificuldade " + dificuldade + "]";  
    }
}
