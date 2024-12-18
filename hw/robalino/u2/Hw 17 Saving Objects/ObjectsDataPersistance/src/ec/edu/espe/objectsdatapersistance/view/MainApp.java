package ec.edu.espe.objectsdatapersistance.view;

import ec.edu.espe.objectsdatapersistance.model.SdCard;
import utils.SdCardManager;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        SdCardManager sdCardManager = new SdCardManager();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            try {
                System.out.println("\nSD Card CRUD Operations:");
                System.out.println("1. Add SD Card");
                System.out.println("2. View All SD Cards");
                System.out.println("3. Update SD Card");
                System.out.println("4. Delete SD Card");
                System.out.println("5. Exit");
                System.out.print("Select an option: ");

                int choice = scanner.nextInt();
                scanner.nextLine(); // Consume newline

                switch (choice) {
                    case 1:
                        addSdCard(scanner, sdCardManager);
                        break;
                    case 2:
                        viewAllSdCards(sdCardManager);
                        break;
                    case 3:
                        updateSdCard(scanner, sdCardManager);
                        break;
                    case 4:
                        deleteSdCard(scanner, sdCardManager);
                        break;
                    case 5:
                        System.out.println("Exiting program. Goodbye!");
                        scanner.close();
                        System.exit(0);
                    default:
                        System.out.println("Invalid choice. Please enter a number between 1 and 5.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a valid number.");
                scanner.nextLine(); // Clear invalid input
            } catch (Exception e) {
                System.out.println("An unexpected error occurred: " + e.getMessage());
            }
        }
    }

    private static void addSdCard(Scanner scanner, SdCardManager manager) {
        try {
            System.out.print("Enter ID: ");
            int id = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            System.out.print("Enter Brand: ");
            String brand = scanner.nextLine();

            System.out.print("Enter Storage (GB): ");
            int storage = scanner.nextInt();

            System.out.print("Enter Price ($): ");
            double price = scanner.nextDouble();

            manager.addSdCard(new SdCard(id, brand, storage, price));
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter the correct data type for ID, Storage, or Price.");
            scanner.nextLine(); // Clear invalid input
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    private static void viewAllSdCards(SdCardManager manager) {
        try {
            List<SdCard> sdCards = manager.getAllSdCards();
            if (sdCards.isEmpty()) {
                System.out.println("No SD Cards found.");
            } else {
                System.out.println("\nList of SD Cards:");
                for (SdCard sdCard : sdCards) {
                    System.out.println(sdCard);
                }
            }
        } catch (Exception e) {
            System.out.println("Error retrieving SD Cards: " + e.getMessage());
        }
    }

    private static void updateSdCard(Scanner scanner, SdCardManager manager) {
        try {
            System.out.print("Enter ID of the SD Card to update: ");
            int id = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            System.out.print("Enter new Brand: ");
            String newBrand = scanner.nextLine();

            System.out.print("Enter new Storage (GB): ");
            int newStorage = scanner.nextInt();

            System.out.print("Enter new Price ($): ");
            double newPrice = scanner.nextDouble();

            manager.updateSdCard(id, newBrand, newStorage, newPrice);
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter correct data types.");
            scanner.nextLine();
        } catch (Exception e) {
            System.out.println("Error updating SD Card: " + e.getMessage());
        }
    }

    private static void deleteSdCard(Scanner scanner, SdCardManager manager) {
        try {
            System.out.print("Enter ID of the SD Card to delete: ");
            int id = scanner.nextInt();

            manager.deleteSdCard(id);
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter a valid ID.");
            scanner.nextLine();
        } catch (Exception e) {
            System.out.println("Error deleting SD Card: " + e.getMessage());
        }
    }
}
