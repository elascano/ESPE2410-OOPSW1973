/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.compositeexample.model;

/**
 *
 * @author USUARIO
 */
public abstract class Employee {
    String name ="not assigned yet";
    String title = "not assigned yet";
    
    public void stateName(){
        System.out.println(title+" "+name);
    }
}
