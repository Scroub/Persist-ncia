import java.io.File;

import com.fasterxml.jackson.dataformat.xml.XmlMapper;

public class DeserializaXML{
    public static void main(String[] args) throws Exception{
        File arq = new File("jogos.xml");
        XmlMapper xmlMapper = new XmlMapper();
        Jogos jg = xmlMapper.readValue(arq, Jogos.class);
        System.out.println(jg);
    }
}
