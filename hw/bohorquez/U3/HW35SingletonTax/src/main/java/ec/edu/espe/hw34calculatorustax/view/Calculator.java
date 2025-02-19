package ec.edu.espe.hw34calculatorustax.view;

import ec.edu.espe.hw34calculatorustax.model.USTax;

/**
 *
 * @author Brandon Pazmino
 */
public class Calculator {
    public static void main(String[] args) {
        USTax tax = USTax.getInstance();
        float subtotal = 10.0F;
        float total = tax.salesTotal(subtotal);
        System.out.println("The total is --> "+ total);
        
        USTax newTaxInstance = new USTax(0.14F);
        total = newTaxInstance.salesTotal(subtotal);
        System.out.println("The total IVA is --> "+ total + "%");
    }
        
}
