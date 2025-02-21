package ec.edu.espe.abstractfactoryexample.model;

/**
 *
 * @author Mateo Topon
 */
public class WinFactory extends GUIFactory {
    public Button createButton() {
        return new WinButton();
    }

    public Menu createMenu() {
        return new WinMenu();
    }
}
