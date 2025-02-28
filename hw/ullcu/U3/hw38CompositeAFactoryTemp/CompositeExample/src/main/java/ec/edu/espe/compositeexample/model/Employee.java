package ec.edu.espe.compositeexample.model;

/**
 *
 * @author Alexander Ullco
 */
public abstract class Employee {
    protected String title = "Not assigned yet";
    protected String name = "Not assigned yet";

    public void stateName() {
        System.out.println(title + " " + name);
    }
}