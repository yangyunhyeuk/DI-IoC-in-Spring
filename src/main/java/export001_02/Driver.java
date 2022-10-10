package export001_02;

public class Driver {
    public static void main(String[] args) {
        Tire tire = new koreaTire();
        Car car = new Car(tire);

        System.out.println(car.getTireBrand());
    }
}
