package ec.edu.espe.antsimulator.model;

/**
 *
 * @author Sebastian Charij
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
