/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.compositePattern.controller;

import ec.edu.espe.compositePattern.model.Employee;
import ec.edu.espe.compositePattern.view.EmployeeView;

/**
 *
 * @author Lisbeth Tipan
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

