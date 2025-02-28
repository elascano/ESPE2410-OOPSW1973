
package ec.edu.espe.compositeapp.model;

/**
 *
 * @author Dennis Paucar
 */
abstract public class Employee {
    String name = "not assigned yet";
    String title = "not assigned yet";

    public void stateName() {
        System.out.println(title + " " + name);
    }
}
