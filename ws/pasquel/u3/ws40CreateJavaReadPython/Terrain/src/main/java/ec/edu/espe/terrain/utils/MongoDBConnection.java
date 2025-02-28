package ec.edu.espe.terrain.utils;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.MongoCollection;
import org.bson.Document;

/**
 *
 * @author LABS-DCCO
 */


public class MongoDBConnection {

    private static MongoClient mongoClient;
    private static MongoDatabase database;

    private static final String CONNECTION_STRING = "mongodb+srv://mpasquel:mpasquel@cluster0.be8gs.mongodb.net/";

    static {
        try {
            mongoClient = MongoClients.create(CONNECTION_STRING);
            database = mongoClient.getDatabase("Terrain");  
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static MongoCollection<Document> getTerrainCollection() {
        return database.getCollection("terrain");
    }

    public static void close() {
        if (mongoClient != null) {
            mongoClient.close();
        }
    }
}
