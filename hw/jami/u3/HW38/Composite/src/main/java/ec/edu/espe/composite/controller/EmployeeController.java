package ec.edu.espe.composite.controller;

import ec.edu.espe.composite.model.Employee;
import ec.edu.espe.composite.model.Supervisor;
import ec.edu.espe.composite.view.EmployeeView;

/**
 *
 * @author Klever Jami
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
