
package chickenclassimplementation;

import java.util.Date;

/**
 *
 * @author David Pilatasig
 */
public class ChickenFarmSimulatorApp {
    public static void main(String [] args){
        System.out.println("David's Chicken Farm Simulator");
        
        int id=1;
        String name= "Lucy";
        String color="Brown";
        Date bornOnDate= new Date(2023, 1, 2);
        boolean notMolting= false;
        
        Chicken chicken= new Chicken(id, name, color, 14, bornOnDate, notMolting);
        
        System.out.println("Chicken -->" + chicken.toString());
        System.out.println("Chicken id -->" + chicken.getId());
    }
}
