package ec.edu.espe.hw38compositepattern.model;

import ec.edu.espe.hw38compositepattern.controller.Supervisor;

/**
 *
 * @author Brandon Pazmino
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
