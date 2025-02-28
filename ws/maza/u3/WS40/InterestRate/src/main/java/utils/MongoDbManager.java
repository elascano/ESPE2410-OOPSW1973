package utils;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoDatabase;

/**
 *
 * @author Alexander Maza
 */

public class MongoDbManager {

    private static MongoClient mongoClient;
    private static MongoDatabase database;

    // Get the MongoDatabase instance
    public static MongoDatabase getDatabase() {
        if (database == null) {
            try {
                // URI for local MongoDB instance
                String uri = "mongodb+srv://jmaza:jmaza@cluster0.y11rj.mongodb.net/?retryWrites=true&w=majority&appName=Cluster0"; 
                mongoClient = MongoClients.create(uri);
                database = mongoClient.getDatabase("investments");
            } catch (Exception e) {
            }
        }
        return database;
    }

    // Close the MongoDB client connection
    public static void closeConnection() {
        if (mongoClient != null) {
            mongoClient.close();
        }
    }
}
