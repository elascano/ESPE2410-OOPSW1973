
package ec.edu.espe.resistor.controller;

import ec.edu.espe.resistor.model.Resistor;
import utils.MongoDbManager;

/**
 *
 * @author Lucas Gongora
 */
public class ResistorController {
    public static MongoDbManager mongoDbManager = new MongoDbManager("WS");
    
    public static void add(String id, String description, float value, float tolerance){
       Resistor resistor;
       resistor = new Resistor(id, description, value, tolerance);
       mongoDbManager.insertData("resistors",resistor);
       
    }
    
    
    
    
    
    
}
