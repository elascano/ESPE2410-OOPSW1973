package ec.edu.espe.farmsimulator.model;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import org.json.JSONObject;  // Asegúrate de que esta importación sea correcta

/**
 * Clase para manejar el guardado de datos en archivos CSV y JSON.
 * 
 * @author Gabriel Manosalvas
 */
public class FileManager {

    /**
     * Método para guardar los datos en formato CSV o JSON.
     * 
     * @param data Los datos que se quieren guardar en formato String.
     * @param fileName El nombre del archivo donde se van a guardar los datos.
     * @param format El formato de los datos (csv o json).
     */
    public static void save(String data, String fileName, String format) {
        try {
            // Crear un archivo con el nombre proporcionado
            File file = new File(fileName);

            // Si el archivo no existe, se crea
            if (!file.exists()) {
                file.createNewFile();
            }

            // Abrir el archivo en modo de escritura
            FileWriter writer = new FileWriter(file, true); // true para añadir al final del archivo

            // Si el formato es CSV, guardar como CSV
            if (format.equalsIgnoreCase("csv")) {
                writer.write(data + "\n");
            }
            // Si el formato es JSON, guardar como JSON
            else if (format.equalsIgnoreCase("json")) {
                // Convertir los datos a un objeto JSON
                JSONObject jsonData = new JSONObject(data);
                writer.write(jsonData.toString() + "\n");
            }

            // Cerrar el escritor después de escribir los datos
            writer.close();

        } catch (IOException e) {
            System.out.println("An error occurred while saving data to " + fileName);
            e.printStackTrace();
        }
    }
}
