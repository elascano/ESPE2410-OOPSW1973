package utils;

import java.io.FileWriter;
import java.io.IOException;
import org.json.JSONObject;

public class FileManager {

    
    public static void save(String data, String fileName, String format) {
        if ("csv".equalsIgnoreCase(format)) {
            saveToCSV(data, fileName);
        } else if ("json".equalsIgnoreCase(format)) {
            saveToJSON(data, fileName);
        } else {
            System.out.println("Unsupported format: " + format);
        }
    }

    // Método para guardar datos en formato CSV
    private static void saveToCSV(String data, String fileName) {
        try (FileWriter writer = new FileWriter(fileName + ".csv", true)) {
            writer.append(data);
            writer.append("\n");
            System.out.println("Data saved to CSV: " + fileName + ".csv");
        } catch (IOException e) {
            System.out.println("Error writing to CSV file: " + e.getMessage());
        }
    }

    // Método para guardar datos en formato JSON
    private static void saveToJSON(String data, String fileName) {
        try (FileWriter writer = new FileWriter(fileName + ".json", true)) {
            // Convertir la cadena a un objeto JSON
            JSONObject jsonObject = new JSONObject();
            jsonObject.put("data", data);
            
            writer.write(jsonObject.toString(4));  // Escribir en formato bonito (indentación de 4 espacios)
            writer.append("\n");
            System.out.println("Data saved to JSON: " + fileName + ".json");
        } catch (IOException e) {
            System.out.println("Error writing to JSON file: " + e.getMessage());
        }
    }
}
