package ec.edu.espe.shoessalesstore.view;
import ec.edu.espe.filemanager.JsonManager;
import ec.edu.espe.salestaxes.SalesTax;

/**
 *
 * @author David Pilatasig
 */
public class BillingSystem {
    public static void main(String[] args){
        float shoesPrice;
        float ivaPercentage;
        
        float ivaValue;
        float totalPrice;
        
        shoesPrice=10.0F;
        ivaPercentage=15.0f;
        
        ivaValue=SalesTax.computeIva(shoesPrice, ivaPercentage);
        totalPrice=shoesPrice+ivaValue;
        
        System.out.println("Shoes price is --> " + shoesPrice);
        System.out.println("Iva for shoes is --> " + ivaValue);
        System.out.println("Total price is --> " + totalPrice);
        
        JsonManager.insert(String.valueOf(totalPrice), "shoesPrice.json");
    }
    
}
