

package ec.edu.espe.contactsbook.controller;

import ec.edu.espe.contactsbook.model.Contact;
import java.util.ArrayList;
import java.util.Calendar;
import utils.MongoDbManager;

/**
 *
 * @author Lucas Gongora
 */
public class ContactController {
    MongoDbManager mongoDbManager;

    public ContactController() {
        mongoDbManager=new MongoDbManager("OOP");
        mongoDbManager.connectDB();
    }
    
    
    public boolean add(Contact contact){
        boolean  added = false;
        if (mongoDbManager.insertData("students", contact)){
            added = true;
        }
        return added;
    }
    public Object find(String findString){
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
    
    public ArrayList<Contact> getContacts(){
        return mongoDbManager.readAllData("students");
    }
    
   public ArrayList<String> getHeaders(){
       ArrayList<String> headers =  new ArrayList<>();
       for (Contact contact:this.getContacts()){
           headers.add(contact.getClass().getName());
                   
       }
       return headers;
   }
    
}
