package ec.edu.espe.cable.model;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;
import utils.ObjectFileManager;

/**
 * 
 * @author Robinson Bonilla
 */
public class Menu {

    private int option;
    private boolean isMenuRunning;
    private Scanner scanner;
    private String filePath;

    public Menu() {
        option = 0;
        isMenuRunning = true;
        scanner = new Scanner(System.in).useLocale(Locale.US);
        filePath = "cables.dat";
    }

    public void runMenu() {
        while (isMenuRunning) {
            try {
                displayMenu();
                getOption();
                executeOption();
            } catch (Exception ex) {
                System.out.println("Invalid input. Please enter a valid option.");
            }
        }
        scanner.close();
    }

    private void displayMenu() {
        System.out.println("Cables Menu:");
        System.out.println("1. Add cable");
        System.out.println("2. Show cables");
        System.out.println("3. Exit");
    }

    private void getOption() {
        System.out.print("Enter your option: ");
        if (scanner.hasNextInt()) {
            option = scanner.nextInt();
            scanner.nextLine(); 
        } else {
            scanner.nextLine(); 
            throw new IllegalArgumentException("Option must be a number.");
        }
    }

    private void executeOption() {
        switch (option) {
            case 1:
                addCable();
                break;
            case 2:
                showCables();
                break;
            case 3:
                isMenuRunning = false;
                System.out.println("Exiting...");
                break;
            default:
                System.out.println("Invalid option, please enter a valid option.");
        }
    }

    private void addCable() {
        String id;
        String type;
        int numberOfConductors;
        float price;

        System.out.print("Enter the cable id: ");
        id = scanner.nextLine();

        System.out.print("Enter the cable type: ");
        type = scanner.nextLine();

        System.out.print("Enter the number of conductors: ");
        numberOfConductors = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        System.out.print("Enter the price: ");
        price = scanner.nextFloat();
        scanner.nextLine(); 

        Cable cable = new Cable(id, type, numberOfConductors, price);
        ObjectFileManager.insert(cable, filePath, Cable.class);
    }

    private void showCables() {
        ArrayList<Cable> cables = ObjectFileManager.readFromFile(filePath, Cable.class);
        if (cables.isEmpty()) {
            System.out.println("No cables found.");
        } else {
            for (Cable cable : cables) {
                System.out.println(cable);
            }
        }
    }
}
