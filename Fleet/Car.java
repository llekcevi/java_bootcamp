package Fleet;

public class Car extends Vehicle {
    private int numberOfDoors;
    private String bodyType;

    public Car(String make, String model, int year, String color, int VIN, String fuelType, int numberOfDoors,
            String bodyType) {
        super(make, model, year, color, VIN, fuelType);
        this.numberOfDoors = numberOfDoors;
        this.bodyType = bodyType;
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

    public String getBodyType() {
        return bodyType;
    }

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