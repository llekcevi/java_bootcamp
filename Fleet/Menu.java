package Fleet;

import java.io.IOException;
import java.util.Scanner;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

/**
 * Retresents menu where users can choose different actions
 */
public class Menu {
    /**
     * Boolean that keeps the main loop running until user chooses to exit the
     * program.
     */
    public boolean isTerminated;
    /**
     * Logger object
     */
    public Logger LOGGER;
    /**
     * Scans user input
     */
    public Scanner scanner;
    /**
     * Represents an instance of VehicleManager
     * 
     */
    public VehicleManager manager;

    /**
     * Constructs the menu object
     */
    public Menu() {
        scanner = new Scanner(System.in);
        manager = new VehicleManagerImpl();
        LOGGER = Logger.getLogger(Menu.class.getName());
        try {
            FileHandler fileHandler = new FileHandler("log.txt");
            LOGGER.addHandler(fileHandler);
            SimpleFormatter formatter = new SimpleFormatter();
            fileHandler.setFormatter(formatter);

        } catch (IOException e) {
            LOGGER.warning("Could not create log file: " + e.getMessage());
            System.out.println("Could not create log file: " + e.getMessage());
        }
        isTerminated = false;
    };

    /**
     * Runs the main menu loop.
     */
    public void run() {
        while (!isTerminated) {
            showActions();
            chooseAction();
        }
    }

    /**
     * Shows the main menu actions.
     */
    public void showActions() {
        System.out.println(" ");
        System.out.println("Vehicle Fleet Management System");
        System.out.println("-------------------------------");
        System.out.println("1. Add a vehicle to the fleet");
        System.out.println("2. Search for vehicles by make, model or VIN number");
        System.out.println("3. Print all vehicles from the fleet");
        System.out.println("4. Delete a vehicle from the fleet");
        System.out.println("5. Quit");
        System.out.println("");
    }

    /**
     * Enables users to choose an action from main menu.
     */
    public void chooseAction() {
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.println("What type of vehicle would you like to add?");
                System.out.println("Enter 'car' or 'truck':");
                scanner.nextLine();
                String type = scanner.nextLine();
                System.out.println("type: " + type);

                System.out.println("Enter make:");
                String make = scanner.nextLine();

                System.out.println("Enter model");
                String model = scanner.nextLine();

                System.out.println("Enter year:");
                int year = scanner.nextInt();

                System.out.println("Enter color:");
                scanner.nextLine();
                String color = scanner.nextLine();

                System.out.println("Enter VIN number:");
                String VIN = scanner.nextLine();

                System.out.println("Enter fuel type:");
                String fuelType = scanner.nextLine();

                if (type.equals("car")) {
                    System.out.println("Enter number of doors:");
                    int numberOfDoors = scanner.nextInt();

                    System.out.println("Enter body type:");
                    scanner.nextLine();
                    String bodyType = scanner.nextLine();

                    Car car = new Car(make, model, year, color, VIN, fuelType, numberOfDoors, bodyType);
                    try {
                        manager.addVehicle(car);
                    } catch (DuplicateVehicleException e) {
                        LOGGER.warning("Greška: " + e.getMessage());
                        System.out.println("Greška: " + e.getMessage());
                    }

                } else if (type.equals("truck")) {
                    System.out.println("Enter load capacity:");
                    double loadCapacity = scanner.nextDouble();

                    Truck truck = new Truck(make, model, year, color, VIN, fuelType, loadCapacity);
                    try {
                        manager.addVehicle(truck);
                    } catch (DuplicateVehicleException e) {
                        LOGGER.warning("Greška: " + e.getMessage());
                        System.out.println("Greška: " + e.getMessage());
                    }
                } 
                break;
            case 2:
                manager.searchVehicle(scanner);
                break;
            case 3:
                manager.printAllVehicles();
                break;
            case 4:
                System.out.println("Enter VIN number of vehicle to delete:");
                scanner.nextLine();
                String VIN_delete = scanner.nextLine();
                try {
                    manager.deleteVehicle(VIN_delete);
                } catch (NoSuchVehicleException e) {
                    LOGGER.warning("Greška: " + e.getMessage());
                    System.out.println("Greška: " + e.getMessage());
                }
                break;
            case 5:
                isTerminated = true;
                scanner.close();
                break;
            default:
                break;
        }
    }
}