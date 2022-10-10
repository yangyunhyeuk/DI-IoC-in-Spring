package export001_03;

public class Driver {
    public static void main(String[] args) {
        Tire tire = new koreaTire();
        Car car = new Car();
        car.setTire(tire);

        System.out.println(car.getTireBrand());
    }
}
