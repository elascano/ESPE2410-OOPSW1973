package ec.edu.espe.contactbook.controller;

import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import ec.edu.espe.contactbook.model.Contact;
import ec.edu.espe.contactbook.model.MongoConnection;
import java.util.ArrayList;
import java.util.Calendar;
import org.bson.Document;
import utils.MongoDbManager;

/**
 *
 * @author Brandon Pazmino
 */
public class ContactController {
 private MongoCollection<Document> collection;

    public ContactController() {
       
        MongoDatabase database = new MongoConnection().createConnection().getDatabase("OOP");
        this.collection = database.getCollection("CONTACTSBOOK");
    }

 
    public boolean add(Contact contact) {
        boolean added = false;
     
        if (MongoDbManager.add(contact)) {
            added = true;
        }
        return added;
    }

    public Object find(String findString) {
     
        ArrayList<String> favoriteSport = new ArrayList<>();
        favoriteSport.add("Chess");
        Calendar dateOfBirth = Calendar.getInstance();
        dateOfBirth.set(Calendar.YEAR, 2020);
        dateOfBirth.set(Calendar.MONTH, 1);
        dateOfBirth.set(Calendar.DAY_OF_MONTH, 1);
        Object object = new Contact(3, "Brandon", 'm', "man", "single", dateOfBirth, favoriteSport, "he has a problem");
        return object;
    }
}
