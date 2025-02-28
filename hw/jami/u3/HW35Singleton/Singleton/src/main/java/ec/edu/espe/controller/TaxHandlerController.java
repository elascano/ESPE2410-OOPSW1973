package ec.edu.espe.controller;

import ec.edu.espe.model.TaxRateCalculator;
import ec.edu.espe.view.TaxReportView;

/**
 *
 * @author Klever Jami
 */
public class TaxHandlerController {

    private TaxRateCalculator taxModel;
    private TaxReportView taxView;

    public TaxHandlerController(TaxRateCalculator taxModel, TaxReportView taxView) {
        this.taxModel = taxModel;
        this.taxView = taxView;
    }

    public void calculateAndShowTotal(double amount) {
        double total = amount + taxModel.calculateTax(amount);
        taxView.showTotal(total);
    }
}
