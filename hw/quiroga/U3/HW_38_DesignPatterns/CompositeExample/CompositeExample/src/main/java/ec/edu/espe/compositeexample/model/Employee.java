
package ec.edu.espe.compositeexample.model;

/**
 *
 * @author Esteban Quiroga 
 */
public abstract class Employee {
    String name ="not assigned yet";
    String title = "not assigned yet";
    
    public void stateName(){
        System.out.println(title+" "+name);
    }
}
