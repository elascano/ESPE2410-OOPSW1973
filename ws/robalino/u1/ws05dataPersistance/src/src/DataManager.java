// File: src/DataManager.java
package src;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.io.*;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public class DataManager {
    private final String filePath;
    private final Gson gson;
    private List<Person> people;

    public DataManager(String filePath) {
        this.filePath = filePath;
        this.gson = new Gson();
        this.people = new ArrayList<>();
        loadFromFile(); // Load existing data if available
    }

    private void loadFromFile() {
        try (Reader reader = new FileReader(filePath)) {
            Type listType = new TypeToken<List<Person>>() {}.getType();
            this.people = gson.fromJson(reader, listType);
            if (this.people == null) {
                this.people = new ArrayList<>();
            }
        } catch (FileNotFoundException e) {
            this.people = new ArrayList<>();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void saveToFile() {
        try (Writer writer = new FileWriter(filePath)) {
            gson.toJson(people, writer);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void addObject(Person person) {
        this.people.add(person);
        saveToFile();
    }

    public void updateObject(int id, Person updatedPerson, boolean overwrite) {
        deleteObject(id); // Remove existing data
        if (overwrite) {
            addObject(updatedPerson); // Add the new data
        }
    }

    public void deleteObject(int id) {
        this.people.removeIf(person -> person.getId() == id);
        saveToFile();
    }

    public List<Person> getAllObjects() {
        return new ArrayList<>(people);
    }

    public Person searchById(int id) {
        return this.people.stream()
                .filter(person -> person.getId() == id)
                .findFirst()
                .orElse(null);
    }
}
