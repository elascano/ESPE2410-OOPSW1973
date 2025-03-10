package ec.edu.espe.farm.model;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Dennis Paucar
 */
public abstract class FarmAnimal {
    int id;
    String breed;
    Date bornOnDate;
    ArrayList<FoodType> foodTypes;
    
    
    public int getAgeInMonths(){
        //compute age based o current date and born on date
        return 0;
    }
    
    public abstract FoodType feed();
    public abstract Product produce();  
    public abstract float computeCostOfFood();
}