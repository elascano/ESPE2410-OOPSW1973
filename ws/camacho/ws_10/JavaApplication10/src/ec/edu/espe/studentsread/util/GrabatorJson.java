package ec.edu.espe.studentsread.util;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import ec.edu.espe.studentsread.model.Student;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class GrabatorJson {
    public static void writeJsonFile(String filePath, List<Student> students) {
        Gson gson = new Gson();
        JsonObject jsonObject = new JsonObject();
        jsonObject.add("students", gson.toJsonTree(students));

        try (FileWriter writer = new FileWriter(filePath)) {
            gson.toJson(jsonObject, writer);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}