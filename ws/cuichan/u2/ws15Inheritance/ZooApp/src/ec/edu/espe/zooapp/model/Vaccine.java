package ec.edu.espe.zooapp.model;

/**
 *
 * @author David Cuichan
 */
public class Vaccine {
    private int id;
    private String despcription;

    public Vaccine(int id, String despcription) {
        this.id = id;
        this.despcription = despcription;
    }

    @Override
    public String toString() {
        return "Vaccine{" + "id=" + id + ", despcription=" + despcription + '}';
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
     * @return the despcription
     */
    public String getDespcription() {
        return despcription;
    }

    /**
     * @param despcription the despcription to set
     */
    public void setDespcription(String despcription) {
        this.despcription = despcription;
    }
    
    
}
