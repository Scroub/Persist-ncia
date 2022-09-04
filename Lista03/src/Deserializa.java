import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.List;

public class Deserializa{
    public static void main(String [] args) throws IOException{
        try{
            FileInputStream is = new FileInputStream("Jogos.txt");
            ObjectInputStream Ois = new ObjectInputStream(is);
            List<Jogo> jogos = (List<Jogo>) Ois.readObject();
            System.out.println(jogos);
            Ois.close();


        }catch(Exception i){
            i.printStackTrace();
        }
    }
}