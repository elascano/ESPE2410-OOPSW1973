package condoadminsystem;

import ec.espe.edu.model.Concierge;
import ec.espe.edu.model.House;
import ec.espe.edu.model.Resident;

/**
 *
 * @author Klever Jami
 * @version 0.1.0
 * @since 2024
 */
public class CondoAdminSystem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         System.out.println("hello condoManage");

        House house = new House();
        Concierge concierge = new Concierge();
        Resident resident = new Resident();
        System.out.println("House --> " + house);
        System.out.println("Concierge --> " + concierge);
        System.out.println("Resident --> " + resident);
    }
        
}
