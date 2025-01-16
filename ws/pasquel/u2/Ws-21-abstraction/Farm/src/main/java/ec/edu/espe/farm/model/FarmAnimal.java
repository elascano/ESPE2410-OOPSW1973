
package ec.edu.espe.farm.model;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author marlo
 */
public abstract class FarmAnimal {
int id;
String breed;
Date bornOnDate;
ArrayList<FoodType> foodTypes;
public int ageInMonths(){
    //TODO compute age based in current date in months
    return 0;
}
public abstract FoodType feed();
public abstract Product produce();
public abstract float computeCostofFood();

}
