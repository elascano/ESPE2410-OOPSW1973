package ec.espe.edu.contactbook.controller;

import ec.espe.edu.contactbook.model.Contact;
import java.util.ArrayList;
import java.util.Calendar;
import utils.MongoManager;


/**
 *
 * @author David Cuichan
 */
public class ContactController {
    public boolean add(Contact contact){
        boolean added = false;
        if(MongoManager.add(contact)){
            added = true;
        }
        return added;
    }
    
    public static Object find(String findString){
        ArrayList<String> favoriteSports = new ArrayList<>();
        favoriteSports.add("Chess");
        Calendar dateOfBirth = Calendar.getInstance();
        dateOfBirth.set(2002, 11, 22);
        
        Object object = new Contact(3, "Benja", 'M', "Male", "Single", dateOfBirth, favoriteSports, "He has a kid");
        if(findString.equals("1")){
            return object;
        }
        return object;
    }
}
