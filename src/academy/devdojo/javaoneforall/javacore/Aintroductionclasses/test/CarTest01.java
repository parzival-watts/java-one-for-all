package academy.devdojo.javaoneforall.javacore.Aintroductionclasses.test;

import academy.devdojo.javaoneforall.javacore.Aintroductionclasses.domain.Car;

public class CarTest01 {
    public static void main(String[] args) {
        Car car = new Car();
        Car car2 = new Car();

        car.name = "Forza";
        car.model = "sedan";
        car.year = 2023;

        car2.name = "vectra";
        car2.model = "sedan";
        car2.year = 2020;

        System.out.println(car.name);
        System.out.println(car.model);
        System.out.println(car.year);

        System.out.println(car2.name);
        System.out.println(car2.model);
        System.out.println(car2.year);

    }
}

