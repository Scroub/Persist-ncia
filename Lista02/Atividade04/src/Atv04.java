import java.io.*;
import java.util.Properties;
import java.util.Scanner;

public class Atv04 {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        Properties config = new Properties();
        String arquivo = "Lista02\\Atividade04\\resources\\config.properties";
        config.load(new FileInputStream(arquivo));
    
        InputStream is = new FileInputStream(config.getProperty("arquivo"));
        Scanner ler = new Scanner(is);

        int n1 = Integer.parseInt(config.getProperty("linha_inicial"));
        int n2 = Integer.parseInt(config.getProperty("linha_final"));
        int count = 0;
        
        while(ler.hasNextLine()){
            if(count >= n1 && count <= n2){
                System.out.println(ler.nextLine());
            }else if(count < n1){
                ler.nextLine();
            }else if(n2 < n1){
                System.out.println("A Linha Inicial é Maior que a Linha Final");
                break;
            }
            count++;
        }
    ler.close();
    }
}