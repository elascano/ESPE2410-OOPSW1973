/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.abstractFactory.model;

import javax.swing.JButton;

/**
 *
 * @author Lisbeth Tipan
 */
public abstract class Button {
    public String caption;
    public abstract JButton getButton();
    public abstract void paint();
}
