
package ec.edu.espe.dollobject.model;

import java.io.Serializable;
/**
 *
 * @author Matias Rojas
 */





public class Doll implements Serializable {
    private static final long serialVersionUID = 1L; 

    private String name;
    private String color;
    private int id;
    private double height;
    private double price;

   
    public Doll(String name, String color, int id, double height, double price) {
        this.name = name;
        this.color = color;
        this.id = id;
        this.height = height;
        this.price = price;
    }

    
    @Override
    public String toString() {
        return "Doll [ID: " + id +
               ", Name: " + name +
               ", Color: " + color +
               ", Height: " + height + " cm" +
               ", Price: $" + price + "]";
    }
}
