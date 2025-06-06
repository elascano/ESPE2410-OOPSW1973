package ec.edu.espe.abstractfactory.model;

/**
 *
 * @author Klever Jami
 */
public class WinFactory extends GUIFactory {

    public Button createButton() {
        return new WinButton();
    }

    public Menu createMenu() {
        return new WinMenu();
    }
}
