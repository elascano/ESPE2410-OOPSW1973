package ec.edu.espe.shoessalesstore.view;

import ec.edu.espe.salestaxes.SalesTax;
import ec.edu.espe.filemanager.JsonManager;
/**
 *
 * @author Lucas Gongora
 */
public class BillingSystem {
    public static void main(String[] args) {
        float  shoesPrice;
        float ivaPercentage;
        float ivaValue ;
        shoesPrice = 10.0F;
        float totalPrice;
        
        ivaPercentage = 15.0F;
        ivaValue = SalesTax.computeIva(shoesPrice, ivaPercentage);
        
        totalPrice = shoesPrice + ivaValue;
        
        
        System.out.println("Shoes price is -->"+shoesPrice);
        System.out.println("Iva for shoes is -->"+ivaValue);
        System.out.println("Total price is -->"+totalPrice);
        
        JsonManager.insert(String.valueOf(totalPrice) , "shoesPrices.json");
        
       
        
        
        
    }
}