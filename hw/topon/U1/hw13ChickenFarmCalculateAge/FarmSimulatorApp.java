package ec.edu.espe.farmsimulator.view;

import ec.edu.espe.farmsimulator.model.Chicken;

import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Alexander Ullco
 */
public class FarmSimulatorApp {

    public static void main(String[] args) {
        System.out.println("Alexander's Chicken Farm Simulator");

        Chicken chicken = createChickenFromUserInput();

        if (chicken != null) {
            System.out.println("Information of chicken:");
            System.out.println(chicken);

            saveChickenToJsonFile(chicken);
        } else {
            System.out.println("Review the entered data.");
        }
    }

    private static Chicken createChickenFromUserInput() {
        Scanner scanner = new Scanner(System.in);
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd"); // Patrón corregido

        try {
            System.out.println("Enter the ID of the chicken:");
            int id = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer

            System.out.println("Enter the name of the chicken:");
            String name = scanner.nextLine();

            System.out.println("Enter the color of the chicken:");
            String color = scanner.nextLine();

            System.out.println("Enter the date of birth of the chicken (yyyy-MM-dd):");
            String bornOnDateString = scanner.nextLine();
            Date bornOnDate = dateFormat.parse(bornOnDateString); // Se analiza la fecha

            System.out.println("Is the chicken molting? (true/false):");
            boolean notMolting = !scanner.nextBoolean();

            // Crear y retornar el objeto Chicken
            return new Chicken(id, name, color, bornOnDate, notMolting);
        } catch (ParseException e) {
            System.out.println("The date format must be yyyy-MM-dd.");
        } catch (Exception e) {
            System.out.println("Error, check the entered data: " + e.getMessage());
        }

        return null;
    }

    private static void saveChickenToJsonFile(Chicken chicken) {
        if (chicken == null) {
            System.out.println("Could not save information because the file is null.");
            return;
        }

        try (FileWriter fileWriter = new FileWriter("chicken.json")) {
            fileWriter.write("{\n");
            fileWriter.write("  \"id\": " + chicken.getId() + ",\n");
            fileWriter.write("  \"name\": \"" + chicken.getName() + "\",\n");
            fileWriter.write("  \"color\": \"" + chicken.getColor() + "\",\n");
            fileWriter.write("  \"ageInMonths\": " + chicken.getAgeInMonths() + ",\n");
            fileWriter.write("  \"bornOnDate\": \"" + chicken.getBornOnDate() + "\",\n");
            fileWriter.write("  \"notMolting\": " + chicken.isNotMolting() + "\n");
            fileWriter.write("}");
            System.out.println("Saved information in 'chicken.json'.");
        } catch (IOException e) {
            System.out.println("Could not save information: " + e.getMessage());
        }
    }
}
