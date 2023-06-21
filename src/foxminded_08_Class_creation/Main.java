package foxminded_08_Class_creation;

import foxminded_09_OOP_MethodOverride_AbstractClassMethod_interface.PassengerCar;

public class Main {
    public static void main(String[] args) {
        Car toyota = new PassengerCar(Brand.Toyota, "Prius", 2008, 15000, 1200, Color.Green);
        Car renault = new PassengerCar(Brand.Renault, "Laguna", 2000, 9700, 1600, Color.White);
        Car newCar = new PassengerCar(Brand.Renault, "Laguna", 2000, 9700, 1600, Color.White);
        System.out.println(toyota);
        System.out.println(renault);
        System.out.println(newCar);
        System.out.println("----------------------------------");

        // Equals;
        System.out.println(newCar.equals(renault));
        System.out.println(newCar.equals(toyota));
        System.out.println("----------------------------------");

        toyota.addDistance(2000);
        System.out.println(toyota.getDistance() + " km");
        toyota.addDistance(7215.735);
        System.out.println(toyota.getDistance() + " km");
        toyota.addDistance(-3000);
        System.out.println(toyota.getDistance() + " km");
        System.out.println("----------------------------------");
        System.out.println(toyota);

    }
}
