package ec.edu.espe.basicopetration.controller;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;
import ec.edu.espe.basicopetration.model.Color;
import java.util.ArrayList;
import java.util.List;
import org.bson.Document;

/**
 *
 * @author David Cuichan
 */
public class MongoDBManager {
    private static MongoDBManager instance;
    MongoClient client;
    MongoDatabase database;
    MongoCollection<Document> collection;
    String uri = "mongodb+srv://HectorD:hTCvkRkfhXROZMYN@clusterdb.to0oy.mongodb.net/?retryWrites=true&w=majority&appName=ClusterDB";

    private MongoDBManager() {
        client = MongoClients.create(uri);
        database = client.getDatabase("CondorCompany");
        collection = database.getCollection("Colors");
    }
    
    public static synchronized MongoDBManager getInstance() {
        if (instance == null) {
            instance = new MongoDBManager();
        }
        return instance;
    }
    
    public void addColor(Color color) {
        collection.insertOne(color.toDocument());
    }
    
    public List<Color> getAllColors() {
        List<Color> colors = new ArrayList<>();
        collection.find().forEach(doc -> colors.add(new Color(doc)));
        return colors;
    }
    
    public Color getColorById(String colorId) {
        Document doc = collection.find(Filters.eq("colorId", colorId)).first();
        return doc != null ? new Color(doc) : null;
    }

    public void deleteColor(String colorId) {
        collection.deleteOne(Filters.eq("colorId", colorId));
    }

    public void updateColor(Color color) {
        collection.updateOne(
                Filters.eq("colorId", color.getColorId()),
                new Document("$set", color.toDocument())
        );
    }

    public void close() {
        if (client != null) {
            client.close();
        }
    }
    
    
}
