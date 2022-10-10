package expert002;

public class Car {
    Tire tire;

    // tire 속성에 대한 접근자
    public Tire getTire() {
        return tire;
    }

    // tire 속성에 대한 설정자
    public void setTire(Tire tire) {
        this.tire = tire;
    }

    public String getTireBrand() {
        return "장착된 타이어 : " + tire.getBrand();
    }

}
