
package ec.edu.espe.directEngineering.view;

import ec.edu.espe.directEngineering.model.Ant;
import ec.edu.espe.directEngineering.model.Cell;
import ec.edu.espe.directEngineering.model.Colony;
import java.util.ArrayList;
import ec.edu.espe.directEngineering.model.Food;

/**
 *
 * @author LABS-DCCO
 */
public class AntSimulatorApp {
    public static void main(String [] args){
        
        System.out.println("The David's Ant Simulator is running");
        Ant ant;
        ArrayList<Ant> ants;
        ants=null;
        Food food;
        
        Cell cell;
        
        cell= new Cell(0, 0);
                
        Colony colony1= new Colony(ants);
        
        ant= new Ant(cell, 1);
        
        colony1.run();
        ant.carring(new Food(3));
        
    }
}
