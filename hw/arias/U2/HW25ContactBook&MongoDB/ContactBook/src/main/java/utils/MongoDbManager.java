
package utils;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;
import ec.edu.espe.contactbook.model.Contact;
import java.util.ArrayList;
import org.bson.Document;
import java.util.Calendar;
/**
 *
 * @author Alan Arias
 */

public class MongoDbManager {
    private static MongoClient mongoClient;
    private static MongoDatabase database;
    
    public static void connect(String connectionString) {
        try {
            mongoClient = MongoClients.create(connectionString);
            database = mongoClient.getDatabase("ContactBook");
            System.out.println("Successfully connected to MongoDB.");
        } catch (Exception e) {
            System.err.println("Error connecting to MongoDB: " + e.getMessage());
            throw e;
        }
    }
    
    public static boolean add(Object object) {
        if (!(object instanceof Contact)) {
            System.err.println("Object must be of type Contact");
            return false;
        }
        
        Contact contact = (Contact) object;
        boolean saved = false;
        
        try {
            MongoCollection<Document> collection = database.getCollection("Contacts");
        
            Calendar dob = contact.getDateOfBirth();
            String dateStr = String.format("%d-%02d-%02d", 
                dob.get(Calendar.YEAR), 
                dob.get(Calendar.MONTH) + 1, 
                dob.get(Calendar.DAY_OF_MONTH));
        
            Document doc = new Document()
                .append("_id", contact.getId())
                .append("name", contact.getName())
                .append("sex", String.valueOf(contact.getSex()))
                .append("gender", contact.getGender())
                .append("maritalStatus", contact.getMaritalStatus())
                .append("dateOfBirth", dateStr)
                .append("favoriteSports", contact.getFavoriteSports())
                .append("comments", contact.getComments());
   
            collection.insertOne(doc);
            saved = true;
            System.out.println("Successfully saved contact: " + contact.getName());
            
        } catch (Exception ex) {
            System.err.println("Error saving contact to MongoDB: " + ex.getMessage());
            saved = false;
        }
        
        return saved;
    }
    
    public static Contact find(String id) {
        try {
            MongoCollection<Document> collection = database.getCollection("Contacts");
    
            Document doc = collection.find(Filters.eq("_id", Integer.parseInt(id))).first();
            
            if (doc == null) {
                return null;
            }
            String dateStr = doc.getString("dateOfBirth");
            String[] dateParts = dateStr.split("-");
            Calendar dateOfBirth = Calendar.getInstance();
            dateOfBirth.set(
                Integer.parseInt(dateParts[0]),
                Integer.parseInt(dateParts[1]) - 1,
                Integer.parseInt(dateParts[2])
            );

            return new Contact(
                doc.getInteger("_id"),
                doc.getString("name"),
                doc.getString("sex").charAt(0),
                doc.getString("gender"),
                doc.getString("maritalStatus"),
                dateOfBirth,
                (ArrayList<String>) doc.get("favoriteSports"),
                doc.getString("comments")
            );
            
        } catch (Exception ex) {
            System.err.println("Error finding contact: " + ex.getMessage());
            return null;
        }
    }
    
    public static void close() {
        if (mongoClient != null) {
            mongoClient.close();
            System.out.println("MongoDB connection closed.");
        }
    }
}