package ec.edu.espe.ustaxcalculator.view;

import ec.edu.espe.ustaxcalculator.model.USTax;

/**
 *
 * @author David Cuichan
 */
public class Calculator {

    public static void main(String[] args) {
        USTax tax = USTax.getInstance();
        float total = tax.salesTotal(100.0f);
        System.out.println("Total: " + total);
    }
}
