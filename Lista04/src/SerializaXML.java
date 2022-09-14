import java.io.File;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

public class SerializaXML {
    public static void main(String[] args) throws Exception {
        Jogo jg1 = new Jogo(4, "God Hand", "Sukuna", 5);
        Jogo jg2 = new Jogo(2, "Guitar Hero", "Iury", 2);
        List<Jogo> lista = new ArrayList<Jogo>();
        lista.add(jg1);
        lista.add(jg2);

        Jogos jogos = new Jogos(lista);
        File arq = new File("jogos.xml");

        XmlMapper xm = new XmlMapper();
        xm.enable(SerializationFeature.INDENT_OUTPUT);
        xm.writeValue(arq, jogos);

    }
}
