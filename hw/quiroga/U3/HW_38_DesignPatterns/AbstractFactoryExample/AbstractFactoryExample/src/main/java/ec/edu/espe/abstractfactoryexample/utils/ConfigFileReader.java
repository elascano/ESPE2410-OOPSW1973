
package ec.edu.espe.abstractfactoryexample.utils;

/**
 *
 * @author Esteban Quiroga 
 */
public class ConfigFileReader {
    
    public static int readFromConfigFile(String key){
        try {
            String osSystem = System.getenv("OS_SYSTEM");
            if(osSystem == null)
                System.out.println("osSystem is null");
            if ("Windows".equals(osSystem))
                return 0;
            else if("Linux".equals(osSystem))
                return 1;
        }catch (IllegalArgumentException e) {
            System.out.println("Can't get OS_SYSTEM value: "+ e.getMessage());
        }
        return -1;
    }
}
