package ec.edu.espe.readdatafrommongodb;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

public class ReadDataFromMongoDB {
    public static void main(String[] args) {
        String uri = "mongodb+srv://dapilatasig:dapilatasig@cluster0.1qaby.mongodb.net/?retryWrites=true&w=majority&appName=Cluster0";
        
        try (MongoClient mongoClient = MongoClients.create(uri)) {
            MongoDatabase database = mongoClient.getDatabase("OOP_DP");
            MongoCollection<Document> collection = database.getCollection("DecorativeTables");

            System.out.println("Connected to MongoDB!\n");
            System.out.println("Decorative Tables:");
            System.out.println("---------------------");

 
            try (MongoCursor<Document> cursor = collection.find().iterator()) {
                while (cursor.hasNext()) {
                    Document doc = cursor.next();

                    
                    String name = doc.getString("name");
                    String material = doc.getString("material");
                    String color = doc.getString("color");
                    String size = doc.getString("size");

                   
                    Object priceObj = doc.get("price");
                    double price = (priceObj instanceof Integer) 
                                   ? ((Integer) priceObj).doubleValue() 
                                   : (priceObj instanceof Double ? (Double) priceObj : 0.0);

                    // Imprimir la información
                    System.out.println("Name: " + name);
                    System.out.println("Material: " + material);
                    System.out.println("Color: " + color);
                    System.out.println("Size: " + size);
                    System.out.println("Price: $" + price);
                    System.out.println("---------------------");
                }
            }
        } catch (Exception e) {
            System.err.println("An error occurred while connecting to MongoDB:");
            e.printStackTrace();
        }
    }
}

