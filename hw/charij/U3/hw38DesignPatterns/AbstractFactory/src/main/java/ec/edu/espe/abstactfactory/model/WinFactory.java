package ec.edu.espe.hw25_abstactfactory.model;

/**
 * 
 * @author Sebastian Charij
 */
public class WinFactory extends GUIFactory {

    public Button createButton() {
        return new WinButton();
    }

    public Menu createMenu() {
        return new WinMenu();
    }
}
