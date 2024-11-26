package ec.edu.espe.farmsimulator.view;

import ec.edu.espe.farmsimulator.model.Chicken;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import utils.FileManager;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Klever Jami
 */
public class FarmSimulatorApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Chicken Farm Simulator!");

        System.out.print("Enter Chicken ID: ");
        int id = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter Chicken Name: ");
        String name = scanner.nextLine();

        System.out.print("Enter Chicken Color: ");
        String color = scanner.nextLine();

        System.out.print("Enter Chicken Born On Date (yyyy-MM-dd): ");
        String bornOnDateInput = scanner.nextLine();

        Date bornOnDate = null;
        try {
            bornOnDate = new SimpleDateFormat("yyyy-MM-dd").parse(bornOnDateInput);
        } catch (ParseException e) {
            System.out.println("Invalid date format. Please use yyyy-MM-dd.");
            return;
        }

        System.out.print("Is the chicken molting? (true/false): ");
        boolean notMolting = !scanner.nextBoolean();

        Chicken chicken = new Chicken(id, name, color, bornOnDate, notMolting);
        System.out.println("Chicken created: " + chicken);

        String data = id + "," + name + "," + color + "," + bornOnDate + "," + notMolting;
        FileManager.save(data, "chickenData", "csv");
        FileManager.save(data, "chickenData", "json");
    }
}
