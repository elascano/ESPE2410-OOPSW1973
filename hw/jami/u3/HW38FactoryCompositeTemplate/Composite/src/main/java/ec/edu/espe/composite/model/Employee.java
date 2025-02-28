package ec.edu.espe.composite.model;

/**
 *
 * @author Klever Jami
 */
public abstract class Employee {

    protected String title = "Not assigned yet";
    protected String name = "Not assigned yet";

    public void stateName() {
        System.out.println(title + " " + name);
    }
}
