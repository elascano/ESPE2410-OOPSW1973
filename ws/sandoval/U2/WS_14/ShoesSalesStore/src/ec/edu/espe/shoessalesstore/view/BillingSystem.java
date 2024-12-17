package ec.edu.espe.shoessalesstore.view;

import ec.edu.espe.salestaxes.SaleTax;
import ec.edu.espe.filemanager.JsonManager;

/**
 *
 * @author Andrés Sandoval
 */
public class BillingSystem {
    public static void main(String[] args){
        float shoesPrice;
        float ivaPercentage;
        ivaPercentage = 15.0F;
        float ivaValue;
        shoesPrice = 10.0F;
        float totalPrice;
        ivaValue = SaleTax.computeIva(shoesPrice, ivaPercentage);
        totalPrice =shoesPrice + ivaValue;
        
        System.out.println("Shoes price is --> "+ shoesPrice);
        System.out.println("Iva for shoes is --> " + ivaValue);
        System.out.println("Total price is --> " + totalPrice);
        
   
        JsonManager.insert(String.valueOf(totalPrice), "shoesPrices.json");
    }
    
}
