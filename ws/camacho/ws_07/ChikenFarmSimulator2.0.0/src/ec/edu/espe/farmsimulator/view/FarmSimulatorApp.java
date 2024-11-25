package ec.edu.espe.farmsimulator.view;

import ec.edu.espe.farmsimulator.model.Chicken;
import java.util.Date;

/**
 *
 * @author Mateo Camacho
 */
public class FarmSimulatorApp {

    public static void main(String[] args) {
        System.out.println("Mateo's Chiken Farm Simulator");
        Chicken chicken;
        int id=1;
        String name="Lucy";
        String color="White";
        Date bornOfDate=new Date();
        boolean notMolting=false;
        chicken = new Chicken(0, name, color, bornOfDate, true);
        System.out.println("Chicken --->" + chicken);
        System.out.println("Chicken --->" + chicken.getId());
        
        chicken.setId(1);
        chicken.setName("Maruja");
        chicken.setColor("blue");
        
    }
}
