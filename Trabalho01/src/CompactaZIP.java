import java.io.File;
import java.io.FileOutputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class CompactaZIP {
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o nome do Arquivo: ");
        String name = entrada.nextLine();
        File arq = new File(name.concat(".zip"));

        FileOutputStream fos = new FileOutputStream(arq);
        ZipOutputStream zos = new ZipOutputStream(fos);

        zos.putNextEntry(new ZipEntry(arq.getName()));

        byte[] bytes = Files.readAllBytes(Paths.get(name));
        zos.write(bytes, 0, bytes.length);
        zos.closeEntry();
        zos.close();
        entrada.close();
    }
}