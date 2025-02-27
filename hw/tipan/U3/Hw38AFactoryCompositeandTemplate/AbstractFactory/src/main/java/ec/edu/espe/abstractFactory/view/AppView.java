/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.abstractFactory.view;

import ec.edu.espe.abstractFactory.controller.AppController;
import ec.edu.espe.abstractFactory.model.Button;
import ec.edu.espe.abstractFactory.model.Menu;
import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JPanel;

/**
 *
 * @author Lisbeth Tipan
 */
public class AppView {
    private AppController controller;
    private JFrame frame;
    private JPanel panel;
    private JMenuBar menuBar;

    public AppView(AppController controller) {
        this.controller = controller;
    }

    public void show() {
        
        frame = new JFrame("Abstract Factory GUI");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);

        
        panel = new JPanel();
        frame.add(panel);

      
        menuBar = new JMenuBar();
        frame.setJMenuBar(menuBar);

        
        controller.setButtonCaption("Play");
        controller.setMenuCaption("Main Menu");
        controller.renderUI(panel, menuBar);

       
        frame.setVisible(true);
    }
}