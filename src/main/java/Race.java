public class Race {
    private final Car car;
    private String leader="";
    private int distance=0;

    public Race() {
        car=new Car("", 0);
    }
    public Race(Car car) {
        this.car = car;
    }


    public void bestCar () {
        leader = car.getName();
        distance=car.getSpeed()*24;

        if (distance < car.getSpeed()*24) {
            distance = car.getSpeed()*24;
            leader = car.getName();
        }
        System.out.println("Самая быстрая машина: " + leader);
    }

}
