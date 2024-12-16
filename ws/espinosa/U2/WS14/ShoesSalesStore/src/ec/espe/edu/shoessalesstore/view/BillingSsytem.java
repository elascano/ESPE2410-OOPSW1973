package ec.espe.edu.shoessalesstore.view;

import ec.edu.espe.salestaxes.SalesTax;
import ec.edu.espe.jsonmanager.JsonManager;

/**
 *
 * @author Andrés Espinosa
 */
public class BillingSsytem {
    public static void main(String[] args) {
        float shoesPrice;
        float ivaPercentage;
        float ivaValue;
        shoesPrice = 10.0F;
        ivaPercentage = 15.0F;
        float totalPrice;
        ivaValue = SalesTax.computeIva(shoesPrice,ivaPercentage);
        totalPrice = shoesPrice + ivaValue;
        
        
        System.out.println("Shes price is -->" + shoesPrice);
        System.out.println("Iva for shoes is -->" + ivaValue);
        System.out.println("Total price is -->" + totalPrice);
        JsonManager.insert(String.valueOf(totalPrice), "shoesPrice.json");
    }
}
