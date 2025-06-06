
package ec.edu.espe.farm.model;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Esteban Quiroga 
 */
public class Donkey extends FarmAnimal{
    private float loadWeight;
    
    public void load(String origin, String destiny){
        System.out.println("This donkey is loading "+getLoadWeight() + " from " + origin + " to " + destiny);
    }

    public Donkey(float loadWeight, int id, String breed, Date bornOnDate, ArrayList<FoodType> foodTypes) {
        super(id, breed, bornOnDate, foodTypes);
        this.loadWeight = loadWeight;
    }

    @Override
    public String toString() {
        return "Donkey{" + "loadWeight=" + getLoadWeight() + '}';
    }
    

    @Override
    public FoodType feed() {
        System.out.println("feeding donkey");
        return new FoodType();
    }

    @Override
    public Product produce() {
        System.out.println("the donkey is loading");
        return new Product("loading for the mines");
    }

    @Override
    public float computeCostOfFood() {
        return 0.2F;
    }

    /**
     * @return the loadWeight
     */
    public float getLoadWeight() {
        return loadWeight;
    }

    /**
     * @param loadWeight the loadWeight to set
     */
    public void setLoadWeight(float loadWeight) {
        this.loadWeight = loadWeight;
    }
    
}
