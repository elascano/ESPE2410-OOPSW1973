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
public class WinButton extends Button {

  public WinButton(String caption) {
        this.caption = caption;
    }

    @Override
    public JButton getButton() {
        return new JButton(caption);  
    }

    @Override
    public void paint() {
        System.out.println("I'm a WinButton: " + caption);
    }
}
