package utils;

import com.google.gson.Gson;
import com.mongodb.client.*;
import com.mongodb.client.result.DeleteResult;
import com.mongodb.client.result.UpdateResult;
import ec.edu.espe.contactsbook.model.Contact;
import org.bson.Document;

import java.util.*;

/**
 *
 * @author Lucas Gongora
 */
public class MongoDbManager {

    private String uri;
    private String dbname;
    private MongoClient client;
    private MongoDatabase database;
    private Gson gson;

    public MongoDbManager(String dbname) {
        String user = System.getenv("MONGO_USER");
        String password = System.getenv("MONGO_PASSWORD");

        if (user == null || password == null) {
            throw new IllegalArgumentException("MongoDB user or password not set in environment variables.");
        }

        this.uri = "mongodb+srv://" + user + ":" + password + "@cluster0.y73d4.mongodb.net/";

        if (dbname == null || dbname.isEmpty()) {
            throw new IllegalArgumentException("Database name cannot be null or empty");
        }

        this.dbname = dbname;
        this.client = MongoClients.create(uri);
        this.gson = new Gson();
    }

    public void connectDB() {
        try {
            this.database = client.getDatabase(this.dbname);
            System.out.println("Connected to database: " + this.dbname);
        } catch (Exception e) {
            System.err.println("Can't connect to the database: " + e.getMessage());
        }
    }

    public boolean insertData(String collectionName, Object object) {
        boolean confirm = false;
        if (database == null) {
            System.err.println("No database connection. Please connect to the database first.");
            return confirm;
        }

        if (collectionName == null || collectionName.isEmpty()) {
            System.err.println("Collection name cannot be null or empty.");
            return confirm;
        }

        try {
            MongoCollection<Document> collection = database.getCollection(collectionName);
            Map<String, Object> map = gson.fromJson(gson.toJson(object), Map.class);
            collection.insertOne(new Document(map));
            System.out.println("Inserted document into collection: " + collectionName);
            confirm = true;
            return confirm;
        } catch (Exception e) {
            System.err.println("Error inserting data into collection " + collectionName + " - " + e.getMessage());
            return confirm;
        }
    }

    public void findData(String collectionName, Document query) {
        if (database == null) {
            System.err.println("No database connection. Please connect to the database first.");
            return;
        }

        if (collectionName == null || collectionName.isEmpty()) {
            System.err.println("Collection name cannot be null or empty.");
            return;
        }

        if (query == null) {
            System.err.println("Query document cannot be null.");
            return;
        }

        try {
            MongoCollection<Document> collection = database.getCollection(collectionName);
            FindIterable<Document> result = collection.find(query);
            for (Document doc : result) {
                System.out.println(doc.toJson());
            }
        } catch (Exception e) {
            System.err.println("Error retrieving data from collection " + collectionName + " - " + e.getMessage());
        }
    }

    public ArrayList<Contact> readData(String collectionName, Document query) {
        ArrayList<Contact> results = new ArrayList<>();
        if (database == null || collectionName == null || collectionName.isEmpty()) {
            System.err.println("Invalid database connection or collection name.");
            return results;
        }

        try {
            MongoCollection<Document> collection = database.getCollection(collectionName);
            FindIterable<Document> result = collection.find(query);
            for (Document doc : result) {
                Contact obj = gson.fromJson(doc.toJson(), Contact.class);
                results.add(obj);
            }
        } catch (Exception e) {
            System.err.println("Error retrieving data from collection " + collectionName + " - " + e.getMessage());
        }
        return results;
    }

    public ArrayList<Contact> readAllData(String collectionName) {
        return readData(collectionName, new Document());
    }

    public void updateData(String collectionName, Document query, Document updateDoc) {
        if (database == null) {
            System.err.println("No database connection. Please connect to the database first.");
            return;
        }

        if (collectionName == null || collectionName.isEmpty()) {
            System.err.println("Collection name cannot be null or empty.");
            return;
        }

        if (query == null || updateDoc == null) {
            System.err.println("Query or update document cannot be null.");
            return;
        }

        try {
            MongoCollection<Document> collection = database.getCollection(collectionName);
            UpdateResult result = collection.updateOne(query, new Document("$set", updateDoc));
            if (result.getMatchedCount() == 0) {
                System.out.println("No documents matched the query. No update made.");
            } else {
                System.out.println("Matched and updated documents in collection " + collectionName + ": " + result.getModifiedCount());
            }
        } catch (Exception e) {
            System.err.println("Error updating data in collection " + collectionName + " - " + e.getMessage());
        }
    }

    public void deleteData(String collectionName, Document query) {
        if (database == null) {
            System.err.println("No database connection. Please connect to the database first.");
            return;
        }

        if (collectionName == null || collectionName.isEmpty()) {
            System.err.println("Collection name cannot be null or empty.");
            return;
        }

        if (query == null) {
            System.err.println("Query document cannot be null.");
            return;
        }

        try {
            MongoCollection<Document> collection = database.getCollection(collectionName);
            DeleteResult result = collection.deleteOne(query);
            if (result.getDeletedCount() == 0) {
                System.out.println("No documents matched the query. No deletion made.");
            } else {
                System.out.println("Deleted document count in collection " + collectionName + ": " + result.getDeletedCount());
            }
        } catch (Exception e) {
            System.err.println("Error deleting data from collection " + collectionName + " - " + e.getMessage());
        }
    }

    public void closeConnection() {
        try {
            if (client != null) {
                client.close();
                System.out.println("Connection closed.");
            }
        } catch (Exception e) {
            System.err.println("Error closing connection: " + e.getMessage());
        }
    }
}
