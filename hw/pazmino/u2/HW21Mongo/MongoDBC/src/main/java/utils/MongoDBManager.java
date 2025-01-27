package utils;

import com.mongodb.MongoClientSettings;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.MongoCollection;
import org.bson.Document;

/**
 *
 * @author Brandon PAzmino
 */
public class MongoDBManager {
        private static final String CONNECTION_URI = "mongodb+srv://bpazmino:bpazmino@cluster0.ot5jx.mongodb.net/?retryWrites=true&w=majority&appName=Cluster0"; // Reemplaza con tu URI
    private static final String DATABASE_NAME = "OOP";   // Nombre de tu base de datos

    private MongoClient mongoClient;
    private MongoDatabase database;

    public MongoDBManager() {
        try {
            // Inicializamos el cliente Mongo con el URI
            mongoClient = MongoClients.create(CONNECTION_URI);
            database = mongoClient.getDatabase(DATABASE_NAME);
        } catch (Exception e) {
            System.out.println("Error connecting to MongoDB: " + e.getMessage());
        }
    }

    public MongoCollection<Document> getCollection(String collectionName) {
        return database.getCollection(collectionName);
    }

    public void closeConnection() {
        if (mongoClient != null) {
            mongoClient.close();
        }
    }
    
}
