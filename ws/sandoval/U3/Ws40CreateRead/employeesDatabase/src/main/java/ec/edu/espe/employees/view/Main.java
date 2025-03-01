package ec.edu.espe.employees.view;

import ec.edu.espe.employees.controller.EmployeeController;
import ec.edu.espe.employees.utils.*;
import ec.edu.espe.employees.view.EmployeeView;

/**
 *
 * @author Andres Sandoval
 */


public class Main {
    public static void main(String[] args) {
        EmployeeDAO employeeDAO = new EmployeeDAO();
        EmployeeView employeeView = new EmployeeView();
        EmployeeController employeeController = new EmployeeController(employeeDAO, employeeView);

        employeeController.saveEmployee();
        MongoDBConnection.close();
    }
}

