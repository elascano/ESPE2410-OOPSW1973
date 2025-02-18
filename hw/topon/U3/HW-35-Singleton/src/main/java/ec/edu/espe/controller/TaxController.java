
package ec.edu.espe.controller;

/**
 *
 * @author Mateo Topon
 */

import ec.edu.espe.model.ECTax;
import ec.edu.espe.view.TaxView;

public class TaxController {
    private ECTax taxModel;
    private TaxView taxView;                                       

    public TaxController(ECTax taxModel, TaxView taxView) {                         //Controlador que maneja el impuesto
        this.taxModel = taxModel;
        this.taxView = taxView;
    }

    public void calculateAndShowTotal(double amount) {                  
        double total = amount + taxModel.calculateTax(amount);
        taxView.showTotal(total);
    }
}
