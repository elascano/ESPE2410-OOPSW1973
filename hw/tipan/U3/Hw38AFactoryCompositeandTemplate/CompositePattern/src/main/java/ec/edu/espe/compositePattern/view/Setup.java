/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.compositePattern.view;

import ec.edu.espe.compositePattern.controller.EmployeeController;
import ec.edu.espe.compositePattern.model.Clerk;
import ec.edu.espe.compositePattern.model.Manager;
import ec.edu.espe.compositePattern.model.President;
import ec.edu.espe.compositePattern.model.Teller;

/**
 *
 * @author Lisbeth Tipan
 */
public class Setup {
public static void main(String[] args) {
       
        Teller lonny = new Teller("--> Lonny");
        Clerk cal = new Clerk("--> Cal");
        Manager able = new Manager("--> Able");
        able.add(lonny);
        able.add(cal);

        Teller juanita = new Teller("-->Juanita");
        Teller tina = new Teller("-->Tina");
        Teller thelma = new Teller("-->Thelma");
        Manager becky = new Manager("-->Becky");
        becky.add(juanita);
        becky.add(tina);
        becky.add(thelma);

        President pete = President.getInstance("-->Pete");
        pete.add(able);
        pete.add(becky);


        EmployeeView view = new EmployeeView();


        EmployeeController controller = new EmployeeController(pete, view);
        controller.updateView();
    }
}
