package utils;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;

public class MongoClientSingleton {
    private static final String URI = "mongodb+srv://mtopon:mtopon@cluster0.nmg4z.mongodb.net/?retryWrites=true&w=majority&appName=Cluster0";
    private static MongoClient mongoClient = null;

    private MongoClientSingleton() {
        // private constructor to prevent instantiation
    }

    public static MongoClient getInstance() {
        if (mongoClient == null) {
            synchronized (MongoClientSingleton.class) {
                if (mongoClient == null) {
                    mongoClient = MongoClients.create(URI);
                }
            }
        }
        return mongoClient;
    }

    public static void close() {
        if (mongoClient != null) {
            mongoClient.close();
        }
    }
}
