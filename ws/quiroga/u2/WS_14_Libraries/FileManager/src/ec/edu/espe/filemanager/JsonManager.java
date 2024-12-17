
package ec.edu.espe.filemanager;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.lang.reflect.Type;

/**
 *
 * @author Esteban Quiroga 
 */
public class JsonManager {
    
    public static ArrayList<String> decerializeJson(String filePath){
        try (FileReader reader = new FileReader(filePath)) {
            Gson gson;
            gson = new GsonBuilder().setPrettyPrinting().create();
            
            Type listType = new TypeToken<ArrayList<String>>() {}.getType();
            
            ArrayList<String> objects = gson.fromJson(reader, listType);
            
            return objects;
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        return null;
    }
    
    public static void insert(String data, String fileName)
    {
        System.out.println("Inserting Json -->"+data+" in the file--> "+fileName);
    }
    
    public static String read(String fileName)
    {
        return "";
    }
    
    public static String find(String findData, String fileName){
        return "";
    }
    
    public static boolean update(String originData, String newData, String fileName){
        return false;
    }
    
    public static boolean delete(String findData, String fileName){
        return false;
    }
}
