package Fleet;

import java.util.ArrayList;
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
    public VehicleManagerImpl(){
        fleet = new ArrayList<Vehicle>();
    }

    public ArrayList<Vehicle> getFleet() {
        return fleet;
    }
    public void setFleet(ArrayList<Vehicle> fleet) {
        this.fleet = fleet;
    }

    @Override
    public void addVehicle(Vehicle vehicle) {
        fleet.add(vehicle);
    }

    @Override
    public void searchVehicle() {
    }

    @Override
    public void printAllVehicles() {
        for (Vehicle vehicle : fleet) {
            System.out.println(vehicle);
        }
    }

    @Override
    public void deleteVehicle(int VIN) {
           fleet.removeIf(v -> (v.getVIN() == VIN)); 
    }

}