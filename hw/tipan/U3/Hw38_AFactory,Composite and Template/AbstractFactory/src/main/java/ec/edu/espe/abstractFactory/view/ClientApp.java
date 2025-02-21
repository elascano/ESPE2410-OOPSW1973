/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.abstractFactory.view;

import ec.edu.espe.abstractFactory.controller.AppController;
import ec.edu.espe.abstractFactory.model.GUIFactory;
import ec.edu.espe.abstractFactory.model.WinFactory;
import java.awt.Button;

/**
 *
 * @author Lisbeth Tipan
 */
public class ClientApp {
      public static void main(String[] args) {
        AppController controller = new AppController();
        AppView view = new AppView(controller);
        view.show();
    }
}
    
