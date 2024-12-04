import org.json.JSONArray;
import org.json.JSONObject;

import java.io.FileWriter;
import java.io.IOException;

public class ManejoJSON {
    public static void main(String[] args) {
        // Crear un objeto JSON inicial
        JSONObject jsonPrincipal = new JSONObject();

        // Crear un arreglo de estudiantes
        JSONArray estudiantesArray = new JSONArray();

        // Agregar estudiantes existentes
        JSONObject estudiante1 = new JSONObject();
        estudiante1.put("nombre", "Ana");
        estudiante1.put("edad", 20);

        JSONObject estudiante2 = new JSONObject();
        estudiante2.put("nombre", "Juan");
        estudiante2.put("edad", 22);

        estudiantesArray.put(estudiante1);
        estudiantesArray.put(estudiante2);

        // Agregar el arreglo al objeto principal
        jsonPrincipal.put("estudiantes", estudiantesArray);

        // Insertar un nuevo estudiante
        JSONObject nuevoEstudiante = new JSONObject();
        nuevoEstudiante.put("nombre", "Carlos");
        nuevoEstudiante.put("edad", 23);

        // Añadir al arreglo de estudiantes
        estudiantesArray.put(nuevoEstudiante);

        // Escribir el JSON en un archivo
        try (FileWriter file = new FileWriter("estudiantes.json")) {
            file.write(jsonPrincipal.toString(4)); // Formatear con sangría
            System.out.println("JSON guardado correctamente en estudiantes.json");
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Imprimir el JSON en consola
        System.out.println(jsonPrincipal.toString(4));
    }
}
