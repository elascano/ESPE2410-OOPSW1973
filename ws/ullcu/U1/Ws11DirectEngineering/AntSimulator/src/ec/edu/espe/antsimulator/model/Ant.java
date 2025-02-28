package ec.edu.espe.antsimulator.model;

/**
 *
 * @author Lisbeth Tipan
 */
public class Ant {
    Cell cell;
    int weight;

    public Ant(Cell cell, int weight) {
        this.cell = cell;
        this.weight = weight;
    }
    
    
    
    public void carry(Food food){
        System.out.println(" ant is carring -->" + food);
        
    }
}
