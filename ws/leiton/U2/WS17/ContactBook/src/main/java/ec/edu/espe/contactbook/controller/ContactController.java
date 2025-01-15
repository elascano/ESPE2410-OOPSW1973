package ec.edu.espe.contactbook.controller;

import ec.edu.espe.contactbook.model.Contact;
import java.util.ArrayList;
import java.util.Calendar;
import utils.MongoDbManager;

/**
 *
 * @author Jose Leiton
 */
public class ContactController {
    public boolean add(Contact contact){
        boolean added = false;
        
            if(MongoDbManager.add(contact)){
                added = true;
            }

        return added;

    }

    public Object find(String findString) {
        ArrayList<String> favoriteSports = new ArrayList<>();
        favoriteSports.add("Chess");
        Calendar dateOfBirth = Calendar.getInstance();
        dateOfBirth.set(Calendar.YEAR, 2000);
        dateOfBirth.set(Calendar.MONTH, 03);
        dateOfBirth.set(Calendar.DAY_OF_MONTH, 17);

        Object object = new Contact(3, "Jose Leiton", 'm', "man", "single", dateOfBirth, favoriteSports, findString);
        if (findString.equals("1")) {
            return object;
        }
        return object;
    }
}
