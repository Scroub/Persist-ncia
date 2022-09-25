import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class CompactarZIP {
    public static void main(String[] ags) throws IOException{
        try (Scanner entrada = new Scanner(System.in)) {
            int buff = 4096;
            int cont;
            byte[] qtd = new byte[buff];

            System.out.println("Digite o nome do Arquivo: ");
            String nome = entrada.nextLine();
            File file = new File(nome);
            String ArqEnt = file.getName().concat(".zip");

            FileOutputStream destino = new FileOutputStream(new File(ArqEnt));
            ZipOutputStream saida = new ZipOutputStream(new BufferedOutputStream(destino));
            InputStream is = new FileInputStream(ArqEnt);
            BufferedInputStream origem = new BufferedInputStream(is, buff);
            ZipEntry entry = new ZipEntry(file.getName());
            saida.putNextEntry(entry);

            while ((cont = origem.read(qtd, 0, buff)) != -1) {
                saida.write(qtd, 0, cont);
            }
            
            origem.close();
            saida.close();
        }
    }
}




/* import java.io.IOException;
import java.util.Scanner;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class compactarZIP{
    public static void main(String arqSaida, String arqEntrada) throws IOException {
        Scanner entrada = new Scanner(System.in);
        int buff = 4096;
        int cont;
        byte[] qtd = new byte[buff];

        System.out.println("Digite o nome do Arquivo: ");
        String nome = entrada.nextLine();
        File file = new File(nome);
        String Arq = file.getName().concat(".zip");

        BufferedInputStream origem = null;
        FileInputStream streamDeEntrada = null;
        FileOutputStream destino = null;
        ZipOutputStream saida = null;
        ZipEntry entry = null;

        
            destino = new FileOutputStream(new File(arqSaida));
            saida = new ZipOutputStream(new BufferedOutputStream(destino));
            File arq = new File(arqEntrada);
            streamDeEntrada = new FileInputStream(arq);
            origem = new BufferedInputStream(streamDeEntrada, buff);
            entry = new ZipEntry(arq.getName());
            saida.putNextEntry(entry);
    
            while ((cont = origem.read(qtd, 0, buff)) != -1) {
                saida.write(qtd, 0, cont);
            }
            origem.close();
            saida.close();
        
    }


*/




   

    

   

