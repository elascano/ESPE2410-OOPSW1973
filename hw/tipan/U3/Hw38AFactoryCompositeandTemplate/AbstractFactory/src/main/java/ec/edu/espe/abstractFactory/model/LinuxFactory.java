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
public  class LinuxFactory extends GUIFactory {

    public Button createButton(String caption) {
        return new LinuxButton(caption);  // Crear un botón de Linux
    }

    public Menu createMenu(String caption) {
        return new LinuxMenu(caption);  // Crear un menú de Linux
    }


}
