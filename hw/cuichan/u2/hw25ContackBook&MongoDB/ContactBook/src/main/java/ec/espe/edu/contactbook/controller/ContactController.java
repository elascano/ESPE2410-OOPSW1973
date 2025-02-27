package ec.espe.edu.contactbook.controller;

import ec.espe.edu.contactbook.model.Contact;
import org.bson.Document;
import utils.MongoDBManager;
import java.util.Calendar;
import java.util.ArrayList;

/**
 *
 * @author David Cuichan
 */
public class ContactController {
    
    public boolean add(Contact contact) {
        return MongoDBManager.insertContact(
            contact.getId(),
            contact.getName(),
            contact.getSex(),
            contact.getGender(),
            contact.getMaritalStatus(),
            contact.getDateOfBirth(),
            contact.getFavoriteSports(),
            contact.getComments()
        );
    }
    
    public static Contact find(String id) {
        Document doc = MongoDBManager.findContact(id);
        if (doc != null) {
            Contact contact = new Contact();
            contact.setId(doc.getInteger("_id"));
            contact.setName(doc.getString("name"));
            contact.setSex(doc.getString("sex").charAt(0));
            contact.setGender(doc.getString("gender"));
            contact.setMaritalStatus(doc.getString("maritalStatus"));
            
            Calendar cal = Calendar.getInstance();
            cal.setTime(doc.getDate("dateOfBirth"));
            contact.setDateOfBirth(cal);
            
            ArrayList<String> sports = (ArrayList<String>) doc.get("favoriteSports");
            contact.setFavoriteSports(sports);
            
            contact.setComments(doc.getString("comments"));
            return contact;
        }
        return null;
    }
    
    public static boolean delete(String id) {
        return MongoDBManager.deleteContact(id);
    }
}