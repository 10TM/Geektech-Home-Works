package kg.nazar.general;

import kg.nazar.class_entity.Bike;
import kg.nazar.class_entity.Car;
import kg.nazar.class_entity.Colors;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("Mercedes", 1997, "diesel", Colors.Black, "S500", "Sedan", 270);
        Bike bike = new Bike("Mazda", "CX-500", 370, "Benzin");


        System.out.println("This class_entity.Car" + car.getInfo() + "\n");
        System.out.println("This bike" + bike.getInfo());
    }
}