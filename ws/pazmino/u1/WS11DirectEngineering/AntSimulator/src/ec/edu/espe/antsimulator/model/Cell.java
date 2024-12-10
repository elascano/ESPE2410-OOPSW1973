package ec.edu.espe.antsimulator.model;

import java.util.ArrayList;

/**
 *
 * @author Brandon Pazmino <www.espe.edu.ec>
 */
public class Cell {
    int col;
    int row;
    
    
    public void receivePheromone(PheromoneDrop pheromoneDrop){
        System.out.println("The cell is receiving a pheromomne Drop");
    }
    public ArrayList<Ant> getAsnt(){
        return new ArrayList<Ant>();
    }

    public Cell(int col, int row) {
        this.col = col;
        this.row = row;
    }
    
    
}
