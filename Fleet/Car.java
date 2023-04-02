package Fleet;

/**
 * Represents a vehicle of type Car.
 */
public class Car extends Vehicle {
    /**
     * Number of doors
     */
    private int numberOfDoors;
    /**
     * Body type
     */
    private String bodyType;

    /**
     * Constructs a Car object with specified parameters.
     * Number of doors and body type are class specific parameters, whereas other
     * parameters are inherited from Vehicle superclass.
     * 
     * @param make
     * @param model
     * @param year
     * @param color
     * @param VIN
     * @param fuelType
     * @param numberOfDoors Number of doors
     * @param bodyType      Body type
     */
    public Car(String make, String model, int year, String color, String VIN, String fuelType, int numberOfDoors,
            String bodyType) {
        super(make, model, year, color, VIN, fuelType);
        this.numberOfDoors = numberOfDoors;
        this.bodyType = bodyType;
    }

    /**
     * Returns the number of doors.
     * 
     * @return number of doors
     */
    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    /**
     * Set nuber of doors.
     * 
     * @param numberOfDoors number of doors
     */
    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

    /**
     * Returns body type.
     * 
     * @return body type
     */
    public String getBodyType() {
        return bodyType;
    }

    /**
     * Sets body type.
     * 
     * @param bodyType body type
     */
    public void setBodyType(String bodyType) {
        this.bodyType = bodyType;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "{make=" + getMake() + ", model=" + getModel() + ", year=" + getYear()
                + ", color=" + getColor() + ", VIN = " + getVIN() + ", fuelType=" + getFuelType() + ", numberOfDoors="
                + getNumberOfDoors() + ", bodyType=" + getBodyType() + "}";
    };

}