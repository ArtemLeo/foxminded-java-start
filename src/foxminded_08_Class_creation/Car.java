package foxminded_08_Class_creation;


import foxminded_09_OOP_MethodOverride_AbstractClassMethod_interface.Serviceable;

import java.util.Objects;

public abstract class Car implements Serviceable {
    Brand brand;
    String model;
    int yearOfProduction;
    int price;
    int weight;
    Color color;
    private int distance = 0;

    protected int distanceOnService = 0;

    public Car(Brand brand, String model, int yearOfProduction, int price, int weight, Color color) {
        this.brand = brand;
        this.model = model;
        this.yearOfProduction = yearOfProduction;
        this.price = price;
        this.weight = weight;
        this.color = color;
    }

    public void addDistance(int addDistance) {
        if (addDistance < 0) {
            System.out.println("Invalid input parameters!");
        } else {
            distance += addDistance;
            distanceOnService += addDistance;
        }
    }

    public void addDistance(double addDistance) {
        if (addDistance < 0) {
            System.out.println("Invalid input parameters!");
        } else {
            distance += addDistance;
            distanceOnService += addDistance;
        }
    }

    public int getDistance() {
        return distance;
    }

    public int getDistanceOnService() {
        return distanceOnService;
    }

    @Override
    public String toString() {
        return "Car {" +
                "brand=" + brand +
                ", model='" + model + '\'' +
                ", yearOfProduction=" + yearOfProduction +
                ", price=" + price +
                ", weight=" + weight +
                ", color=" + color +
                ", distance=" + distance +
                ", distanceOnService=" + distanceOnService +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return yearOfProduction == car.yearOfProduction && price == car.price && weight == car.weight && brand == car.brand && Objects.equals(model, car.model) && color == car.color;
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, model, yearOfProduction, price, weight, color);
    }
}

