package ec.edu.espe.farm.model;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Brandon Pazmino
 */
public abstract class FarmAnimal {
    int id;
    String breed;
    Date bonrOnDate;
    ArrayList<FoodType> foodTypes;
    
    public int getAgeInMonths(){
        //compute age based on 0 currrent
        return 0;
    }
    
    public abstract FoodType feed();
    public abstract Product produce();
    public abstract float computeCostOfFeed();
    
    
    

}
