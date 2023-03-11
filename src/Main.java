import java.io.IOException;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {

        Menu menu = new Menu();

        HashMap<Integer,Jiga> jigaMap = new HashMap<>();
        HashMap<Integer,Daewo> daewoMap = new HashMap<>();
        HashMap<Integer,Lamborgini> lambaMap = new HashMap<>();

        while (true){
            menu.mainMenu(daewoMap,lambaMap,jigaMap);
        }
    }
}