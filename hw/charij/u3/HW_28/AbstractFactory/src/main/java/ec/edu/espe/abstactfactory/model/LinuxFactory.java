package ec.edu.espe.hw25_abstactfactory.model;

/**
 *
 * @author Sebastian Charij
 */
public class LinuxFactory extends GUIFactory {

    public Button createButton() {
        return new LinuxButton();
    }

    public Menu createMenu() {
        return new LinuxMenu();
    }
}
