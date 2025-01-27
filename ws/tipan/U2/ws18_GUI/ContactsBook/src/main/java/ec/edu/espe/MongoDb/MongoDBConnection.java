/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.MongoDb;
import com.mongodb.MongoClientSettings;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.MongoCollection;
import org.bson.Document;


/**
 *
 * @author USER
 */
public class MongoDBConnection {
    private static final String CONNECTION_STRING = "mongodb+srv://ltipan:ltipan@cluster0.lacr0.mongodb.net/";
    private static final String DATABASE_NAME = "ContactsBook";
    private static final String COLLECTION_NAME = "Contacts";

    public static MongoDatabase getDatabase() {
        MongoClientSettings settings = MongoClientSettings.builder()
                .applyConnectionString(new com.mongodb.ConnectionString(CONNECTION_STRING))
                .build();
        return MongoClients.create(settings).getDatabase(DATABASE_NAME);
    }

    public static MongoCollection<Document> getCollection() {
        return getDatabase().getCollection(COLLECTION_NAME);
    }
}

