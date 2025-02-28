
package ec.edu.espe.singleton.view;

import ec.edu.espe.singleton.model.USTax;

/**
 *
 * @author Lucas Gongora
 */
public class Calculator {

    public static void main(String[] args) {
        USTax tax = USTax.getInstance();
        float total = tax.salesTotal(100.0f, 0.05f);
        System.out.println("Total including tax: $" + total);
    }
}
