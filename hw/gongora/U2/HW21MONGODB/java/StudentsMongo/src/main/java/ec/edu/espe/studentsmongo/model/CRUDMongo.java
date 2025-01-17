package ec.edu.espe.studentsmongo.model;

import com.mongodb.client.*;
import com.mongodb.client.result.DeleteResult;
import com.mongodb.client.result.UpdateResult;
import org.bson.Document;
import java.util.*;

/**
 *
 * @author Lucas Gongora
 */ 

public class CRUDMongo {
    private String uri;
    private String dbname;
    private MongoClient client;
    private MongoDatabase database;

    public CRUDMongo(String uri, String dbname) {
        this.uri = uri;
        this.dbname = dbname;
        this.client = MongoClients.create(uri);
    }

    public void connectDB() {
        try {
            this.database = client.getDatabase(this.dbname);
            System.out.println("Connected to database: " + this.dbname);
        } catch (Exception e) {
            System.err.println("Can't connect to the database: " + e);
        }
    }

    public void insertData(String collectionName, Map<String, Object> json) {
        if (database == null) {
            System.err.println("No database connection. Please connect to the database first.");
            return;
        }

        try {
            MongoCollection<Document> collection = database.getCollection(collectionName);
            collection.insertOne(new Document(json));
            System.out.println("Inserted document.");
        } catch (Exception e) {
            System.err.println("Error: Data insertion failed - " + e);
        }
    }

    public void findData(String collectionName, Document query) {
        if (database == null) {
            System.err.println("No database connection. Please connect to the database first.");
            return;
        }

        try {
            MongoCollection<Document> collection = database.getCollection(collectionName);
            FindIterable<Document> result = collection.find(query);
            for (Document doc : result) {
                System.out.println(doc.toJson());
            }
        } catch (Exception e) {
            System.err.println("Error: Data retrieval failed - " + e);
        }
    }

    public void updateData(String collectionName, Document query, Document updateDoc) {
        if (database == null) {
            System.err.println("No database connection. Please connect to the database first.");
            return;
        }

        try {
            MongoCollection<Document> collection = database.getCollection(collectionName);
            UpdateResult result = collection.updateOne(query, new Document("$set", updateDoc));
            if (result.getMatchedCount() == 0) {
                System.out.println("No documents matched the query. No update made.");
            } else {
                System.out.println("Matched and updated documents: " + result.getModifiedCount());
            }
        } catch (Exception e) {
            System.err.println("Error: Data update failed - " + e);
        }
    }

    public void deleteData(String collectionName, Document query) {
        if (database == null) {
            System.err.println("No database connection. Please connect to the database first.");
            return;
        }

        try {
            MongoCollection<Document> collection = database.getCollection(collectionName);
            DeleteResult result = collection.deleteOne(query);
            if (result.getDeletedCount() == 0) {
                System.out.println("No documents matched the query. No deletion made.");
            } else {
                System.out.println("Deleted document count: " + result.getDeletedCount());
            }
        } catch (Exception e) {
            System.err.println("Error: Data deletion failed - " + e);
        }
    }

    public void closeConnection() {
        try {
            client.close();
            System.out.println("Connection closed.");
        } catch (Exception e) {
            System.err.println("Error closing connection: " + e);
        }
    }
}
