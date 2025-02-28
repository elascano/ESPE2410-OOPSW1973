package com.mycompany.farm.model;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author David Pilatasig
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
        return "Pig{" + "isProducingMeat=" + isProducingMeat + ", weight=" + weight + "}," +'{'+ super.toString()+'}';
    }
    
    

    @Override
    public FoodType feed() {
        System.out.println("feeding the pig with my food");
        System.out.println("Feeding the pig with my plantains");
        return new FoodType();
    }

    @Override
    public Product produce() {
        Product product;
        product= new Product("legs");
        System.out.println("Pig is producing" + product);
        return product;
    }

    @Override
    public float computeCostOfFood() {
        System.out.println("Computing the cost of PIG food");
        return 0.1f;
    }

    public boolean isIsProducingMeat() {
        return isProducingMeat;
    }

    public void setIsProducingMeat(boolean isProducingMeat) {
        this.isProducingMeat = isProducingMeat;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }
}
