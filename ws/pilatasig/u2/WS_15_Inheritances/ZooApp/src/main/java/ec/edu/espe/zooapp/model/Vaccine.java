
package ec.edu.espe.zooapp.model;

/**
 *
 * @author David Pilatasig
 */
public class Vaccine {
    private int id;
    private String description;

    public Vaccine(int id, String description) {
        this.id = id;
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Vaccine{" + "id=" + id + ", description=" + description + '}';
    }
    
    
}
