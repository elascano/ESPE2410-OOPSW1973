<<<<<<< HEAD
package ec.edu.espe.farmsimulator.view;

import ec.edu.espe.farmsimulator.model.Chicken;
import java.util.Date;
import utils.FileManager;
import java.util.Scanner;

/**
 *
 * @author Mateo Camacho
 */
public class FarmSimulatorApp {

    public static void main(String[] args) {
        System.out.println("Mateo's Chicken Farm Simulator");

        Scanner scanner = new Scanner(System.in);

        // Pedir datos del pollo al usuario
        System.out.print("Enter chicken ID: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // Consumir la nueva línea

        System.out.print("Enter chicken name: ");
        String name = scanner.nextLine();

        System.out.print("Enter chicken color: ");
        String color = scanner.nextLine();

        System.out.print("Enter chicken age in months: ");
        int ageMonths = scanner.nextInt();
        scanner.nextLine(); // Consumir la nueva línea

        System.out.print("Is the chicken molting? (true/false): ");
        boolean notMolting = scanner.nextBoolean();
        scanner.nextLine(); // Consumir la nueva línea

        Date bornOnDate = new Date(); // Usar la fecha actual para simplificar

        // Crear un objeto Chicken con los datos proporcionados
        Chicken chicken = new Chicken(id, name, color, bornOnDate, notMolting);
        chicken.setAgeMonths(ageMonths); // Ajustar la edad en meses

        // Convertir el objeto Chicken a JSON manualmente
        String jsonData = chicken.toJson();

        // Guardar los datos JSON en un archivo usando FileManager
        FileManager.save(jsonData, "chicken", "json");
        
        String[] headers = { "ID", "Name", "Color", "AgeMonths", "BornOnDate", "NotMolting" };
        String[] values = {
            String.valueOf(chicken.getId()),
            chicken.getName(),
            chicken.getColor(),
            String.valueOf(chicken.getAgeMonths()),
            chicken.getBornOfDate().toString(),
            String.valueOf(chicken.isNotMolting())
        };
        FileManager.saveToCsv("chickens", headers, values);


        System.out.println("Chicken ---> " + chicken);
    }
}
=======
package ec.edu.espe.farmsimulator.view;

import ec.edu.espe.farmsimulator.model.Chicken;
import java.util.Date;

/**
 *
 * @author Mateo Camacho
 */
public class FarmSimulatorApp {

    public static void main(String[] args) {
        System.out.println("Mateo's Chiken Farm Simulator");
        Chicken chicken;
        int id=1;
        String name="Lucy";
        String color="White";
        Date bornOfDate=new Date();
        boolean notMolting=false;
        chicken = new Chicken(0, name, color, bornOfDate, true);
        System.out.println("Chicken --->" + chicken);
        System.out.println("Chicken --->" + chicken.getId());
        
        chicken.setId(1);
        chicken.setName("Maruja");
        chicken.setColor("blue");
        
    }
}
>>>>>>> 3dd5cd029ea153644e6cf1c375933b956a6f8e39
