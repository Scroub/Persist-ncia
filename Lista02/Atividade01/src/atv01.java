import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

public class atv01 {
    public static void main(String[] args) throws IOException {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o nome do Arquivo:");
        String name = entrada.nextLine();
        System.out.println("Digite a SubString:");
        String subs = entrada.nextLine();
        InputStream is = new FileInputStream(name);
        Scanner ler = new Scanner(is);

        while(ler.hasNextLine()){
            String line = ler.nextLine();
            if(line.contains(subs)){
                System.out.println(line);
            }
        }
        entrada.close();
        ler.close(); 
    }
}
