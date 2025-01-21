
package com.mycompany.farm.model;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author David Pilatasig
 */
public abstract class FarmAnimal {
    int id;
    String breed;
    Date bornOnDate;
    ArrayList<FoodType> foodType;
    
    
    public int getAgeInMonths(){
        //Compute age based on current date and born on date
        return 0;
    }
    
    public abstract FoodType feed();
    public abstract Product produce();
    public abstract float computeCostOfFood();
}
