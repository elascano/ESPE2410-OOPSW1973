package ec.edu.espe.farm.model;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Andrés Sandoval
 */
public class Pig extends FarmAnimal{
    private boolean isProducingMeet;
    private float weight;

    public Pig(boolean isProducingMeet, float weight, int id, String breed, Date bornOnDate, ArrayList<FoodType> foodTypes) {
        super(id, breed, bornOnDate, foodTypes);
        this.isProducingMeet = isProducingMeet;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Pig{" + "isProducingMeet=" + isProducingMeet + 
                ", weight=" + weight + "}, {" + super.toString()+ '}';
    }
    
    

    @Override
    public FoodType feed() {
        //TODO feed the Pig
        System.out.println("Feeding the PIG with my food");
        System.out.println("Feeding the Pig with plantains");
        
        return new FoodType();
    }

    @Override
    public Product produce() {
        Product product;
        product = new Product("Legs");
        System.out.println("PIG is producing"+ product);
        return product;
    }

    @Override
    public float ComputeCostOfFood() {
        System.out.println("Computing the cost of PIG produces");
        return 0.1F;
    }

    /**
     * @return the isProducingMeet
     */
    public boolean isIsProducingMeet() {
        return isProducingMeet;
    }

    /**
     * @param isProducingMeet the isProducingMeet to set
     */
    public void setIsProducingMeet(boolean isProducingMeet) {
        this.isProducingMeet = isProducingMeet;
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
