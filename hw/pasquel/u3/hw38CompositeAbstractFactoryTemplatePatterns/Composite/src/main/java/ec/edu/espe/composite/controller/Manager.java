
package ec.edu.espe.composite.controller;

/**
 *
 * @author Marlon Pasquel
 */
public class Manager extends Supervisor {

    public Manager(String aName) {
        this();
        name = aName;

    }

    public Manager() {
        super();
        title = "Manager";
    }

    public void stateName() {

        super.stateName();
    }

}
