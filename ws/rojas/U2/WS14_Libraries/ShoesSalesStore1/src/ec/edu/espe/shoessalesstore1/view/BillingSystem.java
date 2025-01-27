
package ec.edu.espe.shoessalesstore1.view;



import ec.edu.espe.filemanager.model.JsonManager;
import ec.edu.espe.salestaxes.SalesTax;
        
/**
 *
 * @author Matias Rojas
 */
public class BillingSystem {
    public static void main(String[] args){
        float shoesPrice;        
        float ivaPercentage;
        float ivaValue;
        shoesPrice = 10.0F;
        ivaPercentage = 15.0F;
        float totalPrice;
        ivaValue = SalesTax.computeIva(shoesPrice, ivaPercentage);
        totalPrice = shoesPrice + ivaValue;
        String name;
        
        System.out.println("Shoes price is --> " + shoesPrice);
        System.out.println("Iva for shoes is --> " + ivaValue);
        System.out.println("Total price is --> " + totalPrice);
        
        JsonManager.insert(String.valueOf(totalPrice),"shoesprices.json");
    }
}
