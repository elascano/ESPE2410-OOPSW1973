

package ec.edu.espe.antSimulator.model;

import java.util.ArrayList;

/**
 *
 * @author LABS-DCCO
 */
public class Cell {
    int col;
    int raw;

    @Override
    public String toString() {
        return "Cell{" + "col=" + col + ", raw=" + raw + '}';
    }

    public Cell(int col, int raw) {
        this.col = col;
        this.raw = raw;
    }
    
public void receievePheromone(PheromoneDrop pheromoneDrop){
            System.out.println("The cell is receiving a pheromone drop");
}
 public ArrayList<Ant> getAnts(){
     return new ArrayList<Ant>();
 }
}
