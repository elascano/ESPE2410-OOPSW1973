

package ec.edu.espe.abstractfactoryexample.model;

/**
 *
 * @author Alexander Ullco
 */
public class WinFactory extends GUIFactory {
    public Button createButton() {
        return new WinButton();
    }

    public Menu createMenu() {
        return new WinMenu();
    }
}
