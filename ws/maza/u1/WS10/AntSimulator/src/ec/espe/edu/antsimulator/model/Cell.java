package ec.espe.edu.antsimulator.model;

import java.util.ArrayList;

/**
 *
 * @author Alexander Maza
 */
public class Cell {
    int col;
    int row;
    
   public void receivePheromone(PheromoneDrop pheromoneDrop) {
       
       System.out.println("The cell is receiving a pheromone drop");
       
   }
   public ArrayList<Ant> getAnts() {
       
       return new ArrayList<Ant>();
   }

    public Cell(int col, int row) {
        this.col = col;
        this.row = row;
    }
   
   
}
