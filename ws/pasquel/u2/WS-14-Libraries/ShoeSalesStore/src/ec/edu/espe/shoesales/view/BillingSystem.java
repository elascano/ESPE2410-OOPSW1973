
package ec.edu.espe.shoesales.view;

import ec.edu.espe.taxes.salestaxes.SalesTax;
import ec.edu.espe.filemanager.jsonManager;
/**
 *
 * @author marlo
 */
public class BillingSystem {
    public static void main(String[] args) {
        float ivaValue;
        float shoesPrice;
        float ivaPercentage = 15.0F;
        shoesPrice = 10.0F;
        float totalPrice;
       
        ivaValue = SalesTax.computeIva(shoesPrice, ivaPercentage);
        totalPrice = shoesPrice + ivaValue;
        
        System.out.println(" Shoes Price is " + shoesPrice);
        System.out.println("Iva add is --->" + ivaValue);
        System.out.println("Total price is ----> " + totalPrice);
        jsonManager.insert(String.valueOf(totalPrice), "shoesPrices.json");
    }
}
