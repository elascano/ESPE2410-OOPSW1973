package ec.edu.espe.view;

import ec.edu.espe.model.TaxRateCalculator;
import ec.edu.espe.view.TaxReportView;
import ec.edu.espe.controller.TaxHandlerController;

import java.util.Scanner;

/**
 *
 * @author Klever Jami
 */
public class Singleton {

    public static void main(String[] args) {
        TaxRateCalculator taxModel = TaxRateCalculator.getInstance();
        TaxReportView taxView = new TaxReportView();
        TaxHandlerController controller = new TaxHandlerController(taxModel, taxView);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the amount: ");
        double amount = scanner.nextDouble();

        controller.calculateAndShowTotal(amount);
    }
}
