

package ec.edu.espe.zooapp.model;

/**
 *
 * @author Lisbeth Tipan
 */
public class Vaccine {
    private int id;
    private String description;

    public Vaccine(int id, String description) {
        this.id = id;
        this.description = description;
    }

    @Override
    public String toString() {
        return "Vaccine{" + "id=" + id + ", description=" + description + '}';
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
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }
    
}
