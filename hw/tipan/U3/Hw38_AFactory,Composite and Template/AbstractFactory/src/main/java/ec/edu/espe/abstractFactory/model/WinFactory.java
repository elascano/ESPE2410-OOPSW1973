/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.abstractFactory.model;

import ec.edu.espe.abstractFactory.model.Button;
import ec.edu.espe.abstractFactory.model.Menu;
/**
 *
 * @author Lisbeth Tipan
 */
public class WinFactory extends GUIFactory {
    public Button createButton(String caption) {
        return new WinButton(caption);  // Crear un botón de Windows
    }

    public Menu createMenu(String caption) {
        return new WinMenu(caption);  // Crear un menú de Windows
    }

}