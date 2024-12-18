package ec.edu.espe.standapp.view;

import ec.edu.espe.standapp.model.Stand;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Dennis Paucar
 */
public class StandApp {
    private static final String FILE_NAME = "stands.dat";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Stand> stands = loadStands(); 

        while (true) {
            System.out.println("\n--- Stand Menu ---");
            System.out.println("1. Add Stand");
            System.out.println("2. View Stands");
            System.out.println("3. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); 

            switch (choice) {
                case 1 : {
                    Stand newStand = createStand(scanner);
                    stands.add(newStand);
                    saveStands(stands);
                }
                case 2 :{
                    System.out.println("\n--- List of Stands ---");
                    if (stands.isEmpty()) {
                        System.out.println("No stands available.");
                    } else {
                        stands.forEach(System.out::println);
                    }
                }
                case 3 : {
                    System.out.println("Exiting of the program");
                    scanner.close();
                    return; 
                }
                default : System.out.println("Invalid option. Please try again.");
            }
        }
    }

  
    private static Stand createStand(Scanner scanner) {
        System.out.print("Enter Stand ID: ");
        int id = scanner.nextInt();
        scanner.nextLine(); 
        System.out.print("Enter Stand Color: ");
        String color = scanner.nextLine();
        System.out.print("Enter Stand Material: ");
        String material = scanner.nextLine();
        System.out.print("Enter Stand Type: ");
        String type = scanner.nextLine();

        return new Stand(id, color, material, type);
    }

   
    private static void saveStands(List<Stand> stands) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE_NAME))) {
            oos.writeObject(stands); // Guardar toda la lista
            System.out.println("Stands saved successfully.");
        } catch (IOException e) {
            System.err.println("Error saving stands: " + e.getMessage());
        }
    }

  
    private static List<Stand> loadStands() {
        File file = new File(FILE_NAME);
        if (!file.exists()) {
            return new ArrayList<>(); 
        }

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FILE_NAME))) {
            return (List<Stand>) ois.readObject(); 
        } catch (IOException | ClassNotFoundException e) {
            System.err.println("Error loading stands: " + e.getMessage());
            return new ArrayList<>(); 
        }
    }
}
