

package ec.edu.espe.compositeexample.model;

/**
 *
 * @author Mateo Topon
 */
public class President extends Supervisor {
    private static President president;

    private President(String aName) {
        name = aName;
        title = "President---> ";
    }

    public static President getPresident(String aName) {
        if (president == null) {
            president = new President(aName);
        }
        return president;
    }
}