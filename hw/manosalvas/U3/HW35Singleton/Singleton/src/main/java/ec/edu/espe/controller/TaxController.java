package ec.edu.espe.controller;
import ec.edu.espe.model.UsTax;
import ec.edu.espe.view.TaxView;
/**
 *
 * @author Gabriel Manosalvas 
 */
// Clase Controlador que maneja la lógica de negocio
public class TaxController {
    private UsTax taxModel;
    private TaxView taxView;

    public TaxController(UsTax taxModel, TaxView taxView) {
        this.taxModel = taxModel;
        this.taxView = taxView;
    }

    public void calculateAndShowTotal(double amount) {
        double total = amount + taxModel.calculateTax(amount);
        taxView.showTotal(total);
    }
}
