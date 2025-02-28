/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.compositePattern.model;

/**
 *
 * @author Lisbeth Tipan
 */
public abstract class BaseEmployee implements Employee {   
protected String name;
    protected String title;

    public BaseEmployee(String name, String title) {
        this.name = name;
        this.title = title;
    }

   public void stateName(StringBuilder sb) {
        sb.append(title).append(" ").append(name).append("\n");
    }
}
