package ec.edu.espe.farm.model;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Andrés Espinosa
 */
public class Donkey extends FarmAnimal{

    private float loadWeight;

    public Donkey(float loadWeight, int id, String breed, Date bornOnDate, ArrayList<FoodType> foodType) {
        super(id, breed, bornOnDate, foodType);
        this.loadWeight = loadWeight;
    }

    @Override
    public String toString() {
        return "Donkey{" + "loadWeight=" + loadWeight + '}' + super.toString();
    }
    
    public void load(String origin, String destination){
        System.out.println("Donkey is loading " + getLoadWeight() + "From" + origin + "to" + destination );
    }

    @Override
    public FoodType feed() {
        System.out.println("Feeding a donkey");
        FoodType foodType = new FoodType();
        return foodType;
    }

    @Override
    public Product product() {
        System.out.println("THe donkey is loading");
        Product product = new Product("Load");
        return product;
    }

    @Override
    public float computeCostOfFood() {
        System.out.println("Computing");
        return 5.0F;
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
