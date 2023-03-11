import static java.lang.Thread.sleep;

public class Jiga extends Car{
    @Override
    void openDoor() throws InterruptedException {
        System.out.println("You open the door sideways");
        sleep(200);
    }

    @Override
    void startEngine() throws InterruptedException {
        System.out.println("You start engine");
        for (int i = 0;i<12;i++){
            System.out.println("*brr*");
            sleep(500);
        }
    }

    @Override
    void drive() throws InterruptedException {
        System.out.println("You drive the car");
        for (int i = 0;i<20;i++){
            System.out.print("-");
            sleep(350);
        }
        System.out.println();
    }

    @Override
    void parking() {
        System.out.println("You stop the car and put the handbrake on");
    }

}
