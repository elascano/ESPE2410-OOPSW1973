package ec.edu.espe.contactbook.controller;

import ec.edu.espe.contactbook.model.Contact;
import java.util.ArrayList;
import java.util.Calendar;
import utils.MongoDbManager;

/**
 *
 * @author Dennis Paucar
 */
public class ContactController {
    public boolean add(Contact contact){
        boolean added = false;
     
            if(MongoDbManager.add(contact)){
                added = true;
            }
            return  added;
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
