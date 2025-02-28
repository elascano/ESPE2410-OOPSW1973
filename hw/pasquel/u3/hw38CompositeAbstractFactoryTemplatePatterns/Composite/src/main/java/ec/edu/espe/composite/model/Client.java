
package ec.edu.espe.composite.model;

import ec.edu.espe.composite.controller.Employee;

/**
 *
 * @author Marlon Pasquel
 */
public class Client {
 public static Employee employee;
    
    public static void doClientTasks(){
       if (employee != null) {
            employee.stateName();
        }
    }
}
