
package ec.edu.espe.view;

/**
 *
 * @author USUARIO
 */
import ec.edu.espe.controller.PersonController;
import java.util.Scanner;

public class AgeApp {
public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PersonController controller = new PersonController(); // Instancia del controlador

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your birth year: ");
        int birthYear = scanner.nextInt();

        controller.savePerson(name, birthYear); // Llamamos al método correcto

        System.out.println("Person saved successfully.");
        scanner.close();
    }
}
