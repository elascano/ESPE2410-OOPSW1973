package ec.edu.espe.jsonfile.model;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
/**
 *
 * @author David Cuichan
 */
public class JsonFile {
    private final String filePath;
    private final Gson gson;
    
    public JsonFile(String filePath) {
        this.filePath = filePath;
        this.gson = new GsonBuilder().setPrettyPrinting().create();
        ensureFileExists();
    }
    
    private void ensureFileExists() {
        File file = new File(filePath);
        if (!file.exists()) {
            File directory = file.getParentFile();
            if (directory != null && !directory.exists()) {
                directory.mkdirs();
            }
            
            try (FileWriter writer = new FileWriter(file)) {
                writer.write("{}");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    
    public boolean save(String key, Object value) {
        try {
            JsonObject jsonObject = readJson();
            jsonObject.add(key, gson.toJsonTree(value));
            writeJson(jsonObject);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
    
    private JsonObject readJson() throws IOException {
        try (FileReader reader = new FileReader(filePath)) {
            JsonParser parser = new JsonParser();
            return parser.parse(reader).getAsJsonObject();
        } catch (Exception e) {
            e.printStackTrace();
            return new JsonObject();
        }
    }
    
    private void writeJson(JsonObject jsonObject) throws IOException {
        try (FileWriter writer = new FileWriter(filePath)) {
            gson.toJson(jsonObject, writer);
        }
    }
}
