import static java.lang.Thread.sleep;

public class Lamborgini extends Car{
    @Override
    void openDoor() throws InterruptedException {
        System.out.println("You open the door upwards");
        sleep(3000);
    }

    @Override
    void startEngine() throws InterruptedException {
        System.out.println("You start engine");
        for (int i = 0;i<3;i++){
            System.out.println("*wrr*");
            sleep(500);
        }
    }

    @Override
    void drive() throws InterruptedException {
        System.out.println("You drive the car");
        for (int i = 0;i<20;i++){
            System.out.print("-");
            sleep(50);
        }
        System.out.println();
    }

    @Override
    void parking() {
        System.out.println("You stop the car and give it to the valet");
    }
}
