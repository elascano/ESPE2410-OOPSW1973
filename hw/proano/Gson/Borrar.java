import org.json.JSONArray;
import org.json.JSONObject;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.io.FileWriter;

public class ManejarJSON {

    public static void main(String[] args) {
        // Ruta del archivo JSON
        String rutaArchivo = "estudiantes.json";

        // Llamar a la función para borrar un estudiante
        borrarEstudianteDeJSON(rutaArchivo, "Juan");
    }

    /**
     * Función para borrar un estudiante del archivo JSON.
     *
     * @param rutaArchivo La ruta del archivo JSON.
     * @param nombre El nombre del estudiante que se desea borrar.
     */
    public static void borrarEstudianteDeJSON(String rutaArchivo, String nombre) {
        try {
            // Leer el contenido del archivo JSON
            String contenidoJSON = new String(Files.readAllBytes(Paths.get(rutaArchivo)));

            // Convertir el contenido a un objeto JSON
            JSONObject jsonPrincipal = new JSONObject(contenidoJSON);

            // Extraer el arreglo de estudiantes
            JSONArray estudiantesArray = jsonPrincipal.getJSONArray("estudiantes");

            // Buscar y borrar al estudiante por nombre
            for (int i = 0; i < estudiantesArray.length(); i++) {
                JSONObject estudiante = estudiantesArray.getJSONObject(i);
                if (estudiante.getString("nombre").equals(nombre)) {
                    estudiantesArray.remove(i);
                    System.out.println("Estudiante '" + nombre + "' eliminado del JSON.");
                    break;
                }
            }

            // Escribir el JSON actualizado en el archivo
            try (FileWriter file = new FileWriter(rutaArchivo)) {
                file.write(jsonPrincipal.toString(4)); // Escribir con formato indentado
                System.out.println("Archivo JSON actualizado correctamente.");
            }

        } catch (IOException e) {
            System.out.println("Error al leer o escribir el archivo JSON: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Ocurrió un error inesperado: " + e.getMessage());
        }
    }
}
