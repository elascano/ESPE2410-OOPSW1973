

package ec.edu.espe.abstractfactoryexample.model;

/**
 *
 * @author Robinson Bonilla
 */
public class WinFactory extends GUIFactory {
    public Button createButton() {
        return new WinButton();
    }

    public Menu createMenu() {
        return new WinMenu();
    }
}
