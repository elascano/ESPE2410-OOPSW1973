package utils;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import ec.edu.espe.farmsimulator.model.Chicken;

public class FileManager {

    
    public static void save(String data, String fileName, String extension) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName + "." + extension))) {
            writer.write(data);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void saveToCsv(String fileName, String[] headers, String[] values) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName + ".csv"))) {
            // Escribir encabezados
            writer.write(String.join(",", headers));
            writer.newLine();
            // Escribir valores
            writer.write(String.join(",", values));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Método para leer gallinas desde un archivo JSON
    public static ArrayList<Chicken> readChickensFromJson(String fileName) {
        ArrayList<Chicken> chickens = new ArrayList<>();
        Gson gson = new Gson();
        try (FileReader reader = new FileReader(fileName)) {
            Type chickenListType = new TypeToken<ArrayList<Chicken>>(){}.getType();
            chickens = gson.fromJson(reader, chickenListType);
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file: " + e.getMessage());
        }
        return chickens;
    }
}