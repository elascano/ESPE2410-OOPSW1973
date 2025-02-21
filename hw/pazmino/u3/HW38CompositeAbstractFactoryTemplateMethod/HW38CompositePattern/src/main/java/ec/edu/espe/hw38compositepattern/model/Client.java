package ec.edu.espe.hw38compositepattern.model;

import ec.edu.espe.hw38compositepattern.controller.Employee;

/**
 *
 * @author Brandon Pazmino
 */
public class Client {
    public static Employee employee;
    
    public static void doClientTasks(){
       if (employee != null) {
            employee.stateName();
        }
    }
    
}
