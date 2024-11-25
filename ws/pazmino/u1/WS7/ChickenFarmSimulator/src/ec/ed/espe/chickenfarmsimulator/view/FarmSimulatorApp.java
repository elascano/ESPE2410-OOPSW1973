package ec.ed.espe.chickenfarmsimulator.view;

import ec.ed.espe.chickenfarmsimulator.model.Chicken;
import java.util.Date;

/**
 *
 * @author Brandon Pazmino
 */
public class FarmSimulatorApp {

    public static void main(String[] args) {
        System.out.println("Brandon's Chicken Farm Simulator");

        Chicken chicken;
        int id=1;
        String name="Lucy";
        String color="White";
        Date bornOnDate= new Date(23, 1, 2);
        boolean notMolting=false;
        
        
        chicken = new Chicken(id, name, color, bornOnDate, notMolting);

        System.out.println("chicken--> " + chicken);
        System.out.println("chicken--> " + chicken.getId());
        chicken.setId(1);
        chicken.setName("Lucy");
        System.out.println("chicken-->" + chicken);

    }

}
