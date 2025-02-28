
package ec.edu.espe.composite.controller;

import java.util.ArrayList;

/**
 *
 * @author Marlon Pasquel
 */
public abstract class Employee {
    protected String name;
    protected String title;
    protected ArrayList<Employee> subordinates = new ArrayList<>();

    public void add(Employee e) {
        subordinates.add(e);
    }

    public void remove(Employee e) {
        subordinates.remove(e);
    }

    public void stateName() {
        System.out.println(title + ": " + name);
        for (Employee e : subordinates) {
            e.stateName();
        }
    }
}

 