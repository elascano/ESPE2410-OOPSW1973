package ec.espe.edu.antsimulator.view;

import ec.espe.edu.antsimulator.model.Ant;
import ec.espe.edu.antsimulator.model.Cell;
import ec.espe.edu.antsimulator.model.Colony;
import ec.espe.edu.antsimulator.model.Food;
import java.util.ArrayList;

/**
 *
 * @author Alexander Maza
 */
public class AntSimulator {
    public static void main(String[] args) {
        
    Ant ant;
    Cell cell;
    cell = new Cell(0,0);
    ArrayList<Ant> ants;
    ants = null;
    Colony colony = new Colony(ants);
    ant = new Ant(cell, 0);
    colony.run();
    ant.carry(new Food(3));
}

}
