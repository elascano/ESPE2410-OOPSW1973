package ec.edu.espe.antsimulator.model;

import java.util.ArrayList;

/**
 *
 * @author Lucas Gongora
 */
public class Cell {
    int col;
    int row;

    public Cell(int col, int row) {
        this.col = col;
        this.row = row;
    }
    
    
    public void recievePheromone(PheromoneDrop pheromoneDrop){
        System.out.println("the cell is receiving a pheromone drop");
    }
    
    public ArrayList<Ant> getAnts(){
        return new ArrayList<Ant>();
    }
}
