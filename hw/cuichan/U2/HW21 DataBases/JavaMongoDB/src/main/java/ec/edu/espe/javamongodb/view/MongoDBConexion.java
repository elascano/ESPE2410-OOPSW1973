package ec.edu.espe.javamongodb.view;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

/**
 *
 * @author David Cuichan
 */
class MongoDBConexion {
    private MongoClient mongoClient;
    private MongoDatabase database;
    private MongoCollection<Document> collection;
    
    public void conectar() {
        // Conexión a MongoDB local
        mongoClient = MongoClients.create("mongodb://localhost:27017");
        database = mongoClient.getDatabase("miBaseDeDatos");
        collection = database.getCollection("personas");
    }
    
    public void guardarPersona(Persona persona) {
        Document doc = new Document("nombre", persona.getNombre())
                .append("edad", persona.getEdad())
                .append("ciudad", persona.getCiudad());
        
        collection.insertOne(doc);
    }
    
    public void cerrarConexion() {
        if (mongoClient != null) {
            mongoClient.close();
        }
    }
}
