

package ec.edu.espe.resistor.model;

/**
 *
 * @author Lucas Gongora 
 */
public class Resistor {

    private String id;
    private String description;
    private float value;
    private float tolerance;
   

    public Resistor(String id, String description, float value, float tolerance) {
        this.id = id;
        this.description = description;
        this.value = value;
        this.tolerance = tolerance;
    }
    
    

    /**
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * @return the name
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description the name to set
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * @return the value
     */
    public float getValue() {
        return value;
    }

    /**
     * @param value the value to set
     */
    public void setValue(float value) {
        this.value = value;
    }

    /**
     * @return the tolerance
     */
    public float getTolerance() {
        return tolerance;
    }

    /**
     * @param tolerance the tolerance to set
     */
    public void setTolerance(float tolerance) {
        this.tolerance = tolerance;
    }
    
    
}
