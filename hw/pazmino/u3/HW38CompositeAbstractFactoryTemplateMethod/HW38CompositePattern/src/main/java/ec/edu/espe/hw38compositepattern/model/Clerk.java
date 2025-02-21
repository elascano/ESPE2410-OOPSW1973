package ec.edu.espe.hw38compositepattern.model;

import ec.edu.espe.hw38compositepattern.controller.Employee;

/**
 *
 * @author Brandon Pazmino
 */
public class Clerk extends Employee {

    public Clerk(String aName) {
        this();
        name = aName;
    }

    public void stateName() {
        super.stateName();
    }

    public Clerk() {
        title = "Clerk";
    }

}
