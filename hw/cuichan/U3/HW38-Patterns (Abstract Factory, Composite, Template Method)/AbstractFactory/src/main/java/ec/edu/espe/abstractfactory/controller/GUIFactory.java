package ec.edu.espe.abstractfactory.controller;

import ec.edu.espe.abstractfactory.model.Button;
import ec.edu.espe.abstractfactory.model.LinuxFactory;
import ec.edu.espe.abstractfactory.model.Menu;
import ec.edu.espe.abstractfactory.model.WinFactory;

/**
 *
 * @author David Cuichan
 */
public abstract class GUIFactory {
    public static GUIFactory getFactory() {
            String os = System.getProperty("os.name").toLowerCase();
            if (os.contains("win")) {
                return new WinFactory();
                
            } else {
                return new LinuxFactory();
            }
        }

        public abstract Button createButton();
        public abstract Menu createMenu();
}
