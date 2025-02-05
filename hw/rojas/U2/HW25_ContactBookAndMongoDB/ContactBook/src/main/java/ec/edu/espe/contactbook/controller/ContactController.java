package ec.edu.espe.contactbook.controller;

import ec.edu.espe.contactbook.model.Contact;
import java.util.ArrayList;
import utils.MongoDbManager;

/**
 *
 * @author G406
 */
public class ContactController {
    
    public boolean add(Contact contact){
        boolean added=false;
            if(MongoDbManager.add(contact)){
                added = true;
            }
                return added;
    }
    
    /*public Object find(String findString){
        ArrayList<String>favoriteSports = new ArrayList<>();
        favoriteSports.add("Basketball");
        Object object = new Contact(3, "Matias", 'm', "man", "single",dateOfBirth, favoriteSports, "he has a kid");
        if(findString.equals("1")){
            return object;
        }
        return object;*/
    }

