
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
public class CreateJSONFile {
        public static void main(String[] args) {
        try {
            // Create a JSONObject for the "product"
            JSONObject product = new JSONObject();
            product.put("id", 101);
            product.put("name", "Wireless Headphones");
            product.put("brand", "TechSound");
            product.put("price", 99.99);
            product.put("in_stock", true);

            // Create a JSONObject for the "specifications"
            JSONObject specifications = new JSONObject();
            specifications.put("color", "Black");
            specifications.put("battery_life", "20 hours");
            specifications.put("connectivity", "Bluetooth 5.0");
            specifications.put("weight", "250g");

            // Add "specifications" to the "product"
            product.put("specifications", specifications);

            // Create a JSONArray for the "categories"
            JSONArray categories = new JSONArray();
            categories.add("Electronics");
            categories.add("Audio");
            categories.add("Wireless Devices");

            // Add "categories" to the "product"
            product.put("categories", categories);

            // Create a JSONObject for the "ratings"
            JSONObject ratings = new JSONObject();
            ratings.put("average", 4.5);
            ratings.put("reviews_count", 235);

            // Add "ratings" to the "product"
            product.put("ratings", ratings);

            // Add "release_date" to the "product"
            product.put("release_date", "2023-07-15");

            // Now create a JSON file and write the JSON data into it
            try (FileWriter file = new FileWriter("product.json")) {
                // Write JSON data to the file
                file.write(product.toJSONString());
                file.flush();
                System.out.println("JSON file created successfully!");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

