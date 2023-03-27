package Fleet;

public class Truck extends Vehicle {
    private double loadCapacity;

    public Truck(String make, String model, int year, String color, int VIN, String fuelType, double loadCapacity) {
        super(make, model, year, color, VIN, fuelType);
        this.loadCapacity = loadCapacity;
    }

    public double getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(double loadCapacity) {
        this.loadCapacity = loadCapacity;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "{make=" + getMake() + ", model=" + getModel() + ", year=" + getYear()
                + ", color=" + getColor() + ", VIN = " + getVIN() + ", fuelType=" + getFuelType() + ", loadCapacity="
                + getLoadCapacity() + "}";
    }

}