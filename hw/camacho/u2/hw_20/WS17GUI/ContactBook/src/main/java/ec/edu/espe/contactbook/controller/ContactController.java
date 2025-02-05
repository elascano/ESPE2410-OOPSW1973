

package ec.edu.espe.contactbook.controller;

import ec.edu.espe.contactbook.model.Contact;
import ec.edu.espe.contactbook.utils.MongoDbManager;

/**
 *
 * @author Alan Arias
 */
public class ContactController {
    public boolean add(Contact contact){
        boolean added = false;
        try{
           if (MongoDbManager.add(contact)){
               added = true;
           } else {
           }
        }catch(Exception ex){
            
        }
        return false;
    }
}
