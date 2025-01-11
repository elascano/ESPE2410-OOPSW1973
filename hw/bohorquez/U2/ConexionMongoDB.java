package com.mycompany.conexionmongodb;
import com.mongodb.client.*;
import com.mongodb.client.model.Updates;
import org.bson.Document;
import com.mongodb.client.result.UpdateResult;

public class ConexionMongoDB {
    public static void main(String[] args) {
        
        
        String uri = "mongodb+srv://camilabohorquez:escontraseña@cluster0.6u5fl.mongodb.net/?retryWrites=true&w=majority&appName=Cluster0";

        
        try (MongoClient mongoClient = MongoClients.create(uri)) {
           
            MongoDatabase database = mongoClient.getDatabase("OOP");
            System.out.println("Conexión exitosa a la base de datos: " + database.getName());
        } catch (Exception e) {
            System.err.println("No se pudo conectar a la base de datos: " + e.getMessage());
        }

      
        try (MongoClient mongoClient = MongoClients.create(uri)) {
            
            MongoDatabase database = mongoClient.getDatabase("OOP");
            MongoCollection<Document> collection = database.getCollection("students");
            
           
            Document filter = new Document("name", "Camila");
            
          
            Document update = new Document("$set", new Document("name", "Naomi"));
            
            
            UpdateResult result = collection.updateOne(filter, update);
            
            
            System.out.println("Documentos modificados: " + result.getModifiedCount());
        } catch (Exception e) {
            System.err.println("Error al actualizar el documento: " + e.getMessage());
        }
    }
}
