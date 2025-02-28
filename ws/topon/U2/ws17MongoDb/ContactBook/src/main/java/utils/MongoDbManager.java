package utils;

import com.mongodb.MongoClientSettings;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.MongoCollection;
import org.bson.Document;

/**
 *
 * @author Mateo Topon 
 */
public class MongoDbManager {
    
    private MongoClient mongoClient;
    private MongoDatabase database;
  

    public void connect(String connectionString, String dbName) {
        try {
            System.out.println("Connecting to MongoDB...");
            mongoClient = MongoClients.create("mongodb+srv://mtopon:mtopon@cluster0.nmg4z.mongodb.net/?retryWrites=true&w=majority&appName=Cluster0");
            database = mongoClient.getDatabase("ContactBook");
            System.out.println("Connected to database: " + "ContactBook");
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
