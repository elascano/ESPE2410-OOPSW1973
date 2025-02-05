
package ec.edu.espe.mongoasker.view;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.result.UpdateResult;
import org.bson.Document;




/**
 *
 * @author Esteban Quiroga 
 */
public class MongoAskerApp {
    public static void main(String[] args) {
        
       String uri = "mongodb+srv://equiroga:equiroga@cluster0.ioba4.mongodb.net/?retryWrites=true&w=majority&appName=Cluster0";
        
 
        try (MongoClient mongoClient = MongoClients.create(uri)) {
            
            MongoDatabase database = mongoClient.getDatabase("oop");

            System.out.println("Succesfull connection to the database: " + database.getName());
        } catch (Exception e) {
            System.err.println("Can not connect to the database: " + e.getMessage());
        }
        
        try (MongoClient mongoClient = MongoClients.create(uri)) {
            
            MongoDatabase database = mongoClient.getDatabase("oop");            
           
            MongoCollection<Document> collection = database.getCollection("contacts");
            
            Document filtro = new Document("name", "Esteban");
            
            Document actualizacion = new Document("$set", new Document("name", "Mariana"));
            
            UpdateResult resultado = collection.updateOne(filtro, actualizacion);
            
            System.out.println("Documentos modificados: " + resultado.getModifiedCount());
        } catch (Exception e) {
            System.err.println("Error al actualizar el documento: " + e.getMessage());
        }
        
    }
}
