package ua.company;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ua.company.car.Car;
import ua.company.car.Lamborghini;
import ua.company.car.Mustang;
import ua.company.car.Tesla;
import ua.company.config.SpringConfig;

import java.util.ArrayList;
import java.util.List;

public class TestSpring {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);

        List<Car> cars = createCars(context);

        printCars(cars);

        context.close();
    }

    private static List<Car> createCars(AnnotationConfigApplicationContext context) {
        Car lamb = context.getBean("lamborghini", Lamborghini.class);
        Car tesla = context.getBean("tesla", Tesla.class);
        Car mustang = context.getBean("mustang", Mustang.class);

        List<Car> cars = new ArrayList<>();
        cars.add(lamb);
        cars.add(tesla);
        cars.add(mustang);
        return cars;
    }

    private static void printCars(List<Car> cars) {
        for (Car car : cars
        ) {
            System.out.println(car);
            car.go();
            car.turnOnAutoPilot();
            car.showCabinInfo();
            System.out.println("-----------");
        }
    }
}
