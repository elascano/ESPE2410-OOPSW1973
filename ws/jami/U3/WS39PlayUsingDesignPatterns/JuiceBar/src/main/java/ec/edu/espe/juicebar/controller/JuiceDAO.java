package ec.edu.espe.juicebar.controller;

import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;
import com.mongodb.client.MongoClient;
import ec.edu.espe.juicebar.model.Juice;

public class JuiceDAO {

    private MongoClient client;
    private MongoDatabase database;

 

    public void insertJuice(Juice juice) {  
        if (database == null) {
            System.out.println("Error: Base de datos no inicializada.");
            return;
        }
        
        MongoCollection<Document> collection = database.getCollection("juices");

        // Crear el documento a insertar en MongoDB
        Document doc = new Document("Juice Type", juice.getJuiceType())
                        .append("weight", juice.getWeight());

        // Insertar el documento
        collection.insertOne(doc);
    }

    public void closeConnection() {
        if (client != null) {
            client.close();
        }
    }
}
