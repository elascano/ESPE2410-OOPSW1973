package utils;

import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;
import ec.edu.espe.contactbook.model.Contact;
import ec.edu.espe.contactbook.model.MongoConnection;
import java.util.Date;

/**
 *
 * @author Brandon Pazmino
 */
public class MongoDbManager {

    public static MongoCollection<Document> connect() {
  
        MongoDatabase database = new MongoConnection().createConnection().getDatabase("OOP");
        return database.getCollection("CONTACTSBOOK");
    }
    public static boolean add(Object object) {
        MongoCollection<Document> collection = connect(); 
        boolean saved = false;

        try {
            if (object instanceof Contact) {
                Contact contact = (Contact) object;
                
              
                long birthDate = contact.getDateOfBirth().getTime(); 
                
              
                Document doc = new Document("id", contact.getId())
                        .append("name", contact.getName())
                        .append("sex", contact.getSex())
                        .append("birthdate", birthDate) 
                        .append("favoriteSports", contact.getFavoriteSport())
                        .append("comments", contact.getComments()); 
                collection.insertOne(doc);
                saved = true;
            }
        } catch (Exception ex) {
            System.out.println("Error al guardar el contacto: " + ex.getMessage());
            saved = false;
        }

        return saved;
    }
}
