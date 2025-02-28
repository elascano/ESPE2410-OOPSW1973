package ec.edu.espe.composite.model;

import java.util.Vector;

/**
 *
 * @author Klever Jami
 */
public abstract class Supervisor extends Employee {

    protected Vector<Employee> directReports = new Vector<>();

    public void stateName() {
        System.out.println(title + " " + name);
        for (Employee e : directReports) {
            e.stateName();
        }
    }

    public void add(Employee e) {
        directReports.addElement(e);
    }
}
