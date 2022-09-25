import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.Scanner;

public class Sha1{
    public static void main(String[] args)throws Exception {
        
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o nome do arquivo: ");
        String arq = entrada.nextLine();
       
        MessageDigest digestm = MessageDigest.getInstance("sha-1");
        digestm.update(arq.getBytes());

        String sha1 = new BigInteger(1,digestm.digest()).toString(16);
        System.out.println("hash = " + sha1);
        entrada.close();
    }   
}
