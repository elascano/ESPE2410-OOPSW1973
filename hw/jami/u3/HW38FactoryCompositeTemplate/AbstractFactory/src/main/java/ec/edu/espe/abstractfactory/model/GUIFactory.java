package ec.edu.espe.abstractfactory.model;

/**
 *
 * @author Klever Jami
 */
public abstract class GUIFactory {

    public static GUIFactory getFactory() {
        int sys = readFromConfigFile("OS_TYPE");
        if (sys == 0) {
            return new WinFactory();
        } else {
            return new LinuxFactory();
        }
    }

    public abstract Button createButton();

    public abstract Menu createMenu();

    private static int readFromConfigFile(String key) {
        return 0;
    }
}
