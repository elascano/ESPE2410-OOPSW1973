package ec.edu.espe.contactbook.controller;

import ec.edu.espe.contactbook.model.Contact;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import utils.MongoDbManager;

/**
 *
 * @author Mateo Topon
 */
public class ContactController {
 
    public boolean add(Contact contact) {
          boolean added = false;
          if(MongoDbManager.add(contact)){
              added = true;
          }
          return added;
    }
    public Object find(String findString){
        ArrayList<String>favoriteSport = new ArrayList<>();
        favoriteSport.add("Chess");
        Calendar dateOfBirth = Calendar.getInstance();
        dateOfBirth.set(Calendar.YEAR,2020);
        dateOfBirth.set(Calendar.MONTH,1);
        dateOfBirth.set(Calendar.DAY_OF_MONTH,1);
        Object object = new Contact(3, "Brandon", 'm', "man", "single", dateOfBirth, favoriteSport, "he has a problem");
        if(findString.equals("1")){
            return object;
        }
        return object;
    }
}
