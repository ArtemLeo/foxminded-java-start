package foxminded_09_OOP_MethodOverride_AbstractClassMethod_interface;

import foxminded_08_Class_creation.Brand;
import foxminded_08_Class_creation.Car;
import foxminded_08_Class_creation.Color;

public class Bus extends Car {
    public Bus(Brand brand, String model, int yearOfProduction, int price, int weight, Color color) {
        super(brand, model, yearOfProduction, price, weight, color);
    }

    @Override
    public boolean isReadyToService() {
        if (distanceOnService >= 50000) {
            return true;
        } else {
            return false;
        }
    }
}
