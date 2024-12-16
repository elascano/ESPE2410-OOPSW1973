

package ec.edu.espe.shoessalesstore.view;
import ec.edu.espe.salestaxes.SelesTax;
/**
 *
 * @author Benjamin Robalino <jabasteam>
 */
public class BillingSystem {
    public static void main(String[] args) {
        float shoesPrice;
        float ivaPercentage;
        float ivaValue;
        
        shoesPrice = 10.0F;
        ivaPercentage = 15.0F;
        float totalPrice;
        ivaValue = SelesTax.computeIva(shoesPrice, ivaPercentage);
        totalPrice = shoesPrice + ivaValue;
        System.out.println("Shoes price is --> " + shoesPrice);
        System.out.println("Iva for shoes ir --> " + ivaValue);
        System.out.println("Total price is --> " + totalPrice);
        
    }
}
