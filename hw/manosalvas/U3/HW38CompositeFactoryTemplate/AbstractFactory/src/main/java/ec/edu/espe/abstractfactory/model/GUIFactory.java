
package ec.edu.espe.abstractfactory.model;

/**
 *
 * @author Gabriel Manosalvas
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

    public abstract Button createButton(String caption);
    public abstract Menu createMenu(String caption);

private static int readFromConfigFile(String key) {
    return 1; // Cambia a 1 si deseas usar LinuxFactory
}
}
