package ec.edu.espe.contactbook.controller;

import ec.edu.espe.contactbook.model.Contact;
import java.util.ArrayList;
import java.util.Calendar;
import org.bson.Document;
import utils.MongoDbManager;

/**
 *
 * @author Dennis Paucar
 */
public class ContactController {
    public boolean add(Contact contact) {
    boolean added = false;
    
    
    Document contactDocument = new Document("id", contact.getId())
            .append("name", contact.getName())
            .append("sex", String.valueOf(contact.getSex()))
            .append("gender", contact.getGender())
            .append("maritalStatus", contact.getMaritalStatus())
            .append("dateOfBirth", contact.getDateOfBirth().getTime()) 
            .append("favoriteSports", contact.getFavoriteSports())
            .append("comments", contact.getComments());
    
    
    if(MongoDbManager.insert("contacts", contactDocument)){
        added = true;
    }
    return added;
}

    
    
    public Object find(String findString){
        ArrayList<String> favoriteSports = new ArrayList<>();
        favoriteSports.add("Chess");
        Calendar dateOfBirth = Calendar.getInstance();
        dateOfBirth.set(Calendar.YEAR, 2000);
        dateOfBirth.set(Calendar.MONTH, 1);
        dateOfBirth.set(Calendar.DAY_OF_MONTH, 1);
        Contact object = new Contact(3, "Dennis", 'm', "man", "single", dateOfBirth, favoriteSports, "He has a kid");
        if(findString.equals("1")){
            return object;
        }
        return object;
    }
    
            
}
