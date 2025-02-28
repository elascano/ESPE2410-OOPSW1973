// File: src/Main.java
package persistance;

import java.util.Scanner;
import src.DataManager;
import src.Person;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        DataManager dataManager = new DataManager("people.json");
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            try {
                System.out.println("\n=== Data Manager ===");
                System.out.println("1. Add a Person");
                System.out.println("2. Update a Person");
                System.out.println("3. Delete a Person");
                System.out.println("4. View All People");
                System.out.println("5. Search for a Person by ID");
                System.out.println("6. Exit");
                System.out.print("Choose an option: ");
                int choice = scanner.nextInt();

                switch (choice) {
                    case 1:
                        // Add a new person
                        System.out.println("Enter details of the person:");
                        Person newPerson = getPersonFromConsole(scanner);
                        dataManager.addObject(newPerson);
                        System.out.println("Person added successfully.");
                        break;
                    case 2:
                        // Update an existing person
                        System.out.print("Enter the ID of the person to update: ");
                        int updateId = readInt(scanner, "ID");
                        Person updatedPerson = getPersonFromConsole(scanner);
                        dataManager.updateObject(updateId, updatedPerson, true); // Overwrite data
                        System.out.println("Person updated successfully.");
                        break;
                    case 3:
                        // Delete a person
                        System.out.print("Enter the ID of the person to delete: ");
                        int deleteId = readInt(scanner, "ID");
                        dataManager.deleteObject(deleteId);
                        System.out.println("Person deleted successfully.");
                        break;
                    case 4:
                        // View all people
                        System.out.println("All People:");
                        for (Person person : dataManager.getAllObjects()) {
                            System.out.println(person);
                        }
                        break;
                    case 5:
                        // Search for a person by ID
                        System.out.print("Enter the ID of the person to search: ");
                        int searchId = readInt(scanner, "ID");
                        Person foundPerson = dataManager.searchById(searchId);
                        if (foundPerson != null) {
                            System.out.println("Person Found: " + foundPerson);
                        } else {
                            System.out.println("No person found with ID: " + searchId);
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
                scanner.nextLine(); // Clear the invalid input from the scanner
            }
        }

        scanner.close();
    }

    private static Person getPersonFromConsole(Scanner scanner) {
        int id = readInt(scanner, "ID");
        scanner.nextLine(); // Consume the newline
        System.out.print("Enter Name: ");
        String name = scanner.nextLine();
        int age = readInt(scanner, "Age");
        return new Person(id, name, age);
    }

    private static int readInt(Scanner scanner, String fieldName) {
        while (true) {
            try {
                System.out.print("Enter " + fieldName + ": ");
                return scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Invalid input! Please enter a valid integer for " + fieldName + ".");
                scanner.nextLine(); // Clear the invalid input
            }
        }
    }
}
