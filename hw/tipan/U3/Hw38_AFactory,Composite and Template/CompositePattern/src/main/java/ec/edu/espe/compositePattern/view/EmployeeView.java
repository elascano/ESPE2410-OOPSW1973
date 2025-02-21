/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.compositePattern.view;

import ec.edu.espe.compositePattern.model.Employee;
import javax.swing.JOptionPane;

/**
 *
 * @author Lisbeth Tipan
 */
public class EmployeeView {
public void printEmployeeDetails(Employee employee) {
        StringBuilder sb = new StringBuilder();
        employee.stateName(sb);
        JOptionPane.showMessageDialog(null, sb.toString(), "Organization", JOptionPane.INFORMATION_MESSAGE);
    }
}