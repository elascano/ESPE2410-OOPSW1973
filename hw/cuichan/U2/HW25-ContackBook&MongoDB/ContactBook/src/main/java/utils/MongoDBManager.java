package utils;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;
import com.mongodb.client.model.Filters;
import java.util.ArrayList;
import java.util.Calendar;

/**
 *
 * @author David Cuichan
 */
public class MongoDBManager {
    private static final String URI = "mongodb+srv://HectorD:hTCvkRkfhXROZMYN@clusterdb.to0oy.mongodb.net/?retryWrites=true&w=majority&appName=ClusterDB";
    private static MongoClient mongoClient;
    private static MongoDatabase database;
    
    public static void connect() {
        try {
            mongoClient = MongoClients.create(URI);
            database = mongoClient.getDatabase("ContactBook");
            System.out.println("Connected to MongoDB");
            
            if (!collectionExists("Contacts")) {
                database.createCollection("Contacts");
                System.out.println("Collection 'Contacts' created");
            }
        } catch (Exception e) {
            System.err.println("Error to connect " + e.getMessage());
        }
    }
    
    private static boolean collectionExists(String collectionName) {
        for (String name : database.listCollectionNames()) {
            if (name.equals(collectionName)) {
                return true;
            }
        }
        return false;
    }
    
    public static boolean insertContact(int id, String name, char sex, String gender, 
            String maritalStatus, Calendar dateOfBirth, ArrayList<String> favoriteSports, String comments) {
        try {
            MongoCollection<Document> collection = database.getCollection("Contacts");
            
            Document contact = new Document();
            contact.append("_id", id)
                  .append("name", name)
                  .append("sex", String.valueOf(sex))
                  .append("gender", gender)
                  .append("maritalStatus", maritalStatus)
                  .append("dateOfBirth", dateOfBirth.getTime())
                  .append("favoriteSports", favoriteSports)
                  .append("comments", comments);
            
            collection.insertOne(contact);
            System.out.println("Contact inserted");
            return true;
        } catch (Exception e) {
            System.err.println("Error " + e.getMessage());
            return false;
        }
    }
    
    public static Document findContact(String id) {
        try {
            MongoCollection<Document> collection = database.getCollection("Contacts");
            Document doc = collection.find(Filters.eq("_id", Integer.parseInt(id))).first();
            if (doc != null) {
                System.out.println("Contact found: " + doc.toJson());
                return doc;
            } else {
                System.out.println("No contact ID found: " + id);
                return null;
            }
        } catch (Exception e) {
            System.err.println("Error to find contact: " + e.getMessage());
            return null;
        }
    }
    
    public static boolean deleteContact(String id) {
        try {
            MongoCollection<Document> collection = database.getCollection("contacts");
            Document result = collection.findOneAndDelete(Filters.eq("_id", Integer.parseInt(id)));
            if (result != null) {
                System.out.println("Contacto deleted");
                return true;
            } else {
                System.out.println("No contact found to delete with ID: " + id);
                return false;
            }
        } catch (Exception e) {
            System.err.println("Error to delete contact: " + e.getMessage());
            return false;
        }
    }
    
    public static void close() {
        if (mongoClient != null) {
            try {
                mongoClient.close();
                System.out.println("Connection to MongoDB closed successfully");
            } catch (Exception e) {
                System.err.println("Error to exit: " + e.getMessage());
            }
        }
    }
}