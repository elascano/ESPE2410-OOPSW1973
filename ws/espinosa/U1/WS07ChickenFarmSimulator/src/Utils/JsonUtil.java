package Utils;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import com.google.gson.reflect.TypeToken;
import ec.espe.edu.farmsimulator.model.Chicken;
import java.io.BufferedReader;
import java.io.FileReader;
import java.lang.reflect.Type;
import java.util.ArrayList;

/**
 *
 * @author Andrés Espinosa
 */

public class JsonUtil {
    public static <T> void writeListToJson(String filePath, List<T> list) {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        try (FileWriter writer = new FileWriter(filePath)) {
            gson.toJson(list, writer);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static ArrayList<Chicken> ReadJson(String filePath) {
        Gson gson = new Gson(); 
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) { 
            Type chickenListType = new TypeToken<List<Chicken>>() {}.getType();
            return gson.fromJson(reader, chickenListType);
        } catch (IOException e) { e.printStackTrace();
        } return null;
    }
}


