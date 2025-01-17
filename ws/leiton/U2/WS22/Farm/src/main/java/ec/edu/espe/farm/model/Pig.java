package ec.edu.espe.farm.model;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Jose Leiton
 */
public class Pig extends FarmAnimal{
    private boolean isProducingMear;
    private float weight;

    public Pig(boolean isProducingMear, float weight, int id, String breed, Date bornOnDate, ArrayList<FoodType> foodTypes) {
        super(id, breed, bornOnDate, foodTypes);
        this.isProducingMear = isProducingMear;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Pig{" + "isProducingMear=" + isProducingMear + ", weight=" + weight + "}, {" + super.toString() + '}';
    }
    
    
    
    @Override
    public FoodType feed() {
        //TODO feed the animal
        System.out.println("Feeding the pig with my food");
        System.out.println("Feeding the pig with plantains");
    
        return new FoodType();
    
    }

    @Override
    public Product produce() {
        Product product;
        product = new Product("legs");
        System.out.println("PIG is producing "+ product);
        return product;
    }

    @Override
    public float computeCostOfFood() {
        System.out.println("Compute the cost of PIG food");
        return 0.1F;
    }

    /**
     * @return the isProducingMear
     */
    public boolean isIsProducingMear() {
        return isProducingMear;
    }

    /**
     * @param isProducingMear the isProducingMear to set
     */
    public void setIsProducingMear(boolean isProducingMear) {
        this.isProducingMear = isProducingMear;
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
