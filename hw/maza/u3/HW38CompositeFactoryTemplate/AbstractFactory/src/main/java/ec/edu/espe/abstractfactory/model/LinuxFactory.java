package ec.edu.espe.abstractfactory.model;
/**
 *
 * @author gustavo
 */
public class LinuxFactory extends GUIFactory {
    @Override
    public Button createButton(String caption) {
        return new LinuxButton(caption);
    }

    @Override
    public Menu createMenu(String caption) {
        return new LinuxMenu(caption);
    }
}