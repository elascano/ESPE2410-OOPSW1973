

package ec.edu.espe.compositeexample.controller;

import ec.edu.espe.compositeexample.model.Employee;
import ec.edu.espe.compositeexample.model.Supervisor;
import ec.edu.espe.compositeexample.view.EmployeeView;

/**
 *
 * @author Alexander Ullco
 */
public class EmployeeController {
    private EmployeeView view;
    private Employee employee;

    public EmployeeController(Employee employee, EmployeeView view) {
        this.employee = employee;
        this.view = view;
    }

    public void showEmployee() {
        view.displayEmployeeInfo(employee);
    }

    public void addSubordinate(Supervisor supervisor, Employee subordinate) {
        supervisor.add(subordinate);
    }
}

