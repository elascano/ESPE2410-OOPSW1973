    
package ec.edu.espe.antsimulator.model;

import java.util.ArrayList;

/**
 *
 * @author Esteban Quiroga 
 */
public class Cell {
    int row;
    int col;
    
    public void receivePheromone(PheromoneDrop pheromoneDrop){
        System.out.println("The cell is receiving a pheromone drop.");
    }
    
    public ArrayList<Ant> getAnts(){
        
        return new ArrayList<Ant>();
    }

    public Cell(int row, int col) {
        this.row = row;
        this.col = col;
    }
    
    
}

