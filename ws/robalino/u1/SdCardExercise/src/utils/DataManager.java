

package utils;

/**
 *
 * @author abrobalino
 */
import cd.es.edu.SDCardPrj.model.SDCard;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.io.*;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
public class DataManager {
   private final String filePath;
    private final Gson gson;
    private List<SDCard> sdcards;

    public DataManager(String filePath) {
        this.filePath = filePath;
        this.gson = new Gson();
        this.sdcards = new ArrayList<>();
        loadFromFile();
    }

    private void loadFromFile() {
        try (Reader reader = new FileReader(filePath)) {
            Type listType = new TypeToken<List<SDCard>>() {}.getType();
            this.sdcards = gson.fromJson(reader, listType);
            if (this.sdcards == null) {
                this.sdcards = new ArrayList<>();
            }
        } catch (FileNotFoundException e) {
            this.sdcards = new ArrayList<>();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void saveToFile() {
        try (Writer writer = new FileWriter(filePath)) {
            gson.toJson(sdcards, writer);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void addObject(SDCard sdcard) {
        this.sdcards.add(sdcard);
        saveToFile();
    }

    public void updateObject(int id, SDCard updatedSDCard, boolean overwrite) {
        deleteObject(id); 
        if (overwrite) {
            addObject(updatedSDCard); 
        }
    }

    public void deleteObject(int id) {
        this.sdcards.removeIf(sdcard -> sdcard.getId() == id);
        saveToFile();
    }

    public List<SDCard> getAllObjects() {
        return new ArrayList<>(sdcards);
    }

    public SDCard searchById(int id) {
        return this.sdcards.stream()
                .filter(sdcard -> sdcard.getId() == id)
                .findFirst()
                .orElse(null);
    }
}
