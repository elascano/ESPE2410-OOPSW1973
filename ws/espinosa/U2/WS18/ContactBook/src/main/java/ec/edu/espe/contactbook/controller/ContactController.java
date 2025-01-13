package ec.edu.espe.contactbook.controller;

import Utils.MongoDBManager;
import ec.edu.espe.contactbook.model.Contact;
import java.util.ArrayList;
import java.util.Calendar;

/**
 *
 * @author Andrés Espinosa
 */
public class ContactController {
    public boolean add(Contact contact){
        boolean  added = false;
        if (MongoDBManager.add(contact)){
            added = true;
        }
        return added;
    }
    public static Object find(String findString){
        ArrayList<String> favoriteSports = new ArrayList<>();
        favoriteSports.add("Chess");
        Calendar dateOfBirth = Calendar.getInstance();
        dateOfBirth.set(2002, 1, 2);
        
        Object object = new Contact(3, "Benjamin", 'f', "man", "single", dateOfBirth, favoriteSports, "He has a kid");
        if (findString.equals("1")){
            return object;
            
            
        }
        return null;
    }
}
