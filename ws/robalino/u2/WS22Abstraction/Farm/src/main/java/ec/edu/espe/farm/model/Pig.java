

package ec.edu.espe.farm.model;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Benjamin Robalino <jabasteam>
 */
public class Pig extends FarmAnimal{
    private boolean isProducingMeat;
    private float weight;

    @Override
    public String toString() {
        return "Pig{" +super.toString() + "isProducingMeat=" + isProducingMeat + ", weight=" + weight + '}';
    }

  
    public Pig(boolean isProducingMeat, float weight, int id, String breed, Date bornOnDate, ArrayList<FoodType> foodTypes) {
        super(id, breed, bornOnDate, foodTypes);
        this.isProducingMeat = isProducingMeat;
        this.weight = weight;
    }
   
    @Override
    public FoodType feed() {
        //TODO Feed Animal
        System.out.println("Feeding thePIG with my food");
        System.out.println("Feeding thePIG with plantains");
        return new FoodType();
        
    }

    @Override
    public Product produce() {
        Product product;
        product = new Product("Pernil");
        System.out.println("Pig is Producing" + product);
        return product;
    }

    @Override
    public float computeCostOfFood() {
        System.out.println("Computing the cost of PIG food");
        return 0.1F;
        
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
