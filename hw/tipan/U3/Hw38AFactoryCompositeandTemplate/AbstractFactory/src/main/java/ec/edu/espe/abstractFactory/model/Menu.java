/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.abstractFactory.model;

import javax.swing.JMenu;

/**
 *
 * @author Lisbeth Tipan
 */
public abstract class Menu {
    
    public String caption;
    public abstract JMenu getMenu();
    public abstract void paint();
}