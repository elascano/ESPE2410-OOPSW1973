package ec.edu.espe.standapp.model;

import java.io.Serializable;

/**
 *
 * @author Dennis Paucar
 */
public class Stand implements Serializable {
    private static final long serialVersionUID = 1L;

    private int id;
    private String color;
    private String material;
    private String type;


    public Stand(int id, String color, String material, String type) {
        this.id = id;
        this.color = color;
        this.material = material;
        this.type = type;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

 
    @Override
    public String toString() {
        return "Stand [ID=" + id + ", Color=" + color + ", Material=" + material + ", Type=" + type + "]";
    }
}
