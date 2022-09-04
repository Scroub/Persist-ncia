import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.List;
import java.util.ArrayList;
import java.io.FileOutputStream;

public class Serializa {
    public static void main(String[] args) throws IOException {
        Jogo jogo = new Jogo(4, "God Hand", "Sukuna", 5);
        Jogo nJogo = new Jogo(2, "Guitar Hero", "Iury", 2);

        List<Jogo> lista = new ArrayList<>();
        lista.add(jogo);
        lista.add(nJogo);
        
        try{
            FileOutputStream fo = new FileOutputStream("Jogos.txt");
            ObjectOutputStream out = new ObjectOutputStream(fo);
            out.writeObject(lista);
            out.close();
            System.out.println("Serializado");
        }catch(IOException i){
            i.printStackTrace();
        }
        
    }
}
