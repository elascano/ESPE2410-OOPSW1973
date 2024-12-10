package ec.edu.espe.studentsread.model;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.reflect.TypeToken;
import ec.edu.espe.studentsread.model.Student;

import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public class Reader {
    public static List<Student> readJsonFile(String filePath) {
        List<Student> students = new ArrayList<>();
        Gson gson = new Gson();

        try (FileReader reader = new FileReader(filePath)) {
            JsonObject jsonObject = gson.fromJson(reader, JsonObject.class);
            Type studentListType = new TypeToken<ArrayList<Student>>(){}.getType();
            students = gson.fromJson(jsonObject.get("students"), studentListType);
        } catch (IOException e) {
            e.printStackTrace();
        }

        return students;
    }
}