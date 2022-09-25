import java.io.File;
import java.io.Writer;
import java.util.Scanner;
import java.nio.file.Files;
import java.nio.file.Paths;

import com.opencsv.bean.StatefulBeanToCsv;
import com.opencsv.bean.StatefulBeanToCsvBuilder;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import com.opencsv.exceptions.CsvDataTypeMismatchException;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.opencsv.exceptions.CsvRequiredFieldEmptyException;

public class ConverterCSVXML{
    public static void main(String[] args) throws Exception, CsvDataTypeMismatchException, CsvRequiredFieldEmptyException {
        Scanner entrada = new Scanner(System.in);
        System.out.printf("Informe o Nome do arquivo.json para converter em Xml e Csv\n");
         
        File arq = new File(entrada.next());
        ObjectMapper om = new ObjectMapper();
        ArrayJogos jogos = om.readValue(arq, ArrayJogos.class);

        File arq1 = new File("Jogos.xml");
        XmlMapper xm = new XmlMapper();
        xm.enable(SerializationFeature.INDENT_OUTPUT);
        xm.writeValue(arq1, jogos);

        Writer writer = Files.newBufferedWriter(Paths.get("Jogos.csv"));
        StatefulBeanToCsv<ArrayJogos> beanToCsv = new StatefulBeanToCsvBuilder<ArrayJogos>(writer).build();
        beanToCsv.write(jogos);

        writer.flush();
        writer.close();
        entrada.close();
    }
}
