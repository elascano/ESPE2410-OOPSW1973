package utils;

import com.mongodb.client.*;
import com.mongodb.client.model.Filters;
import org.bson.Document;
import ec.edu.espe.contactbook.model.Contact;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class MongoDBManager {
    private static MongoClient mongoClient;
    private static MongoDatabase database;
    private static MongoCollection<Document> collection;

    // Conectar a MongoDB
    public static void connect(String connectionString, String dbName) {
        mongoClient = MongoClients.create(connectionString);
        database = mongoClient.getDatabase(dbName);
        collection = database.getCollection("Contacts"); // Nombre de la colección
        
        if(collection==null){
            System.out.println("Error al inicializar la DataBase");
        }
        else{
            System.out.println("Conexión realizada");
        }
    }

    public static List<Contact> getAllContacts() {
        List<Contact> contacts = new ArrayList<>();

        for (Document doc : collection.find()) {
            Contact contact = documentToContact(doc);
            contacts.add(contact);
        }

        return contacts;
    }
    
    public static boolean addContact(Contact contact) {
        Document doc = new Document("id", contact.getId())
                .append("name", contact.getName())
                .append("sex", contact.getSex())
                .append("gender", contact.getGender())
                .append("maritalStatus", contact.getMaritalStatus())
                .append("dateOfBrith", contact.getDateOfBrith().getTime())
                .append("favoriteSports", contact.getFavoriteSports())
                .append("comments", contact.getComments());
        if (collection == null) {
            throw new IllegalStateException("MongoDB collection is not initialized.");
        }

        collection.insertOne(doc);
        return true;
    }

    public static Contact findContact(int id) {
        Document doc = collection.find(Filters.eq("id", id)).first();
        if (doc != null) {
            return documentToContact(doc);
        }
        return null;
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

    // Convertir un documento de MongoDB a un objeto Contact
    private static Contact documentToContact(Document doc) {
        int id = doc.getInteger("id");
        String name = doc.getString("name");
        String sex = doc.getString("sex");
        String gender = doc.getString("gender");
        String maritalStatus = doc.getString("maritalStatus");
        Calendar dateOfBrith = Calendar.getInstance();
        dateOfBrith.setTime(doc.getDate("dateOfBrith"));
        List<String> favoriteSports = doc.getList("favoriteSports", String.class);
        String comments = doc.getString("comments");

        return new Contact(id, name, sex, gender, maritalStatus, dateOfBrith, new ArrayList<>(favoriteSports), comments);
    }

    // Cerrar la conexión con la base de datos
    public static void close() {
        if (mongoClient != null) {
            mongoClient.close();
        }
    }
}


    
