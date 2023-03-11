import java.io.IOException;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) throws IOException {

        Menu menu = new Menu();

        LinkedList<Car> cars = new LinkedList<>();
        boolean exit = true;
        while (exit) {
            exit = menu.mainMenu(cars);
        }
    }
}