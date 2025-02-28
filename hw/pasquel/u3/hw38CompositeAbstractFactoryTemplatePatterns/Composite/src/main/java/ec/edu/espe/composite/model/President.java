
package ec.edu.espe.composite.model;

import ec.edu.espe.composite.controller.Supervisor;

/**
 *
 * @author Marlon Pasquel
 */
public class President extends Supervisor {

    private static President president = new President();

    private President(String aName) {
        this();
        name = aName;

    }

    private President() {
        super();
        title = "President";

    }

    public void stateName() {
        super.stateName();
    }

    public static President getPresident(String aName) {
        president.name = aName;
        return President.president;

    }

}