

package ec.edu.espe.mavenproject1;

/**
 *
 * @author Benjamin Robalino <jabasteam>
 */
public class Circle extends Shape implements Resizable {

    private double radius;

    public Circle(String color, double radius) {
        super(color);
        if (radius <= 0) {
            throw new IllegalArgumentException("Radius must be positive");
        }
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }

    @Override
    public double perimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public String describe() {
        return String.format("A %s circle with radius %.2f", color, radius);
    }

    @Override
    public void resize(double factor) {
        if (factor <= 0) {
            throw new IllegalArgumentException("Resize factor must be positive");
        }
        this.radius *= factor;
    }
}
