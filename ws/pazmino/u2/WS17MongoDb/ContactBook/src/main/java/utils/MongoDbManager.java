package utils;

import com.mongodb.MongoClientSettings;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.MongoCollection;
import org.bson.Document;

/**
 *
 * @author Brandon Pazmino
 */
public class MongoDbManager {
    
    private MongoClient mongoClient;
    private MongoDatabase database;
  

    public void connect(String connectionString, String dbName) {
        try {
            System.out.println("Connecting to MongoDB...");
            mongoClient = MongoClients.create("mongodb+srv://bpazmino:bpazmino@cluster0.ot5jx.mongodb.net/?retryWrites=true&w=majority&appName=Cluster0");
            database = mongoClient.getDatabase("OOP");
            System.out.println("Connected to database: " + "OOP");
        } catch (Exception e) {
            System.err.println("Error connecting to MongoDB: " + e.getMessage());
        }
    }

    public static boolean add(Object object) {
        
        //TODO add any object to the database
        String collectionName = null;
        boolean saved = false;
        try {
            collectionName = object.getClass().toString();
            System.out.println("saving -->" + collectionName + "<--" + object);
            //implement the saving data for any object.
            saved = true;
        } catch (Exception ex) {
            System.out.println("error saving " + collectionName + "");
            saved = false;
        }
        return saved;
    }

}
