package readjsonfile;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import java.io.FileReader;
import java.io.IOException;
import org.json.simple.JSONArray;

public class ReadJSONWithSimple {
   public static void main(String[] args) {
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

            // Verificar si la lista de productos no está vacía
            if (products != null) {
                // Recorrer la lista de productos
                for (Object obj : products) {
                    // Convertir cada elemento a un JSONObject
                    JSONObject product = (JSONObject) obj;

                    // Leer los detalles del producto
                    long id = (long) product.get("id");
                    String name = (String) product.get("name");
                    String brand = (String) product.get("brand");
                    double price = (double) product.get("price");
                    boolean inStock = (boolean) product.get("in_stock");
                    String releaseDate = (String) product.get("release_date");

                    // Mostrar los detalles del producto
                    System.out.println("ID: " + id);
                    System.out.println("Name: " + name);
                    System.out.println("Brand: " + brand);
                    System.out.println("Price: " + price);
                    System.out.println("In stock: " + inStock);
                    System.out.println("Release Date: " + releaseDate);
                    System.out.println("----------------------------");
                }
            } else {
                System.out.println("No products found in the JSON file.");
            }

        } catch (IOException | org.json.simple.parser.ParseException e) {
            e.printStackTrace();
        }
    }
}