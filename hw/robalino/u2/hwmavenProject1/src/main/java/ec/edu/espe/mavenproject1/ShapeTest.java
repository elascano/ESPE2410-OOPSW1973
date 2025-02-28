

package ec.edu.espe.mavenproject1;

/**
 *
 * @author Benjamin Robalino <jabasteam>
 */
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.*;

public class ShapeTest {

    private Circle circle;
    private Rectangle rectangle;

    @BeforeEach
    void setUp() {
        circle = new Circle("red", 5.0);
        rectangle = new Rectangle("blue", 4.0, 6.0);
    }

    @Test
    @DisplayName("Test Circle Area Calculation")
    void testCircleArea() {
        double expectedArea = Math.PI * 25.0;
        assertEquals(expectedArea, circle.area(), 0.001,
                "Circle area calculation should match expected value");
    }

    @Test
    @DisplayName("Test Circle Perimeter Calculation")
    void testCirclePerimeter() {
        double expectedPerimeter = 2 * Math.PI * 5.0;
        assertEquals(expectedPerimeter, circle.perimeter(), 0.001,
                "Circle perimeter calculation should match expected value");
    }

    @Test
    @DisplayName("Test Circle Resize Operation")
    void testCircleResize() {
        circle.resize(2.0);
        assertEquals(10.0, circle.getRadius(), 0.001,
                "Circle radius should double after resize with factor 2.0");
    }

    @Test
    @DisplayName("Test Rectangle Area Calculation")
    void testRectangleArea() {
        assertEquals(24.0, rectangle.area(), 0.001,
                "Rectangle area should be width * height");
    }

    @Test
    @DisplayName("Test Rectangle Perimeter Calculation")
    void testRectanglePerimeter() {
        assertEquals(20.0, rectangle.perimeter(), 0.001,
                "Rectangle perimeter should be 2 * (width + height)");
    }

    @Test
    @DisplayName("Test Rectangle Resize Operation")
    void testRectangleResize() {
        rectangle.resize(0.5);
        assertEquals(2.0, rectangle.getWidth(), 0.001,
                "Rectangle width should be halved after resize with factor 0.5");
        assertEquals(3.0, rectangle.getHeight(), 0.001,
                "Rectangle height should be halved after resize with factor 0.5");
    }

    @Test
    @DisplayName("Test Invalid Circle Creation")
    void testInvalidCircleRadius() {
        Exception exception = assertThrows(IllegalArgumentException.class,
                () -> new Circle("red", -1.0),
                "Creating circle with negative radius should throw IllegalArgumentException");
        assertTrue(exception.getMessage().contains("must be positive"));
    }

    @Test
    @DisplayName("Test Invalid Rectangle Creation")
    void testInvalidRectangleDimensions() {
        Exception exception = assertThrows(IllegalArgumentException.class,
                () -> new Rectangle("blue", -2.0, 5.0),
                "Creating rectangle with negative width should throw IllegalArgumentException");
        assertTrue(exception.getMessage().contains("must be positive"));
    }

    @Test
    @DisplayName("Test Invalid Resize Operation")
    void testInvalidResizeFactor() {
        Exception exception = assertThrows(IllegalArgumentException.class,
                () -> circle.resize(-2.0),
                "Resizing with negative factor should throw IllegalArgumentException");
        assertTrue(exception.getMessage().contains("must be positive"));
    }

    @Test
    @DisplayName("Test Shape Descriptions")
    void testShapeDescription() {
        assertEquals("A red circle with radius 5.00", circle.describe(),
                "Circle description should match expected format");
        assertEquals("A blue rectangle with width 4.00 and height 6.00",
                rectangle.describe(), "Rectangle description should match expected format");
    }
}
