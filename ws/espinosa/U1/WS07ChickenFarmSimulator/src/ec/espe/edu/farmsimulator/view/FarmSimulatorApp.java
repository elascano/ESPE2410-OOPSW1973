package ec.espe.edu.farmsimulator.view;

import Utils.CsvUtil;
import Utils.JsonUtil;
import ec.espe.edu.farmsimulator.model.Chicken;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Andrés Espinosa
 */
public class FarmSimulatorApp {
    public static void main(String[] args) {
        System.out.println("Espinosa's Chicken Farm Simulator");

        List<Chicken> chickens = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the chicken ID; ");
        int id = scanner.nextInt();
        scanner.nextLine(); 

        System.out.println("Enter the chicken name: ");
        String name = scanner.nextLine();

        System.out.println("Enter the chicken color: ");
        String color = scanner.nextLine();

        System.out.println("Enter the chicken's date of birth (yyyy/MM/dd): ");
        String dateString = scanner.next();
        Date bornOnDate = new Date(dateString);
        
        scanner.nextLine();
        
        System.out.println("Is the chicken molting? (true/false): ");
        boolean notMolting = scanner.nextBoolean();
        
        Chicken chicken = new Chicken(id, name, color, bornOnDate, notMolting);
        chickens.add(chicken);

        CsvUtil.writeChickensToCsv("chickens.csv", chickens);
        JsonUtil.writeChickensToJson("chickens.json", chickens);

        List<Chicken> chickensFromJson = JsonUtil.readChickensFromJson("chickens.json");


        System.out.println("Chickens from JSON: " + chickensFromJson);
    }

}