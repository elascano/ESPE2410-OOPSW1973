package utils;

import ec.edu.espe.truck.model.Truck;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Andres Sandoval
 */
public class TruckManager {
    private static final String FILENAME = "trucks.ser";

    public static List<Truck> loadTrucks() {
        List<Truck> trucks = new ArrayList<>();
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FILENAME))) {
            trucks = (List<Truck>) ois.readObject();
        } catch (FileNotFoundException e) {
            System.out.println("No trucks found.");
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return trucks;
    }

    public static void saveTrucks(List<Truck> trucks) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILENAME))) {
            oos.writeObject(trucks);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static Truck addTruck() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter truck ID: ");
        String truckId = scanner.nextLine();

        System.out.print("Enter number of wheels: ");
        int wheels = scanner.nextInt();

        System.out.print("Enter number of seats: ");
        int seats = scanner.nextInt();
        scanner.nextLine(); 

        System.out.print("Enter truck brand: ");
        String brand = scanner.nextLine();

        System.out.print("Enter truck family: ");
        String family = scanner.nextLine();

        return new Truck(truckId, wheels, seats, brand, family);
    }

    public static void run() {
        List<Truck> trucks = loadTrucks();

        if (!trucks.isEmpty()) {
            System.out.println("\nExisting trucks:");
            for (Truck truck : trucks) {
                truck.showInfo();
            }
        } else {
            System.out.println("No trucks found.");
        }

        Truck truck = addTruck();
        trucks.add(truck);

        saveTrucks(trucks);

        truck.showInfo();
    }
}


