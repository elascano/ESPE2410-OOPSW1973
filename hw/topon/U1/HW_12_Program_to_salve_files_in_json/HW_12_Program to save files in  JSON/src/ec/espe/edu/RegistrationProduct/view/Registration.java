
package ec.espe.edu.RegistrationProduct.view;

import java.util.Scanner;
import ec.espe.edu.RegistrationProduct.model.RegistrationProductJava;

/**
 *
 * @author Mateo Topon
 */
public class Registration {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Save clothing order data to json file");
        System.out.println("Enter the details of the order:");

        
        System.out.print("Enter product name: ");
        String name = scanner.nextLine();

        System.out.print("man or woman: ");
        String category = scanner.nextLine();

        System.out.print("S-L-M-XL: ");
        String size = scanner.nextLine();

        System.out.print("color type: ");
        String color = scanner.nextLine();
        
        System.out.print("The price is: ");
        double price = scanner.nextInt();
        scanner.nextLine();

        System.out.print("How many units do you want:");
        int quantity = scanner.nextInt();
        
        
        RegistrationProductJava RegistrationProductJava = new RegistrationProductJava(name, category, size, quantity, color, price);

        
        RegistrationProductJava.saveToJsonFile(".json");

        scanner.close();
    }
}
