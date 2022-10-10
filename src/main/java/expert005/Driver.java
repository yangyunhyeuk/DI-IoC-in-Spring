package expert005;

import expert005.Car;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("expert003/expert006.xml");

        Car car = context.getBean("car", Car.class);
        System.out.println(car.getTireBrand());
    }
}
