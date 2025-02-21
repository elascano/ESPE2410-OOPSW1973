
package ec.edu.espe.compositeexample.view;

import ec.edu.espe.compositeexample.controller.EmployeeController;
import ec.edu.espe.compositeexample.model.Clerk;
import ec.edu.espe.compositeexample.model.Manager;
import ec.edu.espe.compositeexample.model.President;
import ec.edu.espe.compositeexample.model.Teller;

/**
 *
 * @author Alexander Ullco
 */
public class Setup {

public static void main(String[] args) {
    
        EmployeeView view = new EmployeeView();

        President president = President.getPresident("Pete");
        Manager manager = new Manager("Able");
        Clerk clerk1 = new Clerk("Cal");
        Clerk clerk2 = new Clerk("Bob");
        Teller teller1 = new Teller("Lony");
        Teller teller2 = new Teller("Juani");

        EmployeeController controller = new EmployeeController(president, view);
        controller.addSubordinate(president, manager);
        controller.addSubordinate(manager, clerk1);
        controller.addSubordinate(manager, clerk2);
        controller.addSubordinate(manager, teller1);
        controller.addSubordinate(manager, teller2);
        controller.showEmployee();
    }
}
