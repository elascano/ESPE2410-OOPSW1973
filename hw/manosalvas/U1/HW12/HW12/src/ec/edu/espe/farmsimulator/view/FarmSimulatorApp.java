package ec.edu.espe.farmsimulator.view;

import ec.edu.espe.farmsimulator.model.Chicken;
import ec.edu.espe.farmsimulator.model.FileManager;
import java.util.Scanner;
import java.util.Date;

public class FarmSimulatorApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Título
        System.out.println("Gabriel's Chicken Farm Simulator");

        // Solicitar datos del usuario
        System.out.print("Enter chicken id: ");
        int id = scanner.nextInt();

        System.out.print("Enter chicken name: ");
        scanner.nextLine(); // Consumir el salto de línea
        String name = scanner.nextLine();

        System.out.print("Enter chicken color: ");
        String color = scanner.nextLine();

        // Solicitar fecha de nacimiento
        System.out.print("Enter chicken born year: ");
        int year = scanner.nextInt();
        System.out.print("Enter chicken born month: ");
        int month = scanner.nextInt();
        System.out.print("Enter chicken born day: ");
        int day = scanner.nextInt();
        Date bornOnDate = new Date(year - 1900, month - 1, day); // Ajuste de la fecha

        System.out.print("Is the chicken molting? (true/false): ");
        boolean notMolting = !scanner.nextBoolean(); // Invertir la lógica

        // Crear el objeto Chicken
        Chicken chicken = new Chicken(id, name, color, bornOnDate, notMolting);

        // Mostrar los detalles del pollo creado
        System.out.println("Created Chicken: " + chicken);

        // Mostrar la edad en meses
        System.out.println("Age in months: " + chicken.getComputeAgeInMonths());

        // Convertir los datos a CSV y JSON
        String csvData = chicken.getId() + "," + chicken.getName() + "," + chicken.getColor() + ","
                         + chicken.getComputeAgeInMonths() + "," + chicken.getBornofDate() + "," + chicken.isNotMoling();
        String jsonData = "{\"id\":" + chicken.getId() + ",\"name\":\"" + chicken.getName() + "\","
                          + "\"color\":\"" + chicken.getColor() + "\",\"age\":" + chicken.getComputeAgeInMonths()
                          + ",\"bornOnDate\":\"" + chicken.getBornofDate() + "\",\"notMolting\":"
                          + chicken.isNotMoling() + "}";

        // Guardar en CSV
        FileManager.save(csvData, "chickens.csv", "csv");

        // Guardar en JSON
        FileManager.save(jsonData, "chickens.json", "json");

        scanner.close();
    }
}
