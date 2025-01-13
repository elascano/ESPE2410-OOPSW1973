package ec.edu.espe.contactbook.controller;
import ec.edu.espe.contactbook.model.Contact;
import ec.edu.espe.contactbook.view.MongoDbManager;
import java.util.ArrayList;
import java.util.Calendar;

/**
 *
 * @author Alexander Maza 
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
        
        ArrayList<String>favoriteSports = new ArrayList<>();
        favoriteSports.add("Chess");
        Calendar dateOfBirth =  Calendar.getInstance();
        dateOfBirth.set(Calendar.YEAR,2000);
        dateOfBirth.set(Calendar.MONTH,12);
        dateOfBirth.set(Calendar.DAY_OF_MONTH,30);
        
        Object object = new Contact(3, "Alexander", 'm', "man", "single", dateOfBirth, "soccer", "Hellow");
                if(findString.equals("1")){
        return object;
    }
        return object;
    }
    
}
