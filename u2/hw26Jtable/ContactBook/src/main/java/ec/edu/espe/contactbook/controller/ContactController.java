

package ec.edu.espe.contactbook.controller;

import ec.edu.espe.contactbook.model.Contact;
import java.util.ArrayList;
import java.util.Calendar;
import utils.MongoDbManager;

/**
 *
 * @author Robinson Bonilla
 */
public class ContactController {
    public ContactController() {
        String uri = "mongodb+srv://rchapigo:clave12345@cluster0.0etpp.mongodb.net/";
        MongoDbManager.connect(uri);
    }
    
    public Object find(String findString) {
        return MongoDbManager.find(findString);
    }
    
    public boolean add(Contact contact){
        boolean added = false;
        if (MongoDbManager.add(contact)){
            added = true;
        }
        return added;
    }
    
    public ArrayList<Contact> getAllContacts() {
        return MongoDbManager.getAllContacts();
    }
    
    public ArrayList<Integer> getAllContactIds() {
        return MongoDbManager.getAllContactIds();
    }
}