package ec.edu.espe.contactbook.controller;

import ec.edu.espe.contactbook.model.Contact;
import java.util.ArrayList;
import java.util.Calendar;
import org.bson.Document;
import utils.MongoDBManager;

/**
 *
 * @author David Pilatasig
 */
public class ContactController {
    public boolean add(String collectionName, Document contact){
        boolean added= false;
        
        if(MongoDBManager.add(collectionName, contact)){
            added= true;
        }
        return added;
    }
    
    public Object find(String findString){
        ArrayList<String> favoriteSports = new ArrayList<>();
        favoriteSports.add("Chess");
        Calendar dateOfBirth = Calendar.getInstance();
        dateOfBirth.set(Calendar.YEAR, 2005);
        dateOfBirth.set(Calendar.MONTH, 10);
        dateOfBirth.set(Calendar.DAY_OF_MONTH, 26);
        Contact object = new Contact(3, "David Pilatasig", "m", "man", "single", dateOfBirth, favoriteSports, "He has a kid");
        if(findString.equals("1")){
            return object;
        }
        return object;
    }
        
}
