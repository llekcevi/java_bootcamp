package Fleet;

import java.util.Scanner;

/**
 * Methods for managing vehicles in a fleet.
 */
public interface VehicleManager {
    /**
     * Adds a vehicle to the fleet.
     * 
     * @param vehicle Vehicle to add to the fleet.
     * @throws DuplicateVehicleException Throws exception if vehicle's VIN number already exists in the fleet. 
     */
    void addVehicle(Vehicle vehicle) throws DuplicateVehicleException;

    /**
     * Search vehicles by make, model or VIM
     * @param scanner Scans user input.
     */
    void searchVehicle(Scanner scanner);

    /**
     * Prints all vehicles in the fleet.
     */
    void printAllVehicles();

    /**
     * Removes a vehicle from the fleet.
     * 
     * @param VIN Vehicle Identification Number of a vehicle to remove.
     * @throws NoSuchVehicleException Throws exception if there is no vehicle with inputted VIN number in the fleet.
     */
    void deleteVehicle(String VIN) throws NoSuchVehicleException;
}