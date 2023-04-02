package Fleet;
/**
 * Abstract class that represents all vehicles.
 * 
 */

public abstract class Vehicle {
    /**
     * Manufacturer of the vehicle
     */
    private String make;
    /**
     * Model name
     */
    private String model;
    /**
     * Year of manufacture
     */
    private int year;
    /**
     * Color of the vehicle
     */
    private String color;
    /**
     * Vehicle Identification Number
     */
    private String VIN;
    /**
     * Fuel type
     */
    private String fuelType;
    /**
     * Constructs a Vehicle object with specified parameters.
     * @param make Manufacturer of the vehicle
     * @param model Model name
     * @param year Year of manufacture
     * @param color Color of the vehicle
     * @param VIN Vehicle Identification Number
     * @param fuelType Fuel type
     */
    public Vehicle(String make, String model, int year, String color, String VIN, String fuelType) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.color = color;
        this.VIN = VIN;
        this.fuelType = fuelType;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getVIN() {
        return VIN;
    }

    public void setVIN(String vin) {
        this.VIN = vin;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }
}
