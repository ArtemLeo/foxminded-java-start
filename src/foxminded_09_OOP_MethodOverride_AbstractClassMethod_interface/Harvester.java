package foxminded_09_OOP_MethodOverride_AbstractClassMethod_interface;

import java.util.Objects;

public class Harvester implements Serviceable {
    private String model;
    private String machineType;
    private String productionCountry;
    private int distance = 0;

    protected int distanceOnService = 0;

    public Harvester(String model, String machineType, String productionCountry) {
        this.model = model;
        this.machineType = machineType;
        this.productionCountry = productionCountry;
    }

    @Override
    public void addDistance(int addDistance) {
        distance += addDistance;
        distanceOnService += addDistance;
    }

    @Override
    public void addDistance(double addDistance) {
        distance += addDistance;
        distanceOnService += addDistance;
    }

    @Override
    public boolean isReadyToService() {
        if (distanceOnService > 70000) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Harvester harvester = (Harvester) o;
        return distance == harvester.distance && distanceOnService == harvester.distanceOnService && Objects.equals(model, harvester.model) && Objects.equals(machineType, harvester.machineType) && Objects.equals(productionCountry, harvester.productionCountry);
    }

    @Override
    public int hashCode() {
        return Objects.hash(model, machineType, productionCountry, distance, distanceOnService);
    }

    @Override
    public String toString() {
        return "Harvester{" +
                "model='" + model + '\'' +
                ", machineType='" + machineType + '\'' +
                ", productionCountry='" + productionCountry + '\'' +
                ", distance=" + distance +
                ", distanceOnService=" + distanceOnService +
                '}';
    }
}
