/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.abstractFactory.model;
import ec.edu.espe.abstractFactory.model.Button;
import javax.swing.JButton;
/**
 *
 * @author Lisbeth Tipan
 */
public class LinuxButton extends Button {
 public LinuxButton(String caption) {
        this.caption = caption;
    }
    @Override
    public JButton getButton() {
    return new JButton(caption);
    }
    
     public void paint() {
        System.out.println("I'm a LinuxButton: " + caption);
    }
}