
package utils;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;
import com.google.gson.Gson;
import java.util.ArrayList;


/**
 *
 * @author Esteban Quiroga 
 */
public class MongoDbManager {

    private static final String connectionString = "mongodb+srv://equiroga:equiroga@cluster0.ioba4.mongodb.net/?retryWrites=true&w=majority&appName=Cluster0";
    private static final String databaseName = "oop";
    private static MongoDatabase database;
    private static MongoDbManager mongoManager;
    private static Gson gson = new Gson();
    
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
            
            mongoManager = new MongoDbManager();
            
            MongoCollection<Document> collection = database.getCollection(collectionName);
            
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
    
    public static ArrayList<Object> read(Object object){
        String collectionName;
        collectionName = object.getClass().toString();
        try{
            
            mongoManager = new MongoDbManager();
            
            MongoCollection<Document> collection = database.getCollection(collectionName);
            ArrayList<Object> objects = new ArrayList<>();
            
            for(Document document : collection.find()){
                
                String json = document.toJson();
                object = gson.fromJson(json, object.getClass());
                
                objects.add(object);
                return objects;
            }
            
        }catch(Exception ex){
                    System.out.println("error getting" + collectionName + "");
                    }
        return null;
    }
}


