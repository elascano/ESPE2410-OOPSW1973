
package ec.edu.espe.shoessalesstore.view;

import ec.edu.espe.salestaxeslib.SalesTax;
import ec.edu.espe.filemanager.JsonManager;
/**
 *
 * @author Alan Arias
 */
public class BillingSystem {
    public static void main(String[] args) {
        float ivaPercentage;
        float ivaValue;
        float shoesPrice;
        shoesPrice = 10.0F;
        ivaPercentage = 15.0F;
        float totalPrice;
        ivaValue = SalesTax.computeIva(shoesPrice,ivaPercentage);
        totalPrice = shoesPrice + ivaValue;
        System.out.println("Shoes price is --> " + shoesPrice);
        System.out.println("Iva for shoes is --> "+ ivaValue);
        System.out.println("Total price is --> " + totalPrice);
        
        JsonManager.insert(String.valueOf(totalPrice), "shoesPrices.json");
    }
}
