package ec.edu.espe.zooapp.model;

/**
 *
 * @author Andrés Espinosa
 */
public class Food {
    private int id;
    private float amount;
    private String type;

    @Override
    public String toString() {
        return "Food{" + "id=" + id + ", amount=" + amount + ", type=" + type + '}';
    }

    public Food(int id, float amount, String type) {
        this.id = id;
        this.amount = amount;
        this.type = type;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the amount
     */
    public float getAmount() {
        return amount;
    }

    /**
     * @param amount the amount to set
     */
    public void setAmount(float amount) {
        this.amount = amount;
    }

    /**
     * @return the type
     */
    public String getType() {
        return type;
    }

    /**
     * @param type the type to set
     */
    public void setType(String type) {
        this.type = type;
    }
    
    
}
