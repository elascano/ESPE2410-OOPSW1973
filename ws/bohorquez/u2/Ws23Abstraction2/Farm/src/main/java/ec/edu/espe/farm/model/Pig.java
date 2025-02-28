package ec.edu.espe.farm.model;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Camila Bohorquez
 */
public class Pig extends FarmAnimal {

    private boolean isProducinnMeat;
    private float weight;

    public Pig(boolean isProducinnMeat, float weight, int id, String breed, Date bornOnDate, ArrayList<FoodType> foodTypes) {
        super(id, breed, bornOnDate, foodTypes);
        this.isProducinnMeat = isProducinnMeat;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Pig{" + "isProducinnMeat=" + isProducinnMeat + ", weight=" + weight + "}, { "+ super.toString()+  "}";
    }

    @Override
    public FoodType feed() {
        //TOOD feed the animal
        System.out.println("feeding the pig with my food");
        System.out.println("feeding the pig with plantains");
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
        System.out.println("Computing the cost of PIG food");
        return 0.1f;
    }

    /**
     * @return the isProducinnMeat
     */
    public boolean isIsProducinnMeat() {
        return isProducinnMeat;
    }

    /**
     * @param isProducinnMeat the isProducinnMeat to set
     */
    public void setIsProducinnMeat(boolean isProducinnMeat) {
        this.isProducinnMeat = isProducinnMeat;
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
