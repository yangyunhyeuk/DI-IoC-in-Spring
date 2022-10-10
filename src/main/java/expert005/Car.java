package expert005;

import expert005.Tire;
import org.springframework.beans.factory.annotation.Autowired;

public class Car {
    @Autowired
    Tire tire;

    public String getTireBrand() {
        return "장착된 타이어 : " + tire.getBrand();
    }

}
