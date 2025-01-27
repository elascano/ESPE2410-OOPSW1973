

package ec.edu.espe.mavenproject1;

/**
 *
 * @author Benjamin Robalino <jabasteam>
 */
public class Rectangle extends Shape implements Resizable {

    private double width;
    private double height;

    public Rectangle(String color, double width, double height) {
        super(color);
        if (width <= 0 || height <= 0) {
            throw new IllegalArgumentException("Dimensions must be positive");
        }
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    @Override
    public double area() {
        return width * height;
    }

    @Override
    public double perimeter() {
        return 2 * (width + height);
    }

    @Override
    public String describe() {
        return String.format("A %s rectangle with width %.2f and height %.2f",
                color, width, height);
    }

    @Override
    public void resize(double factor) {
        if (factor <= 0) {
            throw new IllegalArgumentException("Resize factor must be positive");
        }
        this.width *= factor;
        this.height *= factor;
    }
}
