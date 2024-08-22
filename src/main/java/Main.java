
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Race race=new Race();

        for (int i = 0; i < 3; i++) {
            System.out.print("Введите название машины №"+(i+1));
            String carName = scanner.next();
            System.out.print("Введите скорость машины №"+(i+1));
            int carSpeed=scanner.nextInt();
            while(!(carSpeed > 0 && carSpeed <= 250)) {
                System.out.println("Неправильная скорость");
                System.out.print("Введите скорость машины №"+(i+1));
                carSpeed  = scanner.nextInt();
            }


            race=new Race(new Car(carName, carSpeed));
        }


        race.bestCar();
    }
}
