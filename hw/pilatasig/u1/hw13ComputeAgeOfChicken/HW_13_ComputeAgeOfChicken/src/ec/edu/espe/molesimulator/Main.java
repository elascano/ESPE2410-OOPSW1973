package ec.edu.espe.molesimulator;

import ec.edu.espe.molesimulator.model.Chicken;
import java.util.Date;
import java.util.Scanner;
import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
 *
 * @author David Pilatasig
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        
        System.out.println("==== Ingreso de Datos de la Gallina ====");
     
        System.out.print("Ingrese el ID de la gallina: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // Limpiar buffer
     
        System.out.print("Ingrese el nombre de la gallina: ");
        String name = scanner.nextLine();
     
        System.out.print("Ingrese el color de la gallina: ");
        String color = scanner.nextLine();

     
        System.out.print("Ingrese la fecha de nacimiento (yyyy-MM-dd): ");
        Date bornOnDate = null;
        while (bornOnDate == null) {
            try {
                String bornOnDateString = scanner.nextLine();
                bornOnDate = dateFormat.parse(bornOnDateString);
            } catch (ParseException e) {
                System.out.println("Formato inválido. Intente nuevamente (yyyy-MM-dd): ");
            }
        }

     
        System.out.print("¿La gallina está mudando? (true/false): ");
        boolean notMolting = scanner.nextBoolean();

     
        Chicken chicken = new Chicken(id, name, color, bornOnDate, notMolting);

     
        System.out.println("\n=== Información de la Gallina ===");
        System.out.println(chicken);

        scanner.close();
    }
}
