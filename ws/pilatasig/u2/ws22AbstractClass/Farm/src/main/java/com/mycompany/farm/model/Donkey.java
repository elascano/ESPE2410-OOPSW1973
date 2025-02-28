package com.mycompany.farm.model;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Usuario
 */
public class Donkey extends FarmAnimal{
    private float loadWeight;

    public Donkey(float loadWeight, int id, String breed, Date bornOnDate, ArrayList<FoodType> foodType) {
        super(id, breed, bornOnDate, foodType);
        this.loadWeight = loadWeight;
    }

    @Override
    public String toString() {
        return "Donkey{" + "loadWeight=" + loadWeight + "}," + super.toString();
    }

    
    public void load(String origin, String destination){
        System.out.println("This donkey is loading " + loadWeight+ " from " +origin + " to " + destination );
    }

    @Override
    public FoodType feed() {
        System.out.println("Feeding a donkey");
        return new FoodType();
    }

    @Override
    public Product produce() {
        System.out.println("donkey is loading");
        return new Product("loading fot eh mines");
    }

    @Override
    public float computeCostOfFood() {
        System.out.println("Computing the cost of the food");
        return 0.2F;
    }

    public float getLoadWeight() {
        return loadWeight;
    }

    public void setLoadWeight(float loadWeight) {
        this.loadWeight = loadWeight;
    }
    
    
    
    
    
    
}
