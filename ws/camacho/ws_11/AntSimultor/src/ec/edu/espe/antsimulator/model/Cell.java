package ec.edu.espe.antsimulator.model;

import java.util.ArrayList;

/**
 *
 * @author LABS-DCCO
 */
public class Cell {
    int col;
    int row;
    
    public void receivePheromone(PheromoneDrop pheromoneDrop){
        System.out.println("The cell receive pheromone");
    }
    
    public ArrayList<Ant> getAnts(){
        return new ArrayList<Ant>();
    }
    
    public Cell(int col, int row) {
        this.col = col;
        this.row = row;
    }
}