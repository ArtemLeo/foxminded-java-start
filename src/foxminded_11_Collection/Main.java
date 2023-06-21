package foxminded_11_Collection;

import foxminded_08_Class_creation.Brand;
import foxminded_08_Class_creation.Car;
import foxminded_08_Class_creation.Color;
import foxminded_09_OOP_MethodOverride_AbstractClassMethod_interface.Bus;
import foxminded_09_OOP_MethodOverride_AbstractClassMethod_interface.PassengerCar;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Car passengerCar = new PassengerCar(Brand.Toyota, "Prius", 2008, 15000, 1200, Color.Green);
        Car bus = new Bus(Brand.Renault, "Trafic", 2000, 9700, 1600, Color.White);
        Car newBus = new Bus(Brand.Renault, "Trafic", 2000, 9700, 1600, Color.White);

        List<Car> listOfCar = new ArrayList<>();
        listOfCar.add(passengerCar);
        listOfCar.add(bus);
        listOfCar.add(newBus);

        for (Car cars : listOfCar) {
            System.out.println(cars);
        }
    }
}
