
package ec.ed.espe.farm.model;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author G406
 */
public class Donkey extends FarmAnimal {
    private float  loadWeight;

    public Donkey(float loadWeight, int id, String bread, Date bornOnDate, ArrayList<FoodType> foodTypes) {
        super(id, bread, bornOnDate, foodTypes);
        this.loadWeight = loadWeight;
    }

    @Override
    public String toString() {
        return "Donkey{" + super.toString() + "loadWeight=" + loadWeight + '}';
    }
    
    
    
    public void load(String origin, String destination){
        System.out.println("this donkey is loading " + getLoadWeight() + "from " + origin + "to" + destination);
    }

    @Override
    public FoodType feed() {
        System.out.println("Feeding a donkey ");
        return new FoodType();
    }

    @Override
    public Product produce() {
        System.out.println(" the doinkey is loading ");
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
