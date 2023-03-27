package Fleet;

import java.util.ArrayList;

public class VehicleManagerImpl implements VehicleManager {
    private ArrayList<Vehicle> fleet;

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
    public void deleteVehicle() {
    }

}