package ec.edu.espe.compositeexample.model;

/**
 *
 * @author Alan Arias
 */
public abstract class Employee {
    protected String title = "Not assigned yet";
    protected String name = "Not assigned yet";

    public void stateName() {
        System.out.println(title + " " + name);
    }
}