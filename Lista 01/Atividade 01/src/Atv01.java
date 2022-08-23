import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

public class Atv01 {
    public static void main(String[] args) throws IOException {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Nome do Arquivo:");
        String name = entrada.nextLine();
        InputStream is = new FileInputStream(name + ".txt");
        Scanner ler = new Scanner(is);

        Scanner numero = new Scanner(System.in);
        System.out.println("Digite a linha inicial:");
        String line = numero.nextLine();
        int n1 = line.isEmpty() ? 1: Integer.parseInt(line);
        System.out.println("Digite a linha Final:");
        Scanner numero2 = new Scanner(System.in);
        String lines = numero2.nextLine();
        int n2 = lines.isEmpty() ? 1: Integer.parseInt(lines);

        int count = 1;
        while(ler.hasNextLine()){
            if(count >= n1 && count <= n2){
                System.out.println(ler.nextLine());
            }else if(count >= n1 && n1 >= n2){
                System.out.println(ler.nextLine());
            }else if(n2 < n1 && n2 != 1){
                System.out.println("Linha Final é menor que a linha inicial");
                break;
            }if(count < n1){
                ler.nextLine();
            }
            count ++;
        }

        entrada.close();
        ler.close();
        numero.close();
        numero2.close();
    }
}
