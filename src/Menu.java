import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;

public class Menu {
    private final BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public boolean mainMenu(LinkedList<Car> cars) throws IOException {
        System.out.println("""
                1. Новая машина
                2. Инфо по машине
                3. Вывести инфо по всей линейке авто
                4. Вывести инфо по всем авто
                5. Тест драйв
                Другое -- выход
                """);
        String menu = reader.readLine();
        boolean exit = true;
        switch (menu) {
            case "1" -> newCar(cars);
            case "2" -> carInfo(cars);
            case "3" -> seriesInfo(cars);
            case "4" -> allCarsInfo(cars);
            case "5" -> testDrive(cars);
            default -> exit = false;
        }
        return exit;
    }

    private void newCar(LinkedList<Car> cars) throws IOException {
        System.out.println("""
                Выберите марку машины:
                1. Део
                2. Ламба
                3. Жига
                Другая кнопка: Назад
                """);
        String menu = reader.readLine();
        switch (menu) {
            case "1" -> {
                Daewo daewo = new Daewo();
                daewo.setInfo();
                cars.add(daewo);
            }
            case "2" -> {
                Lamborgini lamba = new Lamborgini();
                lamba.setInfo();
                cars.add(lamba);
            }
            case "3" -> {
                Jiga jiga = new Jiga();
                jiga.setInfo();
                cars.add(jiga);
            }
            default -> {
            }
        }

    }

    private void carInfo(LinkedList<Car> cars) throws IOException {
        System.out.println("""
                Введите модель машины
                """);
        String menu = reader.readLine();
        cars.forEach(car -> {
            if (menu.equals(car.getModel())) car.dispInfo();
        });
    }

    private void seriesInfo(LinkedList<Car> cars) throws IOException {
        System.out.println("""
                Выберите марку машины:
                1. Део
                2. Ламба
                3. Жига
                Другая кнопка: Назад
                """);
        String menu = reader.readLine();
        switch (menu) {
            case "1" -> cars.forEach(car -> {
                if ("Daewo".equals(car.getClass().getName())) car.dispInfo();
            });
            case "2" -> cars.forEach(car -> {
                if ("Lamborgini".equals(car.getClass().getName())) car.dispInfo();
            });
            case "3" -> cars.forEach(car -> {
                if ("Jiga".equals(car.getClass().getName())) car.dispInfo();
            });
            default -> {
            }
        }
    }

    private void allCarsInfo(LinkedList<Car> cars) {
        cars.forEach(Car::dispInfo);
    }

    private void testDrive(LinkedList<Car> cars) throws IOException {
        System.out.println("""
                Введите модель машины
                """);
        String menu = reader.readLine();
        cars.forEach(car -> {
            if (menu.equals(car.getModel())) {
                try {
                    car.testDrive();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });

    }

}