import java.util.List;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

@JacksonXmlRootElement(localName = "Steam")
public class Jogos {

    public Jogos(){}

    public Jogos(List<Jogo> jogos) {
        this.jogos = jogos;
    }

    public List<Jogo> getJogos() {
        return jogos;
    }
    @JacksonXmlElementWrapper(localName = "jogos")
    @JacksonXmlProperty(localName = "jogo")
    private List<Jogo> jogos;

    public void setJogos(List<Jogo> jogos) {
        this.jogos = jogos;
    }
    
    @Override
    public String toString() {
        return this.jogos.toString();
    }
}