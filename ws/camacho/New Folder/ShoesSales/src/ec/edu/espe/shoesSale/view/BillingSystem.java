package ec.edu.espe.shoesSale.view;
import ec.edu.espe.fileManager.JsonManager;
import ec.edu.espe.saveTaxes.SalesTax;

/**
 *
 * @author mateo
 */
public class BillingSystem {
    public static void main(String[] args){
        float shoesPrice;
        shoesPrice = 10.0F;
        float ivaValue;
        float totalPrice;
        ivaValue = SalesTax.computeIva(shoesPrice, ivaPercentage);
        totalPrice = shoesPrice + ivaValue;
        
        System.out.println("Shoes Price is --> " + shoesPrice);
        System.out.println("Iva for Shoes is ---> " + ivaValue);
        System.out.println("Total Price is ---> " + totalPrice);
        
        JsonManager.insert(float String.copyValueOf(totalPrice), "shoesPrice.json");
        
    }
}
