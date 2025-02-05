

package ec.edu.espe.farm.model;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Benjamin Robalino <jabasteam>
 */
public class Donkey extends FarmAnimal {
    private float loadWeight;
    
    public void load(String origin, String destination){
        System.out.println("This Donkey is loading " + getLoadWeight() + "from" + origin + "to" +destination);
    }

    public Donkey(float loadWeight, int id, String breed, Date bornOnDate, ArrayList<FoodType> foodTypes) {
        super(id, breed, bornOnDate, foodTypes);
        this.loadWeight = loadWeight;
    }

    @Override
    public String toString() {
        return "Donkey{" +super.toString() + "loadWeight=" + loadWeight + '}';
    }
    

    @Override
    public FoodType feed() {
        System.out.println("Feeding a Donkey");
        return new FoodType();
    }

    @Override
    public Product produce() {
        System.out.println("The donkey is loading");
        return new Product("loading for the mines");
    }

    @Override
    public float computeCostOfFood() {
        return 0.1F;
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
