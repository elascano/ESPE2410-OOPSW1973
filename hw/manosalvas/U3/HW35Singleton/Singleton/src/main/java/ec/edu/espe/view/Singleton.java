package ec.edu.espe.view;
import ec.edu.espe.model.UsTax;
import ec.edu.espe.view.TaxView;
import ec.edu.espe.controller.TaxController;

import java.util.Scanner;
/**
 *
 * @author Gabriel Manosalvas 
 */
public class Singleton {
    public static void main(String[] args) {
        UsTax taxModel = UsTax.getInstance();
        TaxView taxView = new TaxView();
        TaxController controller = new TaxController(taxModel, taxView);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the amount: ");
        double amount = scanner.nextDouble();

        controller.calculateAndShowTotal(amount);
    }
}