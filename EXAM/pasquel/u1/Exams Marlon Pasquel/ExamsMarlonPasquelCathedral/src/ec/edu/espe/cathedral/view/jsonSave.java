
package ec.edu.espe.cathedral.view;

import java.util.Scanner;
import ec.edu.espe.cathedral.model.Cathedral; 

/**
 *
 * @author LABS-DCCO
 */
public class jsonSave {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Order Data to JSON File Saver");
        System.out.println("Enter the details of the order:");

        
        System.out.print("Enter Cathedral ID: ");
        int cathedralId = scanner.nextInt();
        scanner.nextLine(); 

        System.out.print("Enter Cathedral Name: ");
        String cathedralName = scanner.nextLine();

        System.out.print("Enter Location City: ");
        String locationCity = scanner.nextLine();

        System.out.print("Enter year of construction ");
        String yearOfConstruction = scanner.nextLine();

       Cathedral()cathedral

        
        order.saveToJsonFile("order.json");

        scanner.close();
    }
}
