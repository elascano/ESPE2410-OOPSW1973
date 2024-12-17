package ec.edu.espe.pencil.view;

import utils.PencilManager;
import ec.edu.espe.pencil.model.CharijPencil;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        PencilManager pencilManager = new PencilManager();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            try {
                System.out.println("\nPencil Operations:");
                System.out.println("1. Add Pencil");
                System.out.println("2. View All Pencils");
                System.out.println("3. Update Pencil");
                System.out.println("4. Delete Pencil");
                System.out.println("5. Exit");
                System.out.print("Select an option: ");

                int choice = scanner.nextInt();
                scanner.nextLine(); // Consume newline

                switch (choice) {
                    case 1:
 System.out.print("Enter ID: ");
                        int id = scanner.nextInt();
                        scanner.nextLine(); // Consume newline
                        System.out.print("Enter Brand: ");
                        String brand = scanner.nextLine();
                        System.out.print("Enter Color: ");
                        String color = scanner.nextLine();
                        System.out.print("Enter Price: ");
                        double price = scanner.nextDouble();
                        scanner.nextLine(); // Consume newline
                        pencilManager.addCharijPencil(new CharijPencil(id, brand, color, price));
                        break;
                    case 2:
                        List<CharijPencil> pencils = pencilManager.getAllCharijPencils();
                        if (pencils.isEmpty()) {
                            System.out.println("No Pencils found.");
                        } else {
                            for (CharijPencil pencil : pencils) {
                                System.out.println(pencil);
                            }
                        }
                        break;
                    case 3:
                        System.out.print("Enter ID of the Pencil to update: ");
                        int updateId = scanner.nextInt();
                        scanner.nextLine(); // Consume newline
                        System.out.print("Enter new Brand: ");
                        String newBrand = scanner.nextLine();
                        System.out.print("Enter new Color: ");
                        String newColor = scanner.nextLine();
                        System.out.print("Enter new Price: ");
                        double newPrice = scanner.nextDouble();
                        scanner.nextLine(); // Consume newline
                        pencilManager.updateCharijPencil(updateId, newBrand, newColor, newPrice);
                        break;
                    case 4:
                        System.out.print("Enter ID of the Pencil to delete: ");
                        int deleteId = scanner.nextInt();
                        scanner.nextLine(); // Consume newline
                        pencilManager.deleteCharijPencil(deleteId);
                        break;
                    case 5:
                        System.out.println("Exiting...");
                        scanner.close();
                        return;
                    default:
                        System.out.println("Invalid option. Please try again.");
                }
            } catch (InputMismatchException e) {
                System.err.println("Invalid input. Please enter a number.");
                scanner.nextLine(); // Clear the invalid input
            } catch (Exception e) {
                System.err.println("Error: " + e.getMessage());
            }
        }
    }
}