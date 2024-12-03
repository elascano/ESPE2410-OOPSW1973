package ec.edu.espe.antsimulator.model;

/**
 *
 * @author Brandon Pazmino <www.espe.edu.ec>
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
