package Fleet;

public class home {
    public static void main(String[] args) {
        VehicleManagerImpl manager = new VehicleManagerImpl();

        Car audi = new Car("audi", "a4", 2022, "black", 1234, "diesel", 4, "sedan");
        Truck ford = new Truck("ford", "f-150", 2016, "red", 4321, "diesel", 150.0);
        
        manager.addVehicle(ford);
        manager.addVehicle(audi);
        
        manager.printAllVehicles();
        manager.deleteVehicle(1234);
        manager.printAllVehicles();
        
    }
}