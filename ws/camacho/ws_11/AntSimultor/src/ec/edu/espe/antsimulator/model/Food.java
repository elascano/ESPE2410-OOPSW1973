package ec.edu.espe.antsimulator.model;

/**
 *
 * @author LABS-DCCO
 */
public class Food {
    int aoumnt;

    @Override
    public String toString() {
        return "Food{" + "aoumnt=" + aoumnt + '}';
    }

    public Food(int aoumnt) {
        this.aoumnt = aoumnt;
    }
    
    
}
