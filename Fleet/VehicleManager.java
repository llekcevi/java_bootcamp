package Fleet;

/**
 * Methods for managing vehicles in a fleet.
 */
public interface VehicleManager {
    /**
     * Adds a vehicle to the fleet.
     * 
     * @param vehicle Vehicle to add to the fleet.
     */
    void addVehicle(Vehicle vehicle);

    void searchVehicle();

    /**
     * Prints all vehicles in the fleet.
     */
    void printAllVehicles();

    /**
     * Removes a vehicle from the fleet.
     * 
     * @param VIN Vehicle Identification Number of a vehicle to remove.
     */
    void deleteVehicle(int VIN);
}