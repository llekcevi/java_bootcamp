package Fleet;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * Implements {@link VehicleManager} interface.
 * 
 */
public class VehicleManagerImpl implements VehicleManager {
    /**
     * Represents a fleet of vehicles.
     */
    private ArrayList<Vehicle> fleet;

    /**
     * Constructs VehicleManagerImpl object that manages vehicles in a fleet.
     */
    public VehicleManagerImpl() {
        fleet = new ArrayList<Vehicle>();
    }
    /**
     * Gets fleet.
     * @return All vehicles in the fleet.
     */
    public ArrayList<Vehicle> getFleet() {
        return fleet;
    }
    /**
     * Sets fleet.
     * @param fleet A list of vehicles.
     */
    public void setFleet(ArrayList<Vehicle> fleet) {
        this.fleet = fleet;
    }

    @Override
    public void addVehicle(Vehicle vehicle) throws DuplicateVehicleException {
        for (Vehicle v : fleet) {
            if (v.getVIN().equals(vehicle.getVIN()))
                throw new DuplicateVehicleException("Vehicle with the same VIN number already in the fleet.");
            break;
        }
        fleet.add(vehicle);
        System.out.println("Vehicle added successfully");
    }

    @Override
    public void searchVehicle(Scanner scanner) {
        System.out.println("How would you like to search for vehicles?");
        System.out.println("1. Search by make");
        System.out.println("2. Search my model");
        System.out.println("3. Search by Vehicle Identification Number");
        int search_type = scanner.nextInt();

        switch (search_type) {
            case 1:
                System.out.println("Enter make: ");
                scanner.nextLine();
                String make = scanner.nextLine();
                for (Vehicle vehicle : fleet) {
                    if (vehicle.getMake().equals(make)) {
                        System.out.println(vehicle);
                    }
                }
                break;
            case 2:
                System.out.println("Enter model: ");
                scanner.nextLine();
                String model = scanner.nextLine();
                for (Vehicle vehicle : fleet) {
                    if (vehicle.getModel().equals(model)) {
                        System.out.println(vehicle);
                    }
                }
                break;
            case 3:
                System.out.println("Enter VIN: ");
                scanner.nextLine();
                String VIN = scanner.nextLine();
                for (Vehicle vehicle : fleet) {
                    if (vehicle.getVIN().equals(VIN)) {
                        System.out.println(vehicle);
                    }
                }
                break;
            default:
                break;
        }

    }

    @Override
    public void printAllVehicles() {
        System.out.println("All vehicles in the fleet:");
        for (Vehicle vehicle : fleet) {
            System.out.println(vehicle);
        }
    }

    @Override
    public void deleteVehicle(String VIN) throws NoSuchVehicleException {
        for (Vehicle v : fleet) {
            if (v.getVIN().equals(VIN)) {
                fleet.remove(v);
                break;
            } else {
                throw new NoSuchVehicleException("There is no vehicle associated with the given VIN number.");
            }
        }
    }

}