package ec.edu.espe.templateexample.view;
import java.util.Scanner;

/**
 *
 * @author Mateo Topon
 */
public class BeverageView {
    private Scanner scanner;
    
    public BeverageView() {
        scanner = new Scanner(System.in);
    }
    
    public void displayPreparingTea() {
        System.out.println("Preparing tea ...");
    }
    
    public void displayPreparingCoffee() {
        System.out.println("Preparing coffee ...");
    }
    
    public boolean askForTeaCondiments() {
        System.out.print("Would you like to add lemon to your tea? (y/n)? ");
        return scanner.nextLine().toLowerCase().startsWith("y");
    }
    
    public boolean askForCoffeeCondiments() {
        System.out.print("Would you like to add milk and sugar with your coffee (y/n)? ");
        return scanner.nextLine().toLowerCase().startsWith("y");
    }
}