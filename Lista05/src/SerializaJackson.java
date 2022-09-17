import java.io.File;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

public class SerializaJackson {
    public static void main(String[] args) throws Exception {
        Jogo jg1 = new Jogo(4, "God Hand", "Sukuna", 5);
        Jogo jg2 = new Jogo(2, "Guitar Hero", "Iury", 2);
        List<Jogo> lista = new ArrayList<Jogo>();
        lista.add(jg1);
        lista.add(jg2);

        Jogos jogos = new Jogos(lista);
        File arq = new File("jogos.json");

        ObjectMapper om = new ObjectMapper();
        om.enable(SerializationFeature.INDENT_OUTPUT);
        om.writeValue(arq, jogos);

    }
}
