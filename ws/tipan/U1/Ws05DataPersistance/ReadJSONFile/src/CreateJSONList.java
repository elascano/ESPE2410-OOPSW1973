
import java.io.FileWriter;
import java.io.IOException;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author USER
 */
public class CreateJSONList {
    public static void main(String[] args) {
        // Crear un objeto JSONObject para el "producto"
        JSONObject product1 = new JSONObject();
        product1.put("id", 101);
        product1.put("name", "Wireless Headphones");
        product1.put("brand", "TechSound");
        product1.put("price", 99.99);
        product1.put("in_stock", true);
        
        // Crear un objeto JSONObject para las especificaciones del producto
        JSONObject specifications1 = new JSONObject();
        specifications1.put("color", "Black");
        specifications1.put("battery_life", "20 hours");
        specifications1.put("connectivity", "Bluetooth 5.0");
        specifications1.put("weight", "250g");
        product1.put("specifications", specifications1);
        
        // Crear un arreglo de categorías
        JSONArray categories1 = new JSONArray();
        categories1.add("Electronics");
        categories1.add("Audio");
        categories1.add("Wireless Devices");
        product1.put("categories", categories1);
        
        // Crear un objeto JSONObject para las calificaciones
        JSONObject ratings1 = new JSONObject();
        ratings1.put("average", 4.5);
        ratings1.put("reviews_count", 235);
        product1.put("ratings", ratings1);
        
        // Añadir la fecha de lanzamiento
        product1.put("release_date", "2023-07-15");
        
        // Crear el segundo producto
        JSONObject product2 = new JSONObject();
        product2.put("id", 102);
        product2.put("name", "Smartphone");
        product2.put("brand", "SuperPhone");
        product2.put("price", 599.99);
        product2.put("in_stock", false);
        
        // Crear las especificaciones para el segundo producto
        JSONObject specifications2 = new JSONObject();
        specifications2.put("color", "Silver");
        specifications2.put("battery_life", "15 hours");
        specifications2.put("connectivity", "5G");
        specifications2.put("weight", "180g");
        product2.put("specifications", specifications2);
        
        // Crear un arreglo de categorías
        JSONArray categories2 = new JSONArray();
        categories2.add("Electronics");
        categories2.add("Mobile");
        product2.put("categories", categories2);
        
        // Crear un objeto para las calificaciones
        JSONObject ratings2 = new JSONObject();
        ratings2.put("average", 4.0);
        ratings2.put("reviews_count", 100);
        product2.put("ratings", ratings2);
        
        // Añadir la fecha de lanzamiento
        product2.put("release_date", "2023-05-20");
        
        // Crear un JSONArray para almacenar los productos
        JSONArray productsList = new JSONArray();
        productsList.add(product1);
        productsList.add(product2);
        
        // Crear el objeto principal JSON
        JSONObject mainObject = new JSONObject();
        mainObject.put("products", productsList);
        
        // Escribir el objeto JSON en un archivo
        try (FileWriter file = new FileWriter("products.json")) {
            file.write(mainObject.toJSONString());
            file.flush();
            System.out.println("JSON file created successfully!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
