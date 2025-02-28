package ec.edu.espe.farmsimulator.view;

import ec.edu.espe.farmsimulator.model.Chicken;
import java.util.Date;

/**
 *
 * @author Dennis Paucar
 */
public class FarmSimulatorApp {

    public static void main(String[] args) {
        System.out.println("Dennis Chicken Farm Simulator");
        
        Chicken chicken;
        int id=1;
        String name="Lucy";
        String color="White";
        Date bornOnDate=new Date(2023, 1, 2);
        boolean notMolting=false;
        
        chicken = new Chicken(id, name, color, bornOnDate, notMolting);
        
        System.out.println("chicken -->" + chicken);
        System.out.println("chicken -->" + chicken.getId());
        
        chicken.setId(1);
        chicken.setName("Lucy");
        System.out.println("chicken -->" + chicken);
    }
}
