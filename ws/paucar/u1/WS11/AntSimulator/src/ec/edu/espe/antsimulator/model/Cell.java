package ec.edu.espe.antsimulator.model;

import java.util.ArrayList;

/**
 *
 * @author Marlon Pasquel
 */
public class Cell {
    int col;
    int row;
    
    public void recivePheromone(PheromoneDrop pheromonedrop){
        System.out.println(" the cell is reciving a pheromone drop");
    }
    
    public ArrayList<Ant> getAnts(){
        
        return new ArrayList<Ant>();
    }

    public Cell(int col, int row) {
        this.col = col;
        this.row = row;
    }
    
}
