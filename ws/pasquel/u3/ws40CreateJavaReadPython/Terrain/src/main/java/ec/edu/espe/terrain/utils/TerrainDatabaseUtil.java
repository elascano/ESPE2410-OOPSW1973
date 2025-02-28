package ec.edu.espe.terrain.utils;

import ec.edu.espe.terrain.model.Terrain;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.model.Filters;
import org.bson.Document;

public class TerrainDatabaseUtil {

    public static void saveTerrain(Terrain terrain) {
        MongoCollection<Document> collection = MongoDBConnection.getTerrainCollection();

        Document doc = new Document("id", terrain.getId())
                .append("squareMeters", terrain.getSquareMeters())
                .append("totalPrice", terrain.getTotalPrice());

        collection.insertOne(doc);
    }
    
    public static Terrain getTerrainById(int id) {
        MongoCollection<Document> collection = MongoDBConnection.getTerrainCollection();

        Document doc = collection.find(Filters.eq("id", id)).first();

        if (doc != null) {
            int squareMeters = doc.getInteger("squareMeters");
            float totalPrice = doc.getDouble("totalPrice").floatValue();  
            return new Terrain(id, squareMeters, totalPrice);
        }
        return null;
    }
}

