package espe.edu.ec.view;

import espe.edu.ec.model.*;
import espe.edu.ec.utils.AdminPermissions;
import espe.edu.ec.utils.ManageFileJson;
import espe.edu.ec.utils.Validations;
import java.util.Scanner;

public class SAMCApp {
    public static void main(String[] args) {
 
        MenuItem.initializeMenu();
        ManageFileJson manageFileJson = new ManageFileJson();
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        manageFileJson.loadQuantitiesFromJson();

        while (running) {
            displayMenu();
            int choice = Validations.validateOption(1, 6, scanner);

            switch (choice) {
                case 1:
                    new Order().placeOrder(scanner, new Validations(), manageFileJson);
                    break;
                case 2:
                    new Customer("", "", "", "", "").leaveComment(scanner, manageFileJson);
                    break;
                case 3:
                    new AdminPermissions().adminPermissions(scanner, manageFileJson);
                    break;
                case 4:
                    running = false;
                    manageFileJson.saveQuantitiesToJson();
                    System.out.println("Gracias por visitarnos. ¡Hasta pronto!");
                    break;
                default:
                    System.out.println("Opcion no valida.");
            }
        }
        scanner.close();
    }
    private static void displayMenu() {
        System.out.println("******** AGACHADITOS DE LA JAVI ********");
        System.out.println("1. Realizar un pedido");
        System.out.println("2. Dejar un comentario");
        System.out.println("3. Modo Administrador");
        System.out.println("4. Salir");
        System.out.print("Seleccione una opcion: ");
    }
}
