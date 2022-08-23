import java.io.*;

public class Atv02 {
    public static void main(String[] args) throws IOException {
        System.out.println("Digite o Nome do Arquivo Origem:");
        InputStream is = new FileInputStream(args[0]);
        System.out.println("Digite o Nome do Arquivo Destino:");
        OutputStream os = new FileOutputStream(args[1]);
        
        int x = is.read();

        while(x >= -1){
            try{
                os.write(x);
                x = is.read();
            }catch (IOException e){
                System.out.println(e.toString());
            }
        }

        System.out.println("Deu certo");
        
        is.close();
        os.close();
    }
}
