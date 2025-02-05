package ec.edu.espe.farm.model;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Andrés Espinosa
 */
public class Pig extends FarmAnimal{
    private boolean isProducingMeat;
    private float weight;

    public Pig(boolean isProducingMeat, float weight, int id, String breed, Date bornOnDate, ArrayList<FoodType> foodType) {
        super(id, breed, bornOnDate, foodType);
        this.isProducingMeat = isProducingMeat;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Pig{" + "isProducingMeat=" + isProducingMeat + ", weight=" + weight + '}'+ super.toString();
    }
    
    

    @Override
    public FoodType feed() {
        //TODO
        System.out.println("feeding the pig");
        System.out.println("feeding the pig with plantains");
        
        return new FoodType();
    }

    @Override
    public Product product() {
        //TODO
        Product product;
        product = new Product("legs");
        System.out.println("Pig is producing");
        return product;
    }

    @Override
    public float computeCostOfFood() {
        //TODO
        System.out.println("THe price of cost of the pig is --> 77.7");
        return 77.7F;
    }

    /**
     * @return the isProducingMeat
     */
    public boolean isIsProducingMeat() {
        return isProducingMeat;
    }

    /**
     * @param isProducingMeat the isProducingMeat to set
     */
    public void setIsProducingMeat(boolean isProducingMeat) {
        this.isProducingMeat = isProducingMeat;
    }

    /**
     * @return the weight
     */
    public float getWeight() {
        return weight;
    }

    /**
     * @param weight the weight to set
     */
    public void setWeight(float weight) {
        this.weight = weight;
    }
    
    

}
