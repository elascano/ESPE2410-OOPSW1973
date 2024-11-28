package ec.edu.espe.farmsimulator.view;

import ec.edu.espe.farmsimulator.model.Chicken;
import java.util.Date;

/**
 *
 * @author Andrés Espinosa
 */
public class FarmSimulatorApp {

    public static void main(String[] args) {
        System.out.println("Espinosa's Chicken Farm Simulator");
        
        Chicken chicken;
        int id =1;
        String name="Lucy";
        String color="White";
        Date bornOnDate= new Date(2023, 1, 21);
        boolean notMolting=false;
        chicken = new Chicken(0, name, color, bornOnDate, true);
        
        System.out.println("Chicken -->" + chicken);
        System.out.println("Chicken -->"+ chicken.getId());
        
        chicken.setId(1);
        chicken.setName("Maruja");
        System.out.println("Chicken -->" + chicken);
    }
}
