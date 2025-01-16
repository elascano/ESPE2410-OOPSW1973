package utils;
import com.google.gson.Gson;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;
import org.bson.Document;
import org.bson.types.ObjectId;

/**
 *
 * @author Camila Bohorquez
 */
public class MongoDBManager {
    private static final String CONNECTION_STRING = "mongodb+srv://camilabohorquez:camilabohorquez@cluster0.6u5fl.mongodb.net/?retryWrites=true&w=majority&appName=Cluster0";
    private static final String DATABASE_NAME = "students"; 
    private static MongoClient mongoClient = null;
    
    public static void connect() {
        try {
            mongoClient = MongoClients.create(CONNECTION_STRING);
            System.out.println("Successful connection to MongoDB");
        } catch (Exception e) {
            System.err.println("Error connecting to MongoDB: " + e.getMessage());
        }
    }
    
    
    public static boolean add(Object object) {
        if (mongoClient == null) {
            connect();
        }
        
        boolean saved = false;
        String collectionName = object.getClass().getSimpleName(); 
        try {
            
            MongoDatabase database = mongoClient.getDatabase(DATABASE_NAME);
            MongoCollection<Document> collection = database.getCollection(collectionName);

            
            Gson gson = new Gson();
            String json = gson.toJson(object);
            Document document = Document.parse(json);

            
            collection.insertOne(document);
            System.out.println("Object saved in the collection: " + collectionName);
            saved = true;
        } catch (Exception e) {
            System.err.println("Error saving object:" + e.getMessage());
        }
        return saved;
    }

  
    public static <T> T find(String id, Class<T> clazz) {
        if (mongoClient == null) {
            connect();
        }

        T foundObject = null;
        try {
            
            MongoDatabase database = mongoClient.getDatabase(DATABASE_NAME);
            MongoCollection<Document> collection = database.getCollection(clazz.getSimpleName());

          
            ObjectId objectId = new ObjectId(id); 
            Document document = collection.find(Filters.eq("_id", objectId)).first();

            
            if (document != null) {
                Gson gson = new Gson();
                foundObject = gson.fromJson(document.toJson(), clazz);
            }

        } catch (Exception e) {
            System.err.println("Error searching for object: " + e.getMessage());
        }
        return foundObject;
    }

    
    public static boolean delete(Object object) {
        if (mongoClient == null) {
            connect();
        }

        boolean deleted = false;
        try {
           
            MongoDatabase database = mongoClient.getDatabase(DATABASE_NAME);
            MongoCollection<Document> collection = database.getCollection(object.getClass().getSimpleName());

            
            ObjectId objectId = new ObjectId(object.toString()); 
            
            
            collection.deleteOne(Filters.eq("_id", objectId));
            System.out.println("Object removed.");
            deleted = true;
        } catch (Exception e) {
            System.err.println("Error deleting object: " + e.getMessage());
        }
        return deleted;
    }
}
