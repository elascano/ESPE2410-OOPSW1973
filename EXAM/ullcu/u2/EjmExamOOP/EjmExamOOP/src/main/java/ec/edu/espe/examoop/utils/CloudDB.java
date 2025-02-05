
package ec.edu.espe.examoop.utils;

import com.mongodb.ConnectionString;
import com.mongodb.MongoClientSettings;
import com.mongodb.MongoException;
import com.mongodb.ServerApi;
import com.mongodb.ServerApiVersion;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;
import static com.mongodb.client.model.Filters.eq;
import com.mongodb.client.result.DeleteResult;
import ec.edu.espe.examoop.model.Facemask;
import java.util.ArrayList;
import java.util.List;
import org.bson.Document;
import org.bson.conversions.Bson;

/**
 *
 * @author Alexander Ullco
 */
public class CloudDB {
    private MongoClient mongoClient;
    private MongoDatabase database;

    public CloudDB() {
        try {
        
            String connectionString = "mongodb+srv://daullcu:daullcu@cluster0.dxj9m.mongodb.net/";
            ConnectionString connString = new ConnectionString(connectionString);

            MongoClientSettings settings = MongoClientSettings.builder()
                    .applyConnectionString(connString)
                    .serverApi(ServerApi.builder().version(ServerApiVersion.V1).build())
                    .build();

            mongoClient = MongoClients.create(settings);
            database = mongoClient.getDatabase("DATABASE");

        } catch (MongoException e) {
            System.err.println("Error initializing MongoDB: " + e.getMessage());
        }
    }


    private MongoCollection<Document> getCollection(String collectionName) {
        return database.getCollection(collectionName);
    }
    public void uploadCustomerData(Facemask customer) {
        MongoCollection<Document> collection = getCollection("customerFacemask");

        Document document = new Document("id", customer.getId())
                .append("material", customer.getMaterial())
                .append("color", customer.getColor())
                .append("size", customer.getSize())
                .append("type", customer.getType());


    try {
        collection.insertOne(document);
        System.out.println("Customer data saved successfully!");
    } catch (MongoException e) {
        System.err.println("Error inserting document: " + e.getMessage());
    }    }
   

    public List<Document> searchCustomerById(String id){
        MongoCollection<Document> collection = getCollection("customerFacemask");

        Document query = new Document("id", id);
        List<Document> results = new ArrayList<>();

        try (MongoCursor<Document> cursor = collection.find(query).iterator()) {
            while (cursor.hasNext()) {
                results.add(cursor.next());
            }
        }

        return results;
    }

    public List<Document> getAllCustomers() {
        MongoCollection<Document> collection = getCollection("customerFacemask");
        List<Document> results = new ArrayList<>();

        try (MongoCursor<Document> cursor = collection.find().iterator()) {
            while (cursor.hasNext()) {
                results.add(cursor.next());
            }
        }

        return results;
    }

    public void updateCustomer(String id, Document updatedData) {
        MongoCollection<Document> collection = getCollection("customerFacemask");
        collection.updateOne(eq("id", id), new Document("$set", updatedData));
    }

    public boolean deleteCustomer(String id) {
        MongoCollection<Document> collection = getCollection("customerFacemask");
        Bson filter = eq("id", id);

        try {
            DeleteResult result = collection.deleteOne(filter);
            return result.getDeletedCount() > 0;
        } catch (MongoException e) {
            e.printStackTrace();
            return false;
        }

    }

    public Document findCustomerByID(String id) {

 MongoCollection<Document> collection = database.getCollection("customerFacemask");
    Document query = new Document("id", id);
    return collection.find(query).first();
    }
}
