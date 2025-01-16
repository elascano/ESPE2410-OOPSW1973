package ec.espe.edu.farm.model;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author LABS-DCCO
 */
public class Donkey extends FarmAnimal{
    private float loadWeight;

    public Donkey(float loadWeight, int id, String breed, Date bornOnDate, ArrayList<FoodType> FoodTypes) {
        super(id, breed, bornOnDate, FoodTypes);
        this.loadWeight = loadWeight;
    }

    @Override
    public String toString() {
        return "Donkey{" + "loadWeight=" + loadWeight + '}';
    }
    
    public void load(String origin, String destination){
        System.out.println("The donkey is loading " + getLoadWeight() + " from " + origin + " is " + destination);
    }

    @Override
    public FoodType food() {
        System.out.println("Feeding a donkey");
        return new FoodType();
    }

    @Override
    public Product produce() {
       return produce();
    }

    @Override
    public float computeCostOfFood() {
        return 0;
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
