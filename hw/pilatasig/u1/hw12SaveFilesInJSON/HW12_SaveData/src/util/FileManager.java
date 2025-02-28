package util;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import ec.edu.ec.espe.HW12.model.Developer;

import java.io.FileWriter;
import java.io.IOException;
/**
 *
 * @author David Pilatasig
 */ 

public class FileManager {

    public void guardarEnJson(Developer developer, String filePath) {
        Gson gson = new GsonBuilder().setPrettyPrinting().create(); // Formato legible

        try (FileWriter writer = new FileWriter(filePath)) {
            gson.toJson(developer, writer);
            System.out.println("Información del developer guardada en " + filePath);
        } catch (IOException e) {
            System.out.println("Error al guardar el archivo JSON: " + e.getMessage());
        }
    }
}

