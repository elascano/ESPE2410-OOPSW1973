package ec.edu.espe.abstractFactory.model;
import ec.edu.espe.abstractFactory.model.Button;
import ec.edu.espe.abstractFactory.model.Menu;
/**
 *
 * @author Camila Bohorquez
 */
public class WinFactory extends GUIFactory {
    public Button createButton(String caption) {
        return new WinButton(caption);  
    }

    public Menu createMenu(String caption) {
        return new WinMenu(caption);  
    }

}