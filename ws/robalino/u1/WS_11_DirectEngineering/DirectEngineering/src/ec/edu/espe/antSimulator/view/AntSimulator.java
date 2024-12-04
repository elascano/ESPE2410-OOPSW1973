

package ec.edu.espe.antSimulator.view;

import ec.edu.espe.antSimulator.model.Ant;
import ec.edu.espe.antSimulator.model.Cell;
import ec.edu.espe.antSimulator.model.Colony;
import ec.edu.espe.antSimulator.model.Food;
import java.util.ArrayList;

/**
 *
 * @author LABS-DCCO
 */
public class AntSimulator {
    public static void main(String[] args) {
        Ant ant;
        Cell cell;
        cell = new Cell(0 , 0);
        
        
        
        ArrayList<Ant> ants;
        ants = null;
        Colony colony = new Colony(ants);
        colony.run();
        ant = new Ant(cell, 0);
        ant.carry(new Food(3));
        
    }

}
