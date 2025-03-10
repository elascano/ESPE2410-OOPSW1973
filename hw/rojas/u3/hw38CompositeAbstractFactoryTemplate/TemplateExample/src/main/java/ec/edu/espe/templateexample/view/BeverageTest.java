/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.templateexample.view;

import ec.edu.espe.templateexample.model.Coffe;
import ec.edu.espe.templateexample.model.Tea;

/**
 *
 * @author Matias Rojas
 */
public class BeverageTest {
     public static void main(String[] args) {
        Tea tea = new Tea();
        Coffe coffe = new Coffe();
        
        System.out.println("\n Making tea..");
        tea.prepareRecipe();
        
        System.out.println("\n Making coffe..");
        coffe.prepareRecipe();
    }
}
