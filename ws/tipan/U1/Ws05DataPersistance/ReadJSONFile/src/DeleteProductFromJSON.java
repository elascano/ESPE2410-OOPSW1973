
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author USER
 */
public class DeleteProductFromJSON {
    
    public static void main(String[] args) {
        // El ID del producto que queremos eliminar
        int productIdToDelete = 101;

        // Ruta del archivo JSON
        String filePath = "src/readjsonfile/data.json";

        try {
            // Leer el archivo JSON
            JSONParser parser = new JSONParser();
            FileReader reader = new FileReader(filePath);

            // Convertir el archivo JSON a un JSONObject
            JSONObject jsonObject = (JSONObject) parser.parse(reader);

            // Obtener el objeto "product" dentro del JSON
            JSONObject product = (JSONObject) jsonObject.get("product");

            // Verificar si el producto tiene el ID que queremos eliminar
            if (product != null && (int) product.get("101") == productIdToDelete) {
                // Si el ID coincide, eliminamos el producto
                jsonObject.remove("product");
                System.out.println("Producto eliminado exitosamente.");
            } else {
                System.out.println("Producto no encontrado.");
            }

            // Escribir los cambios de vuelta en el archivo JSON
            try (FileWriter file = new FileWriter(filePath)) {
                file.write(jsonObject.toJSONString());
                file.flush();
            }

        } catch (IOException | org.json.simple.parser.ParseException e) {
            e.printStackTrace();
        }
    }

}
