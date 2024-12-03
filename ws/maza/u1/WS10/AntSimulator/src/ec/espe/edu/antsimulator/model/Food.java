package ec.espe.edu.antsimulator.model;

/**
 *
 * @author Alexander Maza
 */
public class Food {
    int amount;

    @Override
    public String toString() {
        return "Food{" + "amount=" + amount + '}';
    }

    public Food(int amount) {
        this.amount = amount;
    }
    
    
}
