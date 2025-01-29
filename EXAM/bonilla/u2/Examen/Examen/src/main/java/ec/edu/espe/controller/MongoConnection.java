package ec.edu.espe.controller;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

public class MongoConnection {

    public static MongoCollection<Document> connect() {
        String url = System.getenv("MONGODB_URL");

        // Asigna una URL de conexión predeterminada si la variable de entorno es nula o está vacía
        if (url == null || url.isEmpty()) {
            url = "mongodb+srv://robinsonchapigo:admin123@cluster0.erb1d.mongodb.net/?retryWrites=true&w=majority&appName=Cluster0";
        }

        MongoClient mongoClient = null;
        MongoCollection<Document> collection = null;

        try {
            mongoClient = MongoClients.create(url);
            MongoDatabase database = mongoClient.getDatabase("examen");
            collection = database.getCollection("cellphones");
        } catch (Exception e) {
            System.err.println("Error conectando a la base de datos: " + e.getMessage());
        }

        return collection;
    }

    public static void main(String[] args) {
        MongoCollection<Document> collection = connect();
        if (collection != null) {
            System.out.println("Conexión exitosa a la colección cellphones.");
        }
    }
}
