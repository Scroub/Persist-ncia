import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class Atv02 {
    public static void main(String[] args) throws IOException {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o Primeiro Arquivo:");
        String name1 = entrada.nextLine();
        System.out.println("Digite o Segundo Arquivo:");
        String name2 = entrada.nextLine();
        System.out.println("Digite o Arquivo que recebera os dois primeiros");
        String name3 = entrada.nextLine();
        
        InputStream is = new FileInputStream(name1);
        InputStream is2 = new FileInputStream(name2);
        Scanner ler = new Scanner(is);
        Scanner ler2 = new Scanner(is2);
        PrintStream ps = new PrintStream(name3);

        while(ler.hasNextLine() || ler2.hasNextLine()){
            if(ler.hasNextLine()){
                ps.println(ler.nextLine());
            }else{
                ps.println(ler2.nextLine());
            }
        }
        
        entrada.close(); is.close(); is2.close(); ler.close(); ler2.close(); ps.close();;
    }
}
