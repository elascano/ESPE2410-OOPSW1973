package ec.edu.espe.directEngineering.model;

import java.util.ArrayList;

/**
 *
 * @author LABS-DCCO
 */
public class Cell {
    int col;
    int row;
    
    public void recivePheromone(PheromoneDrop pheromoneDrop){
        System.out.println("The pheromone were dropped");
    }
    
    public ArrayList<Ant> getAnts(){
        return new ArrayList<>();
    }

    public Cell(int col, int row) {
        this.col = col;
        this.row = row;
    }
    
    
}
