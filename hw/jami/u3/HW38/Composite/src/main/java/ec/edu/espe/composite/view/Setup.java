package ec.edu.espe.composite.view;

import ec.edu.espe.composite.controller.EmployeeController;
import ec.edu.espe.composite.model.Clerk;
import ec.edu.espe.composite.model.Manager;
import ec.edu.espe.composite.model.President;
import ec.edu.espe.composite.model.Teller;

/**
 *
 * @author Klever Jami
 */
public class Setup {

    public static void main(String[] args) {

        EmployeeView view = new EmployeeView();

        President president = President.getPresident("David");
        Manager manager = new Manager("Matias");
        Clerk clerk1 = new Clerk("Lucy");
        Clerk clerk2 = new Clerk("Xavier");
        Teller teller1 = new Teller("Lucas");
        Teller teller2 = new Teller("Pedro");

        EmployeeController controller = new EmployeeController(president, view);
        controller.addSubordinate(president, manager);
        controller.addSubordinate(manager, clerk1);
        controller.addSubordinate(manager, clerk2);
        controller.addSubordinate(manager, teller1);
        controller.addSubordinate(manager, teller2);
        controller.showEmployee();
    }
}
