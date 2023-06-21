package foxminded_09_OOP_MethodOverride_AbstractClassMethod_interface;

import foxminded_08_Class_creation.Brand;
import foxminded_08_Class_creation.Car;
import foxminded_08_Class_creation.Color;

public class Main {
    public static void main(String[] args) {
        Car passengerCar = new PassengerCar(Brand.Toyota, "Prius", 2008, 15000, 1200, Color.Green);
        Car bus = new Bus(Brand.Renault, "Trafic", 2000, 9700, 1600, Color.White);
        Car newBus = new Bus(Brand.Renault, "Trafic", 2000, 9700, 1600, Color.White);
        System.out.println(passengerCar);
        System.out.println(bus);
        System.out.println(newBus);
        System.out.println("----------------------------------");

        passengerCar.addDistance(10000);
        System.out.println(passengerCar.getDistance() + " km");
        System.out.println(passengerCar);
        System.out.println("isReadyToService -> " + passengerCar.isReadyToService());
        System.out.println("----------------------------------");

        bus.addDistance(49000);
        System.out.println(bus.getDistanceOnService() + " km");
        System.out.println(bus);
        System.out.println("isReadeToService -> " + bus.isReadyToService());
        System.out.println("----------------------------------");

        Harvester combine = new Harvester("CLAAS LEXION 560TT", "agricultural machinery", "Germany");
        combine.addDistance(37487.294);
        System.out.println("DistanceOnService of combine = " + combine.distanceOnService + " km");
        System.out.println("Combine is ready to service -> " + combine.isReadyToService());
    }
}
