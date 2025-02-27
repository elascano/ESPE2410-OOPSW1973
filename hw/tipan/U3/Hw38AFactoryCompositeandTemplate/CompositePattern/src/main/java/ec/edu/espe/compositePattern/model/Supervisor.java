/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.compositePattern.model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Lisbeth Tipan
 */
public class Supervisor extends BaseEmployee {

protected List<Employee> directReports = new ArrayList<>();

    public Supervisor(String name, String title) {
        super(name, title);
    }

    public void add(Employee e) {
        directReports.add(e);
    }

    public void remove(Employee e) {
        directReports.remove(e);
    }

    @Override
    public void stateName(StringBuilder sb) {
        super.stateName(sb);
        for (Employee e : directReports) {
            e.stateName(sb);
        }
    }
}