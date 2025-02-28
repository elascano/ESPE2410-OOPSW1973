
package ec.edu.espe.composite.model;

import ec.edu.espe.composite.controller.Employee;

/**
 *
 * @author Marlon Pasquel
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
