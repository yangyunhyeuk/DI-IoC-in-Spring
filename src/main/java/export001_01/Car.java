package export001_01;

public class Car {

    Tire tire;

    public Car() {
        tire = new koreaTire();
//        tire = new AmericaTire();
    }

    public String getTireBrand() {
        return "장착된 타이어 : " + tire.getBrand();
    }
}
