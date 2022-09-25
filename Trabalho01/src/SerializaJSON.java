import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

public class SerializaJSON {
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Para adicionar use add id nome Personagem dificuldade categoria \n" 
                         + "Para finalizar use o comando end");

        List<Jogos> lista = new ArrayList<Jogos>();

        while(true){
            String line = entrada.nextLine();
            String[] ui = line.split(" ");

            if(ui[0].equals("add")){
                lista.add(new Jogos(Integer.parseInt(ui[1]), ui[2], ui[3], Integer.parseInt(ui[4]) , ui[5]));
                System.out.println("Novo jogo adicionado");
            }if(ui[0].equals("end")){
                System.out.println("Fim do programa");
                break;
            }
        }

        ArrayJogos jgs = new ArrayJogos(lista);
        File arq = new File("Jogos.json");
        ObjectMapper om = new ObjectMapper();
        om.enable(SerializationFeature.INDENT_OUTPUT);
        om.writeValue(arq, jgs);
        System.out.println("Serializado");
        entrada.close();
    }
}
