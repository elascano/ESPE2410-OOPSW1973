
package ec.edu.espe.antsimulator.model;

/**
 *
 * @author Esteban Quiroga 
 */
public class Ant {
    Cell cell;
    int weight;
    
    public void carry(Food food){
        System.out.println("Ant is carring food --> "+ food);
    }

    public Ant(Cell cell, int weight) {
        this.cell = cell;
        this.weight = weight;
    }
    
    
}
