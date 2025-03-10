package ec.edu.espe.terrain.utils;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoDatabase;

public class MongoDBConnection {
    private static final MongoDBConnection INSTANCE = new MongoDBConnection();
    private MongoClient mongoClient;
    private MongoDatabase database;

    private static final String CONNECTION_STRING = "mongodb+srv://mpasquel:mpasquel@cluster0.be8gs.mongodb.net/";

    private MongoDBConnection() {
        try {
            mongoClient = MongoClients.create(CONNECTION_STRING);
            database = mongoClient.getDatabase("Terrain");
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("Error al conectar con MongoDB", e);
        }
    }

    public static MongoDBConnection getInstance() {
        return INSTANCE;
    }

    public MongoDatabase getDatabase() {
        return database;
    }
}
