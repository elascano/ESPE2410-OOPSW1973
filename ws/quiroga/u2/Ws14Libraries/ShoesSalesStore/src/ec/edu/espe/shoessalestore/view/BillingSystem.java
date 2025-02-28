
package ec.edu.espe.shoessalestore.view;
import ec.edu.espe.salestaxes.SalesTax;
import ec.edu.espe.filemanager.JsonManager;
/**
 *
 * @author Esteban Quiroga 
 */
public class BillingSystem {
    public static void main(String[] args) {
        float shoesPrice;
        float ivaPercentage;
        float ivaValue;
        float totalPrice;
        
        ivaPercentage = 15.0F;
        shoesPrice = 10.0F;
        ivaValue = SalesTax.computeIva(shoesPrice, ivaPercentage);
        totalPrice = shoesPrice + ivaValue;
        
        System.out.println("Shoe price is --> "+shoesPrice);
        System.out.println("IVA for shoe is --> "+ ivaValue);
        System.out.println("Total price is --> "+ totalPrice);
        
        JsonManager.insert(String.valueOf(totalPrice), "ShoesPrices.json");
        
    }
}
