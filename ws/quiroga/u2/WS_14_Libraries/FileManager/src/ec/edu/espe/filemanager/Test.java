
package ec.edu.espe.filemanager;

import java.util.ArrayList;

/**
 *
 * @author Esteban Quiroga 
 */
public class Test {
    public static void main(String[] args) {
        ArrayList<String> objects;
        objects = JsonManager.decerializeJson("data\\people.json");
        
        for(String elemento : objects){
            System.out.println(elemento);
        }  
        }
    }


