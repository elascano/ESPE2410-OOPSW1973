

package ec.edu.espe.abstractfactoryexample.model;

/**
 *
 * @author Alan Arias
 */
public abstract class GUIFactory {
    public static GUIFactory getFactory() {
        int os = readFromConfigFile("OS_TYPE");
        if (os == 0) return new WinFactory();
        else return new LinuxFactory();
    }

    public abstract Button createButton();
    public abstract Menu createMenu();

    private static int readFromConfigFile(String key) {
        return 0;
    }
}
