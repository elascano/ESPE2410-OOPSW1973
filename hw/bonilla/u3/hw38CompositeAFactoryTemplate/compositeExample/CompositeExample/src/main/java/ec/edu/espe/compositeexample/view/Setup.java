
package ec.edu.espe.compositeexample.view;

import ec.edu.espe.compositeexample.controller.EmployeeController;
import ec.edu.espe.compositeexample.model.Clerk;
import ec.edu.espe.compositeexample.model.Manager;
import ec.edu.espe.compositeexample.model.President;
import ec.edu.espe.compositeexample.model.Teller;

/**
 *
 * @author Robinson Bonilla
 */
public class Setup {

public static void main(String[] args) {
    
        EmployeeView view = new EmployeeView();

        President president = President.getPresident("Arnold");
        Manager manager = new Manager("Derek");
        Clerk clerk1 = new Clerk("Juana");
        Clerk clerk2 = new Clerk("Oliver");
        Teller teller1 = new Teller("Ken");
        Teller teller2 = new Teller("Mark");

        EmployeeController controller = new EmployeeController(president, view);
        controller.addSubordinate(president, manager);
        controller.addSubordinate(manager, clerk1);
        controller.addSubordinate(manager, clerk2);
        controller.addSubordinate(manager, teller1);
        controller.addSubordinate(manager, teller2);
        controller.showEmployee();
    }
}
