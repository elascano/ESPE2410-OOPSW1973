

package cd.es.edu.SDCardPrj.view;
import cd.es.edu.SDCardPrj.model.SDCard;


import java.util.InputMismatchException;
import java.util.Scanner;
import utils.DataManager;
/**
 *
 * @author LABS-DCCO
 */
public class Main {
    public static void main(String[] args) {
        DataManager dataManager = new DataManager("sdcards.json");
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            try {
                System.out.println("\n=== Data Manager ===");
                System.out.println("1. Add a SDCard");
                System.out.println("2. Update a SDCard");
                System.out.println("3. Delete a SDCard");
                System.out.println("4. View All SDCard");
                System.out.println("5. Search for a SDCard by ID");
                System.out.println("6. Exit");
                System.out.print("Choose an option: ");
                int choice = scanner.nextInt();

                switch (choice) {
                    case 1:
                       
                        System.out.println("Enter details of the SDCard:");
                        SDCard newSDCard = getSDCardFromConsole(scanner);
                        dataManager.addObject(newSDCard);
                        System.out.println("Person added successfully.");
                        break;
                    case 2:
                        
                        System.out.print("Enter the ID of the person to update: ");
                        int updateId = readInt(scanner, "ID");
                        SDCard updatedSDCard = getSDCardFromConsole(scanner);
                        dataManager.updateObject(updateId, updatedSDCard, true); // Overwrite data
                        System.out.println("SDCard updated successfully.");
                        break;
                    case 3:
                        
                        System.out.print("Enter the ID of the SDCard to delete: ");
                        int deleteId = readInt(scanner, "ID");
                        dataManager.deleteObject(deleteId);
                        System.out.println("SDCard deleted successfully.");
                        break;
                    case 4:
                        
                        System.out.println("All SDCards:");
                        for (SDCard sdcard : dataManager.getAllObjects()) {
                            System.out.println(sdcard);
                        }
                        break;
                    case 5:
                        
                        System.out.print("Enter the ID of the SDCard to search: ");
                        int searchId = readInt(scanner, "ID");
                        SDCard foundSDCard = dataManager.searchById(searchId);
                        if (foundSDCard != null) {
                            System.out.println("SDCard Found: " + foundSDCard);
                        } else {
                            System.out.println("No SDCard found with ID: " + searchId);
                        }
                        break;
                    case 6:
                        // Exit
                        running = false;
                        System.out.println("Exiting... Goodbye!");
                        break;
                    default:
                        System.out.println("Invalid choice. Please try again.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input! Please enter a valid number.");
                scanner.nextLine(); 
            }
        }

        scanner.close();
    }

    private static SDCard getSDCardFromConsole(Scanner scanner) {
        int id = readInt(scanner, "ID");
        scanner.nextLine(); 
        System.out.print("Enter brand: ");
        String brand = scanner.nextLine();
        int storage = readInt(scanner, "Storage");
        int price = readInt(scanner, "Price");
        return new SDCard(id, brand, storage, price);
    }

    private static int readInt(Scanner scanner, String fieldstorage) {
        while (true) {
            try {
                System.out.print("Enter " + fieldstorage + ": ");
                return scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Invalid input! Please enter a valid integer for " + fieldstorage + ".");
                scanner.nextLine(); // Clear the invalid input
            }
        }
    }
}

