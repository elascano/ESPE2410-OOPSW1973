package Utils;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import ec.espe.edu.farmsimulator.model.Chicken;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import com.google.gson.reflect.TypeToken;
import java.io.BufferedReader;
import java.io.FileReader;
import java.lang.reflect.Type;

/**
 *
 * @author Andrés Espinosa
 */

public class JsonUtil {
    public static void writeChickensToJson(String filePath, List<Chicken> chickens) {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        try (FileWriter writer = new FileWriter(filePath)) {
            gson.toJson(chickens, writer);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public static List<Chicken> readChickensFromJson(String filePath) {
        Gson gson = new Gson();
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            Type chickenListType = new TypeToken<List<Chicken>>() {}.getType();
            return gson.fromJson(reader, chickenListType);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

}
