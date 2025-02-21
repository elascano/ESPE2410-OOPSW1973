package utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/**
 *
 * @author David Pilatasig
 */
public class ConfigReader {
    public static int readFromConfigFile(String key) {
        Properties properties = new Properties();
        try {
            FileInputStream fileInput = new FileInputStream("src/main/java/config/config.properties");
            properties.load(fileInput);
            fileInput.close();
            
            String value = properties.getProperty(key);
            if ("Windows".equalsIgnoreCase(value)) {
                return 0; 
            } else if ("Linux".equalsIgnoreCase(value)) {
                return 1; 
            }
        } catch (IOException e) {
            System.err.println("Error al leer el archivo de configuración: " + e.getMessage());
        }
        
        return -1;
    }
}
