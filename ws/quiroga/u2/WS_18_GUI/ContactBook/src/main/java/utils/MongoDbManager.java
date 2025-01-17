
package utils;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import static java.lang.System.out;
import org.bson.Document;
import com.google.gson.Gson;


/**
 *
 * @author Esteban Quiroga 
 */
public class MongoDbManager {

    private static final String connectionString = "mongodb+srv://equiroga:equiroga@cluster0.ioba4.mongodb.net/?retryWrites=true&w=majority&appName=Cluster0";
    private static final String databaseName = "oop";
    private static MongoDatabase database;
    
    public static void connect(){
        try {
            MongoClient mongoClient = MongoClients.create(connectionString);
            database = mongoClient.getDatabase(databaseName);

            System.out.println("Succesfull connection to the database: " + database.getName());
        } catch (Exception e) {
            System.err.println("Can not connect to the database: " + e.getMessage());
        }
    }
    
    public MongoDbManager(){
        connect();
    }

    public static boolean add(Object object) {
        
        //TODO add any object to the database
        String collectionName = null;
        boolean saved = false;
        try {
            collectionName = object.getClass().toString();
            System.out.println("saving -->" + collectionName + "<--" + object);
            //TODO implement the saving data for any object.
            
            MongoDbManager mongoManager = new MongoDbManager();
            
            MongoCollection<Document> collection = database.getCollection(collectionName);
            Gson gson = new Gson();
            String json = gson.toJson(object);
            Document document = Document.parse(json);
            
            collection.insertOne(document);

            System.out.println("Object saved succesfully");
            
            saved = true;
        } catch (Exception ex) {
            System.out.println("error saving " + collectionName + "");
            saved = false;
        }
        return saved;
    }
}
