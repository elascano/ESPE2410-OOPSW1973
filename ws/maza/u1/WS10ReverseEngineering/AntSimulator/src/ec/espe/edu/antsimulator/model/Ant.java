package ec.espe.edu.antsimulator.model;

/**
 *
 * @author Alexander Maza
 */
public class Ant {
    Cell cell;
    int weigth;

    public Ant(Cell cell, int weigth) {
        this.cell = cell;
        this.weigth = weigth;
    }
    
    
    
    public void carry(Food food) {
      
    System.out.println("ant is carring ---> " + food );
         
    }
}
