package model;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoDatabase;

public class ManageFileConnection {
 
    private static MongoClient mongoClient;
    private static MongoDatabase database;
    
    private ManageFileConnection() {}
    
    public static MongoDatabase getConexion() {
        if (mongoClient == null) {
            String uri = "mongodb+srv://0000mama:0000mama@cluster0.0nmcc.mongodb.net/?retryWrites=true&w=majority";

            mongoClient = MongoClients.create(uri);
            database = mongoClient.getDatabase("estudiantes");
        }
        return database;
    }

    public static void cerrarConexion() {
        if (mongoClient != null) {
            mongoClient.close();
            mongoClient = null;
            database = null;
        }
    }
}

