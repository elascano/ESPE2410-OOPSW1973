
package ec.edu.espe.zooapp.model;

/**
 *
 * @author marlo
 */
public class Food {
    private int id;
    private float amoutn;
    private String type;

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
     * @return the amoutn
     */
    public float getAmoutn() {
        return amoutn;
    }

    /**
     * @param amoutn the amoutn to set
     */
    public void setAmoutn(float amoutn) {
        this.amoutn = amoutn;
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

    public Food(int id, float amoutn, String type) {
        this.id = id;
        this.amoutn = amoutn;
        this.type = type;
    }

    @Override
    public String toString() {
        return "Food{" + "id=" + id + ", amoutn=" + amoutn + ", type=" + type + '}';
    }
    
}
