package ec.edu.espe.contactbook.controller;

import ec.edu.espe.contactbook.model.Register;
import utils.MongoDbManager;

/**
 *
 * @author Alexander Maza
 */
public class RegisterController {
 
    public boolean add(Register contact) {
          boolean added = false;
          if(MongoDbManager.add(contact)){
              added = true;
          }
          return added;
    }
    public Object find(String findString){
     
        Object object = new Register(3, "Alexander", "man", "hello", "*****");
        if(findString.equals("1")){
            return object;
        }
        return object;
    }
}
