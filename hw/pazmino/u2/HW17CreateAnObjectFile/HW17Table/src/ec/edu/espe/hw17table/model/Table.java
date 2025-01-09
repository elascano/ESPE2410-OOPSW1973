package ec.edu.espe.hw17table.model;

import java.io.Serializable;
        

/**
 *
 * @author Brandon Pazmino
 */
public class Table implements Serializable{
    public static final long serialVersionUID = 1L;
    
    private String material;
    private int quantityTableLegs;
    private float height;
    private String color;

    public Table(String material, int quantityTableLegs, float height, String color) {
        this.material = material;
        this.quantityTableLegs = quantityTableLegs;
        this.height = height;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Table{" + "material=" + material + 
                ",\n quantityTableLegs=" + quantityTableLegs + 
                ",\n height=" + height +
                ",\n color=" + color + "\n" +'}';
    }
    
    
     
}
