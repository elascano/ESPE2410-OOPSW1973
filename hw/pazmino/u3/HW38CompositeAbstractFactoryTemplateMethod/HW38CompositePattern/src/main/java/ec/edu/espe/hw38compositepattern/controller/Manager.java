package ec.edu.espe.hw38compositepattern.controller;

/**
 *
 * @author Brandon Pazmino
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
