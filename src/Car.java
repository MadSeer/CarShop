import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

abstract class Car {
    // Я понял что нихуя не понял задание иу возможно у нас в голове
    // эта хуета выглядит совершенно по - разному. Я попробую сделать
    // это так, как я вижу

    // Для начала, я вспомнил что не стоит разбрасываться свойствами
    // методов направо и налево, а стоит им присвоить геттеры и сеттеры
    private String model;
    private double engineCapacity;
    private double tankCapacity;
    private final BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    private void setModel() throws IOException {
        System.out.println("Enter car model");
        this.model=reader.readLine();
    }
    private void setEngineCapacity() throws IOException {
        System.out.println("Enter engine capacity");
        this.engineCapacity = Double.parseDouble(reader.readLine());
    }
    private void setTankCapacity() throws IOException {
        System.out.println("Enter tank capacity");
        this.tankCapacity = Double.parseDouble(reader.readLine());
    }
    public void setInfo() throws IOException {
        setModel();
        setEngineCapacity();
        setTankCapacity();
    }
    public String getModel(){
        return this.model;
    }
    public void dispInfo() {
        System.out.println("Model: "+this.model);
        System.out.println("Engine capacity: " + this.engineCapacity);
        System.out.println("Tank capacity: " + this.tankCapacity);
    }

    public void testDrive() throws InterruptedException {
        openDoor();
        startEngine();
        drive();
        parking();
    }
    abstract void openDoor() throws InterruptedException;
    abstract void startEngine() throws InterruptedException;
    abstract void drive() throws InterruptedException;
    abstract void parking();



}
