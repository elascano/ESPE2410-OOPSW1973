package ec.edu.espe.hw38compositepattern.model;

import ec.edu.espe.hw38compositepattern.controller.Employee;

/**
 *
 * @author Brandon Pazmino
 */
public class Teller extends Employee {

    public Teller(String aName) {
        this();
        name = aName;
    }

    public void stateName() {
        super.stateName();
    }

    public Teller() {
        title = "Teller";
    }

}
