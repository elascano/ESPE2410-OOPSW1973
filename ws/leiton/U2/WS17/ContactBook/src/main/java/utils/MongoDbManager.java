package utils;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

/**
 *
 * @author Jose Leiton
 */
public class MongoDbManager {

    private static MongoClient mongoClient;
    private static MongoDatabase database;

    // Conectar a la base de datos MongoDB
    public static void connect(String connectionString) {
        try {
            mongoClient = MongoClients.create(connectionString);
            database = mongoClient.getDatabase("OOP"); // Nombre de la base de datos
            System.out.println("Connected to MongoDB database: OOP");
        } catch (Exception e) {
            System.out.println("Error connecting to MongoDB: " + e.getMessage());
        }
    }

    // Agregar un objeto a la colección contactBook
    public static boolean add(Object object) {
        String collectionName = "contactBook"; // Nombre de la colección
        boolean saved = false;

        try {
            MongoCollection<Document> collection = database.getCollection(collectionName);

            // Convertir el objeto a un documento BSON
            Document document = new Document();
            document.append("className", object.getClass().getCanonicalName());
            document.append("data", object.toString()); // Simplificación para guardar como string

            // Insertar el documento en la colección
            collection.insertOne(document);
            System.out.println("SAVED --> " + collectionName + " <-- " + document.toJson());
            saved = true;
        } catch (Exception ex) {
            System.out.println("Error saving to collection " + collectionName + ": " + ex.getMessage());
            saved = false;
        }
        return saved;
    }
}

