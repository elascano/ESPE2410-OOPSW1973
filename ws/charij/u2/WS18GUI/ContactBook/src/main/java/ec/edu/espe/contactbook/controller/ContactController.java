

package ec.edu.espe.contactbook.controller;

import ec.edu.espe.contactbook.model.Contact;
import java.util.ArrayList;
import java.util.Calendar;
import utils.MongoDbManager;

/**
 *
 * @author Sebastian Charij 
 */
public class ContactController {
    
    public boolean add(Contact contact){
        boolean added = false;
        if (MongoDbManager.add(contact)){
            added = true;
        }
        return added;
    }
    public Object find(String findString){
        ArrayList<String> favoriteSports = new ArrayList<>();
        favoriteSports.add("Soccer");
        Calendar dateOfBirth = Calendar.getInstance();
       dateOfBirth.set(Calendar.YEAR,2008 );
       dateOfBirth.set(Calendar.MONTH,22);
       dateOfBirth.set(Calendar.DAY_OF_MONTH,1);
        Object object = new Contact(3, "Mateo", 'm', "man","single", dateOfBirth, favoriteSports, findString);
        if(findString.equals("1")){
            return object;
        }
        return object;
    }
    
}
