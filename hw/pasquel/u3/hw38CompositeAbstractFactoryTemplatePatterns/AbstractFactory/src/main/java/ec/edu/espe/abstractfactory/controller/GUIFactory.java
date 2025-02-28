
package ec.edu.espe.abstractfactory.controller;

import ec.edu.espe.abstractfactory.model.Button;
import ec.edu.espe.abstractfactory.model.Menu;

/**
 *
 * @author Marlon Pasquel
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
