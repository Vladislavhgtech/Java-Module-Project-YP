public class Race {
    private final Car[] cars=new Car[3];

    public Race(Car car1, Car car2, Car car3) {
        cars[0] = car1;
        cars[1] = car2;
        cars[2] = car3;
    }


    public int getDistance (Car car) {

        return car.getSpeed()*24;
    }

    public void bestCar () {
        Car max = cars[0];

        if (cars[0].getSpeed() > cars[1].getSpeed()) {
            max = cars[0];
        }
        if (cars[2].getSpeed() > max.getSpeed()) {
            max = cars[2];
        }

        System.out.println("Самая быстрая машина: " + max.getName());
    }

}
