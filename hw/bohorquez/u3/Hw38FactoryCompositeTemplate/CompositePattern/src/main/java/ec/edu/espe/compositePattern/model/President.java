package ec.edu.espe.compositePattern.model;

/**
 *
 * @author Camila Bohorquez
 */
public class President extends Supervisor {
private static President instance;

    private President(String name) {
        super(name, "President");
    }

    public static President getInstance(String name) {
        if (instance == null) {
            instance = new President(name);
        } else {
            instance.name = name;
        }
        return instance;
    }
}