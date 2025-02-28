package ec.edu.espe.galaxy.model;

import java.io.Serializable;

/**
 *
 * @author Alan Arias
 */
public class Galaxy implements Serializable{
    private static final long serialVersionUID = 1L;
    private int id;
    private String name;
    private String type;
    private long numberOfStars;

    public Galaxy(int id, String name, String type, long numberOfStars) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.numberOfStars = numberOfStars;
    }

    @Override
    public String toString() {
        return "Galaxy{" + "id=" + getId() + 
                ", name=" + getName() + 
                ", type=" + getType() + 
                ", numberOfStars=" + getNumberOfStars() + '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public long getNumberOfStars() {
        return numberOfStars;
    }

    public void setNumberOfStars(long numberOfStars) {
        this.numberOfStars = numberOfStars;
    }
    
}
