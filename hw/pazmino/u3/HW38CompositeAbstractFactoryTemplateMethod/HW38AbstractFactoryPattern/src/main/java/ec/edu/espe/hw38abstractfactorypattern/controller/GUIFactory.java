package ec.edu.espe.hw38abstractfactorypattern.controller;

import ec.edu.espe.hw38abstractfactorypattern.controller.WinFactory;
import ec.edu.espe.hw38abstractfactorypattern.controller.LinuxFactory;
import ec.edu.espe.hw38abstractfactorypattern.model.Button;
import ec.edu.espe.hw38abstractfactorypattern.model.Menu;

/**
 *
 * @author Brandon Pazmino
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
