
package ec.edu.espe.abstractfactoryexample.model;

import ec.edu.espe.abstractfactoryexample.utils.ConfigFileReader;

/**
 *
 * @author Esteban Quiroga 
 */
public abstract class GUIFactory {
    
    public static GUIFactory getFactory(){
        int sys = ConfigFileReader.readFromConfigFile("OS_TYPE");
        if(sys==0)
            return(new WinFactory());
        else
            return(new LinuxFactory());
    }
    
    public abstract Button createButton();
    public abstract Menu createMenu();
}
