package Fleet;

/**
 * Represents a vehicle of type truck.
 * 
 */
public class Truck extends Vehicle {
    /**
     * Load capacity of the truck in kilograms
     */
    private double loadCapacity;

    /**
     * Constructs a Truck object with specified parameters.
     * Load capacity is a class specific parameter, whereas other parameters
     * are inherited from Vehicle superclass.
     * 
     * @param make
     * @param model
     * @param year
     * @param color
     * @param VIN
     * @param fuelType
     * @param loadCapacity Load capacity in kilograms
     */
    public Truck(String make, String model, int year, String color, int VIN, String fuelType, double loadCapacity) {
        super(make, model, year, color, VIN, fuelType);
        this.loadCapacity = loadCapacity;
    }

    /**
     * Gets load capacity of the truck.
     * 
     * @return Load capacity in kilograms
     */
    public double getLoadCapacity() {
        return loadCapacity;
    }

    /**
     * Sets load capacity of the truck.
     * 
     * @param loadCapacity Load capacity in kilograms
     */
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