

package ec.edu.espe.abstractfactoryexample.model;

/**
 *
 * @author Robinson Bonilla
 */
public class LinuxFactory extends GUIFactory {
    public Button createButton() {
        return new LinuxButton();
    }

    public Menu createMenu() {
        return new LinuxMenu();
    }
}
