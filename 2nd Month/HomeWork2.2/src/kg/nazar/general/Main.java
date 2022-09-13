package kg.nazar.general;

import kg.nazar.class_entity.Laptop;
import kg.nazar.class_entity.Printable;
import kg.nazar.class_entity.SmartWatch;
import kg.nazar.class_entity.Smartphone;

public class Main {

    public static void main(String[] args) {
        Laptop laptop = new Laptop("Notebook", "Vivobook", 512, 2, "Windows", 15.5);
        Smartphone smartphone = new Smartphone("Phone", "S22", 128, 4);
        SmartWatch smartWatch = new SmartWatch("Smart Watch", "Fit", 8, "Sport", 2);

        Printable[] printables = {laptop, smartphone, smartWatch};
        for (Printable print : printables) {
            print.print();
        }

        CreateObject("kg.nazar.class_entity.Laptop");
    }

    public static Printable CreateObject(String className) {
        Printable printable = null;
        switch (className) {
            case "kg.nazar.class_entity.Laptop":
                return new Laptop(
                        "Notebook",
                        "Zenbook",
                        1024,
                        32,
                        "Windows",
                        15.05
                );
            case "kg.nazar.class_entity.Smartphone":
                return new Smartphone("Phone","S22",128,4);
            case "kg.nazar.class_entity.SmartWatch":
                return new SmartWatch("Smart Watch","GT",16,"Classic",3);
        }
        return null;
    }
}
