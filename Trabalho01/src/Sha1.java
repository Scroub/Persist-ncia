import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Scanner;
import org.apache.commons.codec.digest.DigestUtils;

public class Sha1{
    public static void main(String[] args)throws Exception {
        
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o nome do arquivo: ");
        String arq = entrada.nextLine();

        InputStream is = new FileInputStream(arq);
        String sha1Value = DigestUtils.sha1Hex(is);
        System.out.println("Hash = [" + sha1Value + "]");
        entrada.close();
    }   
}
