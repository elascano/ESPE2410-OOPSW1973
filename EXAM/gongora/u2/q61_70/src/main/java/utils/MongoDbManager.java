package utils;

import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.mongodb.MongoException;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.result.DeleteResult;
import com.mongodb.client.result.UpdateResult;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import javax.swing.text.Document;

public class MongoDbManager {

    private String uri;
    private String dbname;
    private MongoClient client;
    private MongoDatabase database;
    private Gson gson;

    public MongoDbManager(String dbname) {
        this.dbname = dbname;
        this.gson = new Gson();
        this.uri = "mongodb+srv://lngongora:lngongora@cluster0.y73d4.mongodb.net/";
        this.client = MongoClients.create(uri);
        connectDB();
    }

    public void connectDB() {
        try {
            if (client != null) {
                this.database = this.client.getDatabase(this.dbname);
                System.out.println("Connected to database: " + this.dbname);
            } else {
                System.err.println("MongoClient is not initialized.");
            }
        } catch (MongoException ex) {
            System.err.println("Can't connect to the database: " + ex.getMessage());
        }
    }

    public <T> ArrayList<T> readAllData(String collectionName, Class<T> objectType) {
        ArrayList<T> objectsFound = new ArrayList<>();
        if (isInvalidCollection(collectionName)) {
            return objectsFound;
        }

        try {
            MongoCollection<org.bson.Document> collection = database.getCollection(collectionName);
            FindIterable<org.bson.Document> result = collection.find(new org.bson.Document());
            for (org.bson.Document doc : result) {
                T objectFound = gson.fromJson(doc.toJson(), objectType);
                objectsFound.add(objectFound);
            }
        } catch (MongoException ex) {
            System.err.println("Error retrieving data from collection " + collectionName + " - " + ex.getMessage());
        }
        return objectsFound;
    }

    private boolean isInvalidCollection(String collectionName) {
        if (database == null || collectionName == null || collectionName.isEmpty()) {
            System.err.println("Invalid database connection or collection name.");
            return true;
        }
        return false;
    }

    public void closeConnection() {
        try {
            if (client != null) {
                client.close();
                System.out.println("Connection closed.");
            }
        } catch (MongoException ex) {
            System.err.println("Error closing connection: " + ex.getMessage());
        }
    }

}
