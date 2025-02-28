package utils;

import com.google.gson.Gson;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author David Cuichan
 */
public class FileSaver {
    public void saveAsCSV(Object object, String fileName) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            Map<String, String> data = convertObjectToMap(object);
            String header = String.join(",", data.keySet());
            writer.write(header);
            writer.newLine();
            String rowStr = String.join(",", data.values());
            writer.write(rowStr);
            writer.newLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private Map<String, String> convertObjectToMap(Object object) {
        Map<String, String> map = new HashMap<>();
        Field[] fields = object.getClass().getDeclaredFields();

        for (Field field : fields) {
            field.setAccessible(true);
            try {
                map.put(field.getName(), String.valueOf(field.get(object)));
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }
        return map;
    }

    public void saveAsJSON(Object object, String fileName) {
        Gson gson = new Gson();
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            gson.toJson(object, writer);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
