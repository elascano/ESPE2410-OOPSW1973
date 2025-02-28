
package ec.edu.espe.singleton.view;

import ec.edu.espe.singleton.model.USTax;

/**
 *
 * @author abner
 */
public class Calculator {
    public static void main(String[] args) {

        USTax taxCalculator = USTax.getInstance();

        taxCalculator.setTaxRate(11.2);
        double totalWith11_2 = taxCalculator.salesTotal(100);
        System.out.println("Total con 11.2% de impuestos: $" + totalWith11_2);

        taxCalculator.setTaxRate(9.1);
        double totalWith9_1 = taxCalculator.salesTotal(100);
        System.out.println("Total con 9.1% de impuestos: $" + totalWith9_1);
    }
    }


