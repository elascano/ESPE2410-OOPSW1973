package ec.edu.espe.mongocrud;

/**
 *
 * @author Robinson Bonilla <jabasteam>
 */
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

public class CRUDOperations {

    private MongoDatabase database;

    // Constructor que recibe la base de datos
    public CRUDOperations(MongoDatabase database) {
        this.database = database;
    }

    // Crear un documento
    public void create(String collectionName, String key, String value) {
        MongoCollection<Document> collection = database.getCollection(collectionName);
        Document document = new Document(key, value);
        collection.insertOne(document);
        System.out.println("Documento insertado con éxito.");
    }

    // Leer un documento
    public void read(String collectionName, String key) {
        MongoCollection<Document> collection = database.getCollection(collectionName);
        Document document = collection.find(new Document(key, new Document("$exists", true))).first();
        if (document != null) {
            System.out.println("Documento encontrado: " + document.toJson());
        } else {
            System.out.println("Documento no encontrado.");
        }
    }

    // Actualizar un documento
    public void update(String collectionName, String key, String newValue) {
        MongoCollection<Document> collection = database.getCollection(collectionName);
        Document query = new Document(key, new Document("$exists", true));
        Document update = new Document("$set", new Document(key, newValue));
        collection.updateOne(query, update);
        System.out.println("Documento actualizado con éxito.");
    }

    // Eliminar un documento
    public void delete(String collectionName, String key) {
        MongoCollection<Document> collection = database.getCollection(collectionName);
        Document query = new Document(key, new Document("$exists", true));
        collection.deleteOne(query);
        System.out.println("Documento eliminado con éxito.");
    }
}
