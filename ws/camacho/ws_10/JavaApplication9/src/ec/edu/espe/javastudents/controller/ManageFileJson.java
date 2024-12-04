package ec.edu.espe.javastudents.controller;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import ec.edu.espe.javastudents.model.Classroom;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class ManageFileJson {
    public static void saveClassroomsToFile(ArrayList<Classroom> classrooms, String filename) {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String json = gson.toJson(classrooms);

        try (FileWriter writer = new FileWriter(filename)) {
            writer.write(json);
            System.out.println("Datos guardados en " + filename);
        } catch (IOException e) {
            System.out.println("Error al guardar los datos en el archivo: " + e.getMessage());
        }
    }
}

