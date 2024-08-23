
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Race race=new Race();
        Car[] cars=new Car[3];

        for (int i = 0; i < 3; i++) {
            System.out.println("Введите название машины №"+(i+1));
            String carName = scanner.next();
            System.out.println("Введите скорость машины №"+(i+1));
            int carSpeed=scanner.nextInt();
            while(!(carSpeed > 0 && carSpeed <= 250)) {
                System.out.println("Неправильная скорость");
                System.out.println("Введите скорость машины №"+(i+1));
                carSpeed  = scanner.nextInt();
            }

            cars[i]=new Car(carName, carSpeed);

        }


        race.bestCar(cars);
    }
}
