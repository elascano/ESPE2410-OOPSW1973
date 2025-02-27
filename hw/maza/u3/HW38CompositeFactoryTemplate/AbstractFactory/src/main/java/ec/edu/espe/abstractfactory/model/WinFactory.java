package ec.edu.espe.abstractfactory.model;

/**
 *
 * @author gustavo
 */
public class WinFactory extends GUIFactory {
    @Override
    public Button createButton(String caption) {
        return new WinButton(caption);
    }

    @Override
    public Menu createMenu(String caption) {
        return new WinMenu(caption);
    }
}
