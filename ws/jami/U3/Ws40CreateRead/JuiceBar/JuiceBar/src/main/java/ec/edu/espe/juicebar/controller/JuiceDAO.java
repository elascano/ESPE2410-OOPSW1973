package ec.edu.espe.juicebar.dao;

import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;
import com.mongodb.client.MongoClient;
import ec.edu.espe.juicebar.model.Juice;
import utils.MongoDBManager;

public class JuiceDAO {

    private MongoClient client;

    public void insertJuice(Juice juice) {
        MongoDatabase database = MongoDBManager.getDatabase(); // Obtenemos la base de datos
        MongoCollection<Document> collection = database.getCollection("juices"); // Obtenemos la colección

        // Crear el documento para insertar en MongoDB
        Document doc = new Document("Juice Type", juice.getJuiceType())
                        .append("weight", juice.getWeight());

        // Insertamos el documento en MongoDB
        collection.insertOne(doc);
    }
}
