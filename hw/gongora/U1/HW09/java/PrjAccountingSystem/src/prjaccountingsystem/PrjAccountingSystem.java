
package prjaccountingsystem;

import ec.espe.edu.model.Inventory;
import ec.espe.edu.model.Product;

/**
 *
 * @author Lucas
 * @version 0.1.0
 * @since 2024
 */
public class PrjAccountingSystem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Product chocolate=new Product();
        Inventory inventory=new Inventory();
        System.out.println("This is a product ->"+ chocolate);
        System.out.println("This is a inventory ->"+inventory);

    }
        
    
}
