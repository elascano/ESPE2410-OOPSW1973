package ec.edu.espe.Factory.controller;

import ec.edu.espe.Factory.controller.*;
import ec.edu.espe.Factory.model.Button;
import ec.edu.espe.Factory.model.Menu;

/**
 *
 * @author Andrés Sandoval
 */
public abstract class GUIFactory {

    public static GUIFactory getFactory() {
        int sys = OSReader.readFromConfigFile("OS_TYPE");
        if (sys == 0) {
            return (new WinFactory());
        } else {
            return (new LinuxFactory());
        }
    }

    public abstract Button createButton();

    public abstract Menu createMenu();
    

}
