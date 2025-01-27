package ec.edu.espe.model;

import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;


/**
 *
 * @author Andres Sandoval
 */
public class MongoControl {

    private MongoDatabase database;

    public MongoControl(String connectionString, String dbName) {
        var mongoClient = MongoClients.create(connectionString);
        database = mongoClient.getDatabase(dbName);
    }

    public void insertData(int id, String name, int nrc, String subject) {
        MongoCollection<Document> collection = database.getCollection("HW");
        Document doc = new Document("id", id)
                        .append("name", name)
                        .append("nrc", nrc)
                        .append("subject", subject);
        collection.insertOne(doc);
    }
    
    public void searchData(int id){
        MongoCollection<Document> collection = database.getCollection("HW");
        Document query = new Document("id", id);
        FindIterable<Document> results = collection.find(query);
        
       for (Document doc : results){
           System.out.println(doc.toJson());
       }
        
    }
    
     public void deleteDatas(int id){
           MongoCollection<Document> collection = database.getCollection("HW");
           Document query = new Document ("id", id);
           collection.deleteOne(query);
           System.out.println("Delete Date for "+ id);
       }   
}

