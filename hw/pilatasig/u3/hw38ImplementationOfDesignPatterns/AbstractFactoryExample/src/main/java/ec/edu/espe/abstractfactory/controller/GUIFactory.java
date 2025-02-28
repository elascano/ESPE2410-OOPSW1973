package ec.edu.espe.abstractfactory.controller;

import ec.edu.espe.abstractfactory.model.Button;
import ec.edu.espe.abstractfactory.model.Menu;
import static utils.ConfigReader.readFromConfigFile;

/**
 *
 * @author David Pilatasig
 */
public abstract class GUIFactory {
    public static GUIFactory getFactory(){
    int sys=readFromConfigFile("OS_TYPE");
    if(sys==0)
        return(new WinFactory());
    else if(sys==1)
        return (new LinuxFactory());
    else
        throw new RuntimeException("Not recognized operative system");
    }
    
    public abstract Button createButton();
    public abstract Menu createMenu();
}
