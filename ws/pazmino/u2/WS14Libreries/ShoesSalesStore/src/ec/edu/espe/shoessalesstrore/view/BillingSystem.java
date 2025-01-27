package ec.edu.espe.shoessalesstrore.view;

import ec.edu.espe.salestaxes.SalesTax;
import ec.edu.espe.filemanager.JsonManager;
/**
 *
 * @author Brandon Pazmino
 */
public class BillingSystem {
    public static void main(String[] args) {
        float shoesPrice;
        float ivaPercentage;
        
        float ivaValue;
        shoesPrice = 10.0F;
        ivaPercentage = 15.0F;
        float totalPrice;
        ivaValue = SalesTax.computeIva(shoesPrice, ivaPercentage);
        String name;
        totalPrice = shoesPrice + ivaValue;
        
        System.out.println("Shoes Price IS :" + shoesPrice);
        System.out.println("Iva for shoes is : " + ivaValue);
        System.out.println("Total price is : " + totalPrice);
        
      
        JsonManager.insert(String.valueOf(totalPrice),"shoesPrices.json");
        
    }
}
