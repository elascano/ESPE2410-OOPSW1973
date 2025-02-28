package ec.edu.espe.Factory.controller;

/**
 *
 * @author Andrés Sandoval
 */
public class OSReader {

    public static int readFromConfigFile(String key) {
        try {
            String value = System.getProperty(key);
            if (value != null) {
                return Integer.parseInt(value);
            } else {
                System.err.println("Property not found: " + key);
                return -1;
            }
        } catch (NumberFormatException e) {
            e.printStackTrace();
            return -1;
        }
    }

}
