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
public abstract class GUIFactory {
 public static GUIFactory getFactory() {
        int sys = readFromConfigFile("OS_TYPE");
        if (sys == 0)
            return new WinFactory();
        else
            return new LinuxFactory();
    }

    public abstract Button createButton(String caption);
    public abstract Menu createMenu(String caption);

    
    private static int readFromConfigFile(String filename) {
        String os = System.getProperty("os.name").toLowerCase();
        return os.contains("win") ? 0 : 1;  // 0 para Windows, 1 para Linux
    }
}

