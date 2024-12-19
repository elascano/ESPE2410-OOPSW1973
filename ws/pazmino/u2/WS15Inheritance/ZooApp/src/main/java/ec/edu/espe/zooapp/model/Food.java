package ec.edu.espe.zooapp.model;

/**
 *
 * @author Brandon Pazmino
 */
public class Food {
    int id;
    float amount;
    String type;

    public Food(int id, float amount, String type) {
        this.id = id;
        this.amount = amount;
        this.type = type;
    }

    @Override
    public String toString() {
        return "Food{" + "id=" + id + ", amount=" + amount + ", type=" + type + '}';
    }
    
    

}
