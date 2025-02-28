/**
 *
 * @author Camila Bohorquez
 */
package ec.edu.espe.OrderJsonSaver.view;

import ec.edu.espe.OrderJsonSaver.model.Order;
import java.util.Scanner;

public class OrderJsonSaver {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Order Data to JSON File Saver");
        System.out.println("Enter the details of the order:");

        
        System.out.print("Enter Order ID: ");
        int orderId = scanner.nextInt();
        scanner.nextLine(); 

        System.out.print("Enter Customer Name: ");
        String customerName = scanner.nextLine();

        System.out.print("Enter Dish Name: ");
        String dishName = scanner.nextLine();

        System.out.print("Enter Payment Type (Cash or Transfer): ");
        String paymentType = scanner.nextLine();

        int serviceRating = 0;
        do {
            System.out.print("Enter Service Rating (1=Bad, 2=Average, 3=Good, 4=Very Good, 5=Excellent): ");
            serviceRating = scanner.nextInt();
        } while (serviceRating < 1 || serviceRating > 5);

        
        Order order = new Order(orderId, customerName, dishName, paymentType, serviceRating);

        
        order.saveToJsonFile("order.json");

        scanner.close();
    }
}

