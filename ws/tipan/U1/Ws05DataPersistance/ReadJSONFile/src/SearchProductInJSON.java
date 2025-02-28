
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;
import org.json.simple.JSONArray;
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
public class SearchProductInJSON {
   
     public static void main(String[] args) {
        // El ID del producto que queremos buscar
        long productIdToSearch = 101;

        // Ruta del archivo JSON
        String filePath = "src/readjsonfile/data.json";

        try {
            // Leer el archivo JSON
            JSONParser parser = new JSONParser();
            FileReader reader = new FileReader(filePath);

            // Convertir el archivo JSON a un JSONObject
            JSONObject jsonObject = (JSONObject) parser.parse(reader);

            // Obtener la lista de productos
            JSONArray products = (JSONArray) jsonObject.get("products");

            // Variable para indicar si el producto fue encontrado
            boolean productFound = false;

            // Recorrer la lista de productos para encontrar el producto por ID
            for (Object obj : products) {
                // Convertir cada elemento a un JSONObject
                JSONObject product = (JSONObject) obj;

                // Obtener el ID del producto
                long id = (long) product.get("id");

                // Comprobar si el ID coincide con el ID que buscamos
                if (id == productIdToSearch) {
                    // Mostrar los detalles del producto encontrado
                    String name = (String) product.get("name");
                    String brand = (String) product.get("brand");
                    double price = (double) product.get("price");
                    boolean inStock = (boolean) product.get("in_stock");
                    String releaseDate = (String) product.get("release_date");

                    // Imprimir los detalles del producto
                    System.out.println("Producto encontrado:");
                    System.out.println("ID: " + id);
                    System.out.println("Name: " + name);
                    System.out.println("Brand: " + brand);
                    System.out.println("Price: " + price);
                    System.out.println("In stock: " + inStock);
                    System.out.println("Release Date: " + releaseDate);
                    productFound = true;
                    break; // Salir del bucle una vez encontrado
                }
            }

            // Si el producto no fue encontrado
            if (!productFound) {
                System.out.println("Producto con ID " + productIdToSearch + " no encontrado.");
            }

        } catch (IOException | org.json.simple.parser.ParseException e) {
            e.printStackTrace();
        }
    }
}