

package ec.edu.espe.farm.model;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Sebastian Charij
 */
public class Pig extends FarmAnimal{
    private boolean isProducingMeat;
    private float weight;

    public Pig(boolean isProducingMeat, float weight, int id, String breed, Date bornOnDate, ArrayList<FoodType> foodtypes) {
        super(id, breed, bornOnDate, foodtypes);
        this.isProducingMeat = isProducingMeat;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Pig{" + "isProducingMeat=" + isProducingMeat + 
                ", weight=" + weight + "}, {" +super.toString() + '}';
    }

    @Override
    public FoodType feed() {
      //TODO feed the animal
        System.out.println("feeding the PIG with my food");
        System.out.println("feeding the PIG with plantains");
        return new FoodType();
    }

    @Override
    public Product produce() {
        Product product;
        product = new Product("legs");
        System.out.println("PIG is producing" + product);
        return product;
    }

    @Override
    public float computeCostOfFood() {
        System.out.println("Computing the cost of PIG produces");
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
