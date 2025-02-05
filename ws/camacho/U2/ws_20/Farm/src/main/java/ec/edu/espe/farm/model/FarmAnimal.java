package ec.edu.espe.farm.model;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author mateo
 */
public abstract class FarmAnimal {
    int id;
    String bread;
    Date dateOfBirth;
    ArrayList<FoodType> foodType;
    
    public int getAgeInMonths(){
        //compute age on current date
        return 0;
    }
    
    public abstract FoodType feed();
    public abstract Product product();
    public abstract float computeCostOfFood();
}
