package utils;

import com.mongodb.client.*;
import org.bson.Document;
import ec.edu.espe.paidperhourapp.model.Worker;


public class MongoDBManager {
    private static MongoClient mongoClient;
    private static MongoDatabase database;
    private static MongoCollection<Document> collection;

 
    public static void connect(String connectionString, String dbName) {
        mongoClient = MongoClients.create(connectionString);
        database = mongoClient.getDatabase(dbName);
        collection = database.getCollection("Workers"); 
        
        if(collection==null){
            System.out.println("Error al inicializar la DataBase");
        }
        else{
            System.out.println("Conexión realizada");
        }
    }
    
    public static boolean addContact(Worker worker) {
        Document doc = new Document("id", worker.getId())
                .append("name", worker.getName())
                .append("workedHours", worker.getWorkedHours())
                .append("paidPerHour", worker.getPaidPerHour());
        if (collection == null) {
            throw new IllegalStateException("MongoDB collection is not initialized.");
        }

        collection.insertOne(doc);
        return true;
    }



    public static void close() {
        if (mongoClient != null) {
            mongoClient.close();
        }
    }
}

