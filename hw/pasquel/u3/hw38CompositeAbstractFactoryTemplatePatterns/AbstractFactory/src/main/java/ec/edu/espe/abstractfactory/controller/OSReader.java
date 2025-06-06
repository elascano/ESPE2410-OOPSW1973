
package ec.edu.espe.abstractfactory.controller;

/**
 *
 * @author Marlon Pasquel
 */
public class OSReader {
public static int readFromConfigFile(String key) {
        try {
            String value = System.getProperty(key);
            if (value != null) {
                return Integer.parseInt(value);
            } else {
                System.err.println("No se encontró la propiedad: " + key);
                return -1;
            }
        } catch (NumberFormatException e) {
            e.printStackTrace();
            return -1;
        }
    }

}
