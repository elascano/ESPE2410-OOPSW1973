package ec.edu.espe.farmSimulator.view;

import ec.edu.espe.farmSimulator.model.Chicken;
import java.util.Date;
import java.util.Scanner;
import utils.FileSaver;

/**
 *
 * @author David Cuichan!
 */
public class FarmSimulatorApp {
    public static void main(String[] args) {
        System.out.println("Hector's Chicken Farm Simulator");
        
        Scanner scanner;
        Chicken chicken;
        int id;
        String name;
        String color;
        int year;
        int month;
        int day;
        Date bornOnDate;
        boolean notMolting;
        
        scanner=new Scanner(System.in);
        System.out.print("Enter the id: ");
        id=scanner.nextInt();
        scanner.nextLine();
        System.out.print("\nEnter the name: ");
        name=scanner.nextLine();
        System.out.print("\nEnter the color: ");
        color=scanner.nextLine();
        System.out.println("\nEnter the birthdate: ");
        System.out.print("\nEnter the year: ");
        year=scanner.nextInt();
        System.out.print("\nEnter the month: ");
        month=scanner.nextInt();
        System.out.print("\nEnter the day: ");
        day=scanner.nextInt();
        
        bornOnDate=new Date(year-1900,month-1,day);
        System.out.print("Is not molting? (true/false): ");
        notMolting=scanner.nextBoolean();
        scanner.close();
        
        chicken = new Chicken(id, name, color, bornOnDate, notMolting);

        System.out.println("chicken ---> " + chicken);
        
        FileSaver fileSaver = new FileSaver();
        fileSaver.saveAsCSV(chicken, "chicken.csv");
        fileSaver.saveAsJSON(chicken, "chicken.json");
    }
}
