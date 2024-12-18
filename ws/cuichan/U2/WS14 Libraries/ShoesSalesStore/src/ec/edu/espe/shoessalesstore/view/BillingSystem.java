package ec.edu.espe.shoessalesstore.view;
import ec.edu.espe.salestaxes.SalesTax;

/**
 *
 * @author David Cuichan
 */
public class BillingSystem {
    public static void main(String[] args) {
        float shoesPrice;
        float ivaPercentage;
        float ivaValue;
        float totalPrice;
        
        shoesPrice = 10.0F;
        ivaPercentage = 15.0F;
        
        ivaValue = SalesTax.computeIva(shoesPrice, ivaPercentage);
        totalPrice = shoesPrice + ivaValue;
        
        System.out.println("Shoes prices is --> " + shoesPrice);
        System.out.println("Iva for shoes is --> " + 1.5);
        System.out.println("Total price --> " + totalPrice);
        
    }
}
