import java.io.*;
import java.util.Scanner;


public class Atv02 {
    public static void main(String[] args) throws IOException {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o nome do arquivo de Origem:");
        String name = entrada.nextLine();
        InputStream is = new FileInputStream(name + ".txt");
        Scanner ler = new Scanner(is);
        
        System.out.println("Digite o nome do arquivo de Destino");
        String name2 = entrada.nextLine();
        PrintStream ps = new PrintStream(name2 + ".txt");

        while(ler.hasNextLine()){
            ps.println(ler.nextLine());
        }
    }
}
