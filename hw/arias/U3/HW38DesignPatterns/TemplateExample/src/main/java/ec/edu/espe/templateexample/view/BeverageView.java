package ec.edu.espe.templateexample.view;

import java.util.Scanner;

/**
 *
 * @author Alan Arias
 */
public class BeverageView {
    private Scanner scanner;
    
    public BeverageView() {
        scanner = new Scanner(System.in);
    }
    
    public void displayPreparingTea() {
        System.out.println("Making tea ...");
    }
    
    public void displayPreparingCoffee() {
        System.out.println("Making coffee ...");
    }
    
    public boolean askForTeaCondiments() {
        System.out.print("Would you like lemon with your tea (y/n)? ");
        return scanner.nextLine().toLowerCase().startsWith("y");
    }
    
    public boolean askForCoffeeCondiments() {
        System.out.print("Would you like milk and sugar with your coffee (y/n)? ");
        return scanner.nextLine().toLowerCase().startsWith("y");
    }
}