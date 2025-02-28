/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.abstractFactory.model;
import ec.edu.espe.abstractFactory.model.Menu;
import javax.swing.JMenu;
/**
 *
 * @author Lisbeth Tipan
 */
public class LinuxMenu extends Menu {

    public LinuxMenu(String caption) {
        this.caption = caption;
    }

    @Override
    public JMenu getMenu() {
        return new JMenu(caption); 
    }

    @Override
    public void paint() {
        System.out.println("I'm a LinuxMenu: " + caption);
    }
}
