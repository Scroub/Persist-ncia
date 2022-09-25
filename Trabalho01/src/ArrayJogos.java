import java.util.List;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

@JacksonXmlRootElement(localName = "ListaDeJogos")
public class ArrayJogos {
    private List<Jogos> jogos;

    public ArrayJogos(){
    }

    public ArrayJogos(List<Jogos> jogos) {
        this.jogos = jogos;
    }

    @JacksonXmlElementWrapper(localName = "Jogos")
    @JacksonXmlProperty(localName = "Jogo")

    public List<Jogos> getJogos() {
        return jogos;
    }

    public void setJogos(List<Jogos> jogos) {
        this.jogos = jogos;
    }

    @Override
    public String toString() {
        return this.jogos.toString();        
    }

}