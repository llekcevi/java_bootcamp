package Fleet;

public class home {
    public static void main(String[] args) {
        VehicleManagerImpl manager = new VehicleManagerImpl();

        manager.addVehicle(new Car("audi", "a4", 2022, "black", 1234, "diesel", 4, "sedan"));
        manager.addVehicle(new Truck("ford", "f-150", 2016, "red", 4321, "diesel", 150.0));
        manager.printAllVehicles();
    }
}