
package ec.edu.espe.mavenproject1;

/**
 *
 * @author Benjamin Robalino <jabasteam>
 */
public abstract class Shape {
    protected String color;

    public Shape(String color) {
        this.color = color;
    }

    public abstract double area();
    public abstract double perimeter();
    
    public String getColor() {
        return color;
    }

    public abstract String describe();
}

