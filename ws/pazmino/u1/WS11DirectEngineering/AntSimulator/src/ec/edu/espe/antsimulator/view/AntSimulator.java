package ec.edu.espe.antsimulator.view;

import ec.edu.espe.antsimulator.model.Ant;
import ec.edu.espe.antsimulator.model.Cell;
import ec.edu.espe.antsimulator.model.Colony;
import ec.edu.espe.antsimulator.model.Food;
import java.util.ArrayList;

/**
 *
 * @author Brandon Pazmino <www.espe.edu.ec>
 */
public class AntSimulator {

    public static void main(String[] args) {
        Ant ant;
        Cell cell;
        Food food;
        food = new Food(3);
        cell = new Cell(0, 0);
        ant = new Ant(cell, 0);

       
        ArrayList<Ant> ants;
        ants = null;
        Colony colony = new Colony(ants);
         ant.carry(food);
        


        colony.run();
     
       
        
    }

}
