package ec.edu.espe.farmsimulator.view;

import ec.edu.espe.farmsimulator.model.Chicken;
import java.util.Date;

/**
 *
 * @author Lisbeth Tipan
 */
public class FarmSimulatorApp {

    public static void main(String[] args) {
        System.out.println(" Lisbeth Tipan Chicken Farm Simulator");
        
        Chicken chicken;
        int id=1;
        String name="Lucy";
        String color="White";
        Date bornOnDate=new Date(2023, 1, 2);
        boolean notHoling=false;
        chicken = new Chicken(id, name, color, bornOnDate, notHoling);
        
        System.out.println("chicken -->" + chicken);
        System.out.println("chicken -->" + chicken.getId());
        
        chicken.setId(1);
        chicken.setName("Maruja");
        System.out.println("chicken -->" + chicken);


    }

}
