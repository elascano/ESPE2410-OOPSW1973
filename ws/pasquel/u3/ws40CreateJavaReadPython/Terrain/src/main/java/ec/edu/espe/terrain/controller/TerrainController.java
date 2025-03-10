package ec.edu.espe.terrain.controller;

import ec.edu.espe.terrain.model.Terrain;
import ec.edu.espe.terrain.utils.MongoDBConnection;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.model.Filters;
import org.bson.Document;

public class TerrainController {
    private final MongoCollection<Document> collection;

    public TerrainController() {
        this.collection = MongoDBConnection.getInstance().getDatabase().getCollection("terrain");
    }

    public void createAndSaveTerrain(int id, int squareMeters) {
        Terrain terrain = new Terrain(id, squareMeters);
        saveTerrain(terrain);
    }

    private void saveTerrain(Terrain terrain) {
        Document doc = new Document("id", terrain.getId())
                .append("squareMeters", terrain.getSquareMeters())
                .append("totalPrice", terrain.getTotalPrice());

        collection.insertOne(doc);
    }

    public Terrain getTerrainById(int id) {
        Document doc = collection.find(Filters.eq("id", id)).first();

        if (doc != null) {
            int squareMeters = doc.getInteger("squareMeters");
            return new Terrain(id, squareMeters);
        }
        return null;
    }
}
