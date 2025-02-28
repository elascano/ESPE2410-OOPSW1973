/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.abstractfactory.view;

import ec.edu.espe.abstractfactory.model.Button;
import ec.edu.espe.abstractfactory.model.GUIFactory;
import ec.edu.espe.abstractfactory.model.Menu;

/**
 *
 * @author USUARIO
 */
public class ClientApp {
     public static void main(String[] args) {
        GUIFactory aFactory = GUIFactory.getFactory();
        Button aButton = aFactory.createButton();
        Menu aMenu = aFactory.createMenu();
        
        aButton.caption = "Play";
        aButton.paint();
        aMenu.caption ="MainMenu";
        aMenu.paint();
    }
}
