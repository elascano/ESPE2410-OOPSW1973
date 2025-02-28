package ec.edu.espe.compositePattern.controller;
import ec.edu.espe.compositePattern.model.Employee;
import ec.edu.espe.compositePattern.view.EmployeeView;

/**
 *
 * @author Camila Bohorquez
 */
public class EmployeeController {
     private Employee model;
    private EmployeeView view;

    public EmployeeController(Employee model, EmployeeView view) {
        this.model = model;
        this.view = view;
    }

    public void updateView() {
        view.printEmployeeDetails(model);
    }
}

