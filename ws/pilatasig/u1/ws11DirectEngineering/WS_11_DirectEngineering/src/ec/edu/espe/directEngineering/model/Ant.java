
package ec.edu.espe.directEngineering.model;

/**
 *
 * @author LABS-DCCO
 */
public class Ant {
    Cell cell;
    int weight;
    
    public void carring(Food food){
        System.out.println("Ant is carring food --> " + food);
    }

    public Ant(Cell cell, int weight) {
        this.cell = cell;
        this.weight = weight;
    }
    
}
