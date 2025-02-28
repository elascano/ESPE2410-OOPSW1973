/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utils;

/**
 *
 * @author USUARIO
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
