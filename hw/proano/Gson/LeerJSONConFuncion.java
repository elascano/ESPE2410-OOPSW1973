import org.json.JSONArray;
import org.json.JSONObject;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class LeerJSONConFuncion {

    public static void main(String[] args) {
        // Ruta del archivo JSON
        String rutaArchivo = "estudiantes.json";

        // Llamamos a la función para leer los datos y procesarlos
        leerDatosDesdeJSON(rutaArchivo);
    }

    /**
     * Función para leer datos desde un archivo JSON y mostrarlos.
     *
     * @param rutaArchivo La ruta del archivo JSON.
     */
    public static void leerDatosDesdeJSON(String rutaArchivo) {
        try {
            // Leer el contenido del archivo JSON
            String contenidoJSON = new String(Files.readAllBytes(Paths.get(rutaArchivo)));

            // Convertir el contenido a un objeto JSON
            JSONObject jsonPrincipal = new JSONObject(contenidoJSON);

            // Extraer el arreglo de estudiantes
            JSONArray estudiantesArray = jsonPrincipal.getJSONArray("estudiantes");

            // Recorrer el arreglo y mostrar los datos de cada estudiante
            System.out.println("Lista de estudiantes:");
            for (int i = 0; i < estudiantesArray.length(); i++) {
                JSONObject estudiante = estudiantesArray.getJSONObject(i);
                String nombre = estudiante.getString("nombre");
                int edad = estudiante.getInt("edad");

                System.out.println("Nombre: " + nombre + ", Edad: " + edad);
            }

        } catch (IOException e) {
            System.out.println("Error al leer el archivo JSON: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Ocurrió un error inesperado: " + e.getMessage());
        }
    }
}
