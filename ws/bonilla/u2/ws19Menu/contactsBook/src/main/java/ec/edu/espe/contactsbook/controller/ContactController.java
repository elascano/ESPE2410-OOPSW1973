

package ec.edu.espe.contactsbook.controller;

import ec.edu.espe.contactsbook.model.Contact;
import java.util.ArrayList;
import java.util.Calendar;
import utils.MongoDbManager;

/**
 *
 * @author Robinson Bonilla
 */
public class ContactController {
    public boolean add(Contact contact){
        boolean  added = false;
        if (MongoDbManager.add(contact)){
            added = true;
        }
        return added;
    }
    public Object find(String findString){
        ArrayList<String> favoriteSports = new ArrayList<>();
        favoriteSports.add("Chess");
        Calendar dateOfBirth = Calendar.getInstance();
        dateOfBirth.set(2002, 1, 2);
        
        Object object = new Contact(3, "Robinson", 'f', "man", "single", dateOfBirth, favoriteSports, "He has a kid");
        if (findString.equals("1")){
            return object;
            
            
        }
        return null;
    }
    
}
