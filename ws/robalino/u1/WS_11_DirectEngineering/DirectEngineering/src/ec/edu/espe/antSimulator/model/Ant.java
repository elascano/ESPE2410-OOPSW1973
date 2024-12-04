

package ec.edu.espe.antSimulator.model;

/**
 *
 * @author LABS-DCCO
 */
public class Ant {
    Cell cell;
    int weight;
    
    public void carry(Food food){
        System.out.println("Ant is carrying food" + food);
    }

    public Ant(Cell cell, int weight) {
        this.cell = cell;
        this.weight = weight;
    }
}
