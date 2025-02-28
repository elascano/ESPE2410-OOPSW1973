package ec.edu.espe.compositepattern.view;

import java.util.ArrayList;
/**
 *
 * @author Gabriel Manosalvas
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