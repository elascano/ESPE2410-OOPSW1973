
package ec.edu.espe.abstractfactoryexample.model;

/**
 *
 * @author Esteban Quiroga 
 */
public class WinFactory extends GUIFactory{

    @Override
    public Button createButton() {
        return(new WinButton());
    }

    @Override
    public Menu createMenu() {
        return(new WinMenu());
    }
    
}
