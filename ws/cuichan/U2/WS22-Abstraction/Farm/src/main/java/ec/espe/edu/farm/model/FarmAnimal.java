package ec.espe.edu.farm.model;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author David Cuichan
 */
public abstract class FarmAnimal {
    int id;
    String breed;
    Date bornOnDate;
    ArrayList<FoodType> FoodTypes;
    
    public int getAgeInMonths(){
        return 0;
    }
    
    public abstract FoodType food();
    public abstract Product product();
    public abstract float computeCostOfFood();
    
}
