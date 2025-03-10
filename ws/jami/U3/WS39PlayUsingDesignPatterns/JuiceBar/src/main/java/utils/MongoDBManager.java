package utils;

import com.mongodb.MongoException;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoDatabase;

/**
 *
 * @author LABS-DCCO
 */
public class MongoDBManager {
    private static final String CONNECTION_STRING = "mongodb+srv://kleverdavid165:POO2025@cluster0.0hjyg.mongodb.net/";
    private static final String DATABASE_NAME = "JuiceBar";

    private static MongoClient mongoClient = null;

    // Método para obtener la base de datos
    public static MongoDatabase getDatabase() {
        if (mongoClient == null) {
            try {
                mongoClient = MongoClients.create(CONNECTION_STRING); // Establece la conexión
                System.out.println("Conexión exitosa a MongoDB");
            } catch (MongoException e) {
                System.err.println("Error al conectar a MongoDB: " + e.getMessage());
                // Lanza la excepción o maneja el error adecuadamente
                throw new RuntimeException("No se pudo conectar a la base de datos", e);
            }
        }
        return mongoClient.getDatabase(DATABASE_NAME);  // Retorna la base de datos
    }
}
