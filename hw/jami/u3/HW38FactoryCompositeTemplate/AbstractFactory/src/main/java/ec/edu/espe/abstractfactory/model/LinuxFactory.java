package ec.edu.espe.abstractfactory.model;

/**
 *
 * @author Klever Jami
 */
public class LinuxFactory extends GUIFactory {

    public Button createButton() {
        return new LinuxButton();
    }

    public Menu createMenu() {
        return new LinuxMenu();
    }
}
