package ec.edu.espe.farmSimulator.view;

import ec.edu.espe.farmSimulator.model.Chicken;
import java.util.Date;

/**
 *
 * @author David Cuichan!
 */
public class FarmSimulatorApp {
    public static void main(String[] args) {
        System.out.println("Hector's Chicken Farm Simulator");
        
        Chicken chicken;
        int id = 1;
        String name = "Lucy";
        String color = "White";
        Date bornOnDate = new Date(2023, 1, 2);
        boolean notMolting = false;     
        chicken = new Chicken(id, name, color, bornOnDate, notMolting);

        System.out.println("chicken -->" + chicken);
        System.out.println("chicken -->" + chicken.getId());
        
        chicken.setId(1);
        chicken.setName("maruja");
        System.out.println("chicken -->" + chicken);
    }
}
