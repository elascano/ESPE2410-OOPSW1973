package ec.edu.espe.antsimulator.model;

import java.util.ArrayList;


/**
 *
 * @author Andres Sandoval
 */
public class Cell {
    int col;
    int row;

    public Cell(int col, int row) {
        this.col = col;
        this.row = row;
    }
    
    public void receivePheromone(PheromoneDrop pheromoneDrop){
        System.out.println(" The cell is receiving a pheromone drop...");
    }
    
    public ArrayList<Ant> getAnts(){
        
        return new ArrayList<Ant>();
    }
}
