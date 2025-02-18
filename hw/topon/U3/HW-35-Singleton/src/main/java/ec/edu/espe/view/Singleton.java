package ec.edu.espe.view;

/**
 *
 * @author Mateo Topon
 */

import ec.edu.espe.model.ECTax;
import ec.edu.espe.view.TaxView;
import ec.edu.espe.controller.TaxController;

import java.util.Scanner;

public class Singleton {
    public static void main(String[] args) {
        ECTax taxModel = ECTax.getInstance();
        TaxView taxView = new TaxView();
        TaxController controller = new TaxController(taxModel, taxView);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the amount be calculated: ");
        double amount = scanner.nextDouble();

        controller.calculateAndShowTotal(amount);
    }
}
