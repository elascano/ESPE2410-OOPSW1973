package ec.edu.espe.employees.controller;

import ec.edu.espe.employees.model.Employee;
import ec.edu.espe.employees.utils.EmployeeDAO;
import ec.edu.espe.employees.view.EmployeeView;

public class EmployeeController {
    private EmployeeDAO employeeDAO;
    private EmployeeView employeeView;

    public EmployeeController(EmployeeDAO employeeDAO, EmployeeView employeeView) {
        this.employeeDAO = employeeDAO;
        this.employeeView = employeeView;
    }

    public void saveEmployee() {
        String name = employeeView.getEmployeeName();
        String email = employeeView.getEmployeeEmail();
        double salary = employeeView.getEmployeeSalary();

        Employee employee = new Employee(name, email, salary);
        employeeDAO.save(employee);

        System.out.println("Employee saved to MongoDB");
    }
}
