
package ec.edu.espe.singleton.view;

import ec.edu.espe.singleton.model.UsTax;

/**
 *
 * @author Esteban Quiroga 
 */
public class Calculator {
    public static void main(String[] args) {
        UsTax tax = UsTax.getInstance();
        float subtotal = 10.0F;
        float total = tax.salesTotal(subtotal);
        System.out.println("The total for default instance is --> "+ total);
        
        UsTax newTaxInstance = new UsTax(0.15F);
        total = newTaxInstance.salesTotal(subtotal);
        System.out.println("The total for IVA instance is --> "+ total);
    }
}
