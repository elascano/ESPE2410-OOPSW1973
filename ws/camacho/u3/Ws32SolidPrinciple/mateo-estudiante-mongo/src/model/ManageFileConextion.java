package model;

import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.client.MongoDatabase;


public class ManageFileConextion {
 
    private static MongoClient mongoClient;
    private static MongoDatabase database;
    
    private ManageFileConextion() {}
    
    public static MongoDatabase getConexion() {
        if (mongoClient == null) {
            
            String uri = "mongodb+srv://0000mama:0000mama@cluster0.0nmcc.mongodb.net/";

            MongoClientURI clientUri = new MongoClientURI(uri);
            mongoClient = new MongoClient(clientUri);

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
