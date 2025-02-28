package ec.edu.espe.antisimulator.view;

import ec.edu.espe.antsimulator.model.Ant;
import ec.edu.espe.antsimulator.model.Cell;
import ec.edu.espe.antsimulator.model.Colony;
import ec.edu.espe.antsimulator.model.Food;
import java.util.ArrayList;

/**
 *
 * @author Sebastian Charij
 */
public class AntSimulator {
    public static void main(String[] args) {
        Ant ant;
        Cell cell;
        cell = new Cell(0,0);
        
        ArrayList<Ant> ants;
        ants=null;
        Colony colony = new Colony(ants);
        
        ant = new Ant(cell,0);
        
        colony.run();
        ant.carry(new Food(3));
    }
}
