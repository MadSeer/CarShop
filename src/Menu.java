import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Menu {
    private final BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public void mainMenu(HashMap<Integer, Daewo> daewoMap,
                         HashMap<Integer, Lamborgini> lambaMap,
                         HashMap<Integer, Jiga> jigaMap) throws IOException, InterruptedException {
        System.out.println("""
                1. Новая машина
                2. Инфо по машине
                3. Вывести инфо по всей линейке авто
                4. Вывести инфо по всем авто
                5. Тест драйв
                """);
        String menu = reader.readLine();
        switch (menu) {
            case "1" -> newCar(daewoMap, lambaMap, jigaMap);
            case "2" -> carInfo(daewoMap,lambaMap,jigaMap);
            case "3" -> seriesInfo(daewoMap,lambaMap,jigaMap);
            case "4" -> allCarsInfo(daewoMap,lambaMap,jigaMap);
            case "5" -> testDrive(daewoMap,lambaMap,jigaMap);
            default -> {
            }
        }
    }

    private void newCar(HashMap<Integer, Daewo> daewoMap,
                        HashMap<Integer, Lamborgini> lambaMap,
                        HashMap<Integer, Jiga> jigaMap) throws IOException {
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
                daewoMap.put(daewoMap.size(), daewo);
            }
            case "2" -> {
                Lamborgini lamba = new Lamborgini();
                lamba.setInfo();
                lambaMap.put(lambaMap.size(), lamba);
            }
            case "3" -> {
                Jiga jiga = new Jiga();
                jiga.setInfo();
                jigaMap.put(jigaMap.size(), jiga);
            }
            default -> {
            }
        }

    }
    private void carInfo(HashMap<Integer, Daewo> daewoMap,
                         HashMap<Integer, Lamborgini> lambaMap,
                         HashMap<Integer, Jiga> jigaMap) throws IOException {
        System.out.println("""
                Выберите марку машины:
                1. Део
                2. Ламба
                3. Жига
                Другая кнопка: Назад
                """);
        String menu = reader.readLine();
        int num;
        switch (menu) {
            case "1" -> {
                Daewo daewo;
                System.out.println("Введите номер");
                num = Integer.parseInt(reader.readLine());
                daewo = daewoMap.get(num);
                daewo.dispInfo();
            }
            case "2" -> {
                Lamborgini lamba;
                System.out.println("Введите номер");
                num = Integer.parseInt(reader.readLine());
                lamba = lambaMap.get(num);
                lamba.dispInfo();
            }
            case "3" -> {
                Jiga jiga;
                System.out.println("Введите номер");
                num = Integer.parseInt(reader.readLine());
                jiga = jigaMap.get(num);
                jiga.dispInfo();
            }
            default -> {
            }
        }
    }
    private void seriesInfo(HashMap<Integer, Daewo> daewoMap,
                         HashMap<Integer, Lamborgini> lambaMap,
                         HashMap<Integer, Jiga> jigaMap) throws IOException {
        System.out.println("""
                Выберите марку машины:
                1. Део
                2. Ламба
                3. Жига
                Другая кнопка: Назад
                """);
        String menu = reader.readLine();
        switch (menu) {
            case "1" -> daewoMap.forEach((key,value) -> {
                value.dispInfo();
                System.out.println();
            });
            case "2" -> lambaMap.forEach((key,value) -> {
                value.dispInfo();
                System.out.println();
            });
            case "3" -> jigaMap.forEach((key,value) -> {
                value.dispInfo();
                System.out.println();
            });
            default -> {
            }
        }
    }
    private void allCarsInfo(HashMap<Integer, Daewo> daewoMap,
                             HashMap<Integer, Lamborgini> lambaMap,
                             HashMap<Integer, Jiga> jigaMap){
        daewoMap.forEach((key,value) -> {
            value.dispInfo();
            System.out.println();
        });
        lambaMap.forEach((key,value) -> {
            value.dispInfo();
            System.out.println();
        });
        jigaMap.forEach((key,value) -> {
            value.dispInfo();
            System.out.println();
        });
    }
    private void testDrive(HashMap<Integer, Daewo> daewoMap,
                           HashMap<Integer, Lamborgini> lambaMap,
                           HashMap<Integer, Jiga> jigaMap) throws IOException, InterruptedException {
        System.out.println("""
                Выберите марку машины:
                1. Део
                2. Ламба
                3. Жига
                Другая кнопка: Назад
                """);
        String menu = reader.readLine();
        int num;
        switch (menu) {
            case "1" -> {
                Daewo daewo;
                System.out.println("Введите номер");
                num = Integer.parseInt(reader.readLine());
                daewo = daewoMap.get(num);
                daewo.testDrive();
            }
            case "2" -> {
                Lamborgini lamba;
                System.out.println("Введите номер");
                num = Integer.parseInt(reader.readLine());
                lamba = lambaMap.get(num);
                lamba.testDrive();
            }
            case "3" -> {
                Jiga jiga;
                System.out.println("Введите номер");
                num = Integer.parseInt(reader.readLine());
                jiga = jigaMap.get(num);
                jiga.testDrive();
            }
            default -> {
            }
        }
    }

}