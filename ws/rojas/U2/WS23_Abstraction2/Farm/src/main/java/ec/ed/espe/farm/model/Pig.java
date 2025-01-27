
package ec.ed.espe.farm.model;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author G406
 */
public class Pig extends FarmAnimal{
    private boolean isProductigMeat;
    private float weight;

    public Pig(boolean isProductigMeat, float weight, int id, String bread, Date bornOnDate, ArrayList<FoodType> foodTypes) {
        super(id, bread, bornOnDate, foodTypes);
        this.isProductigMeat = isProductigMeat;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Pig{" + "isProductigMeat=" + isProductigMeat 
                + ", weight=" + weight + "}, {" + super.toString()+ '}';
    }
    
    
    

    @Override
    public FoodType feed() {
        //TODO feed the pig
        System.out.println("Feding the íg with my food");
        System.out.println("Feeding the with plantains");
        
        return new FoodType();
        
    }

    @Override
    public Product produce() {
        Product product;
        product = new Product("Legs ");
        System.out.println(" PIG is producing " + product);
        return  product;
    }

    @Override
    public float computeCostOfFood(){
        System.out.println("Computing the cost of Pig food");
        return 0.1F;
    }

    /**
     * @return the isProductigMeat
     */
    public boolean isIsProductigMeat() {
        return isProductigMeat;
    }

    /**
     * @param isProductigMeat the isProductigMeat to set
     */
    public void setIsProductigMeat(boolean isProductigMeat) {
        this.isProductigMeat = isProductigMeat;
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
