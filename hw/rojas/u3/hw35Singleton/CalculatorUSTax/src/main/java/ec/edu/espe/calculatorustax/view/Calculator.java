
package ec.edu.espe.calculatorustax.view;

import ec.edu.espe.calculatorustax.model.USTax;

/**
 *
 * @author Matias Rojas
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
