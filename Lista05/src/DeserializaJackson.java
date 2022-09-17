import java.io.File;

import com.fasterxml.jackson.databind.ObjectMapper;

public class DeserializaJackson{
    public static void main(String[] args) throws Exception{
        File arq = new File("jogos.json");
        Jogos jg = new ObjectMapper().readValue(arq, Jogos.class);
        System.out.println(jg);
    }
}
