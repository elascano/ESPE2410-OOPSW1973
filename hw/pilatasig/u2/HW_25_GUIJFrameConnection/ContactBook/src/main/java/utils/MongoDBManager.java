package utils;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

/**
 * MongoDBManager Utility Class
 * @author David Pilatasig
 */
public class MongoDBManager {
    private static MongoDatabase database;

    public static void connect(String connectionString, String dbName) {
        try {
            MongoClient mongoClient = MongoClients.create(connectionString);
            database = mongoClient.getDatabase(dbName);
            System.out.println("Connected to MongoDB database: " + dbName);
        } catch (Exception e) {
            System.out.println("Failed to connect to MongoDB: " + e.getMessage());
        }
    }

    public static boolean add(String collectionName, Document document) {
        try {
            MongoCollection<Document> collection = database.getCollection(collectionName);
            collection.insertOne(document);
            System.out.println("Document added to collection: " + collectionName);
            return true;
        } catch (Exception e) {
            System.out.println("Failed to add document: " + e.getMessage());
            return false;
        }
    }

    public static Document find(String collectionName, Document query) {
        try {
            MongoCollection<Document> collection = database.getCollection(collectionName);
            return collection.find(query).first();
        } catch (Exception e) {
            System.out.println("Failed to find document: " + e.getMessage());
            return null;
        }
    }

    public static boolean delete(String collectionName, Document query) {
        try {
            MongoCollection<Document> collection = database.getCollection(collectionName);
            collection.deleteOne(query);
            System.out.println("Document deleted from collection: " + collectionName);
            return true;
        } catch (Exception e) {
            System.out.println("Failed to delete document: " + e.getMessage());
            return false;
        }
    }
}
