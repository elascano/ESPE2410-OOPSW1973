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

        // Llamar a la función para actualizar los datos de un estudiante
        actualizarEstudianteEnJSON(rutaArchivo, "Ana", 25);
    }

    /**
     * Función para actualizar los datos de un estudiante en el archivo JSON.
     *
     * @param rutaArchivo La ruta del archivo JSON.
     * @param nombre El nombre del estudiante que se desea actualizar.
     * @param nuevaEdad La nueva edad que se desea asignar al estudiante.
     */
    public static void actualizarEstudianteEnJSON(String rutaArchivo, String nombre, int nuevaEdad) {
        try {
            // Leer el contenido del archivo JSON
            String contenidoJSON = new String(Files.readAllBytes(Paths.get(rutaArchivo)));

            // Convertir el contenido a un objeto JSON
            JSONObject jsonPrincipal = new JSONObject(contenidoJSON);

            // Extraer el arreglo de estudiantes
            JSONArray estudiantesArray = jsonPrincipal.getJSONArray("estudiantes");

            // Buscar al estudiante por nombre y actualizar su edad
            boolean encontrado = false;
            for (int i = 0; i < estudiantesArray.length(); i++) {
                JSONObject estudiante = estudiantesArray.getJSONObject(i);
                if (estudiante.getString("nombre").equals(nombre)) {
                    estudiante.put("edad", nuevaEdad); // Actualizamos la edad
                    System.out.println("Estudiante '" + nombre + "' actualizado con nueva edad: " + nuevaEdad);
                    encontrado = true;
                    break;
                }
            }

            if (!encontrado) {
                System.out.println("Estudiante '" + nombre + "' no encontrado en el JSON.");
            } else {
                // Escribir el JSON actualizado en el archivo
                try (FileWriter file = new FileWriter(rutaArchivo)) {
                    file.write(jsonPrincipal.toString(4)); // Escribir con formato indentado
                    System.out.println("Archivo JSON actualizado correctamente.");
                }
            }

        } catch (IOException e) {
            System.out.println("Error al leer o escribir el archivo JSON: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Ocurrió un error inesperado: " + e.getMessage());
        }
    }
}

