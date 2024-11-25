
package prjcondominiummanagement;

import ec.edu.espe.model.Tenant;
import ec.edu.espe.model.Vehicle;

/**
 *
 * @author Jardel Maza
 * @version 0.1.0
 * @since 2024
 */
public class PrjCondominiumManagement {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Hello Tenants");
        Tenant tenant = new Tenant();
        System.out.println("This is a Tenant -->" + tenant);
        Vehicle vehicle = new Vehicle();
        System.out.println("This is a Vehicle-->" + vehicle);
                
    }
    
}
