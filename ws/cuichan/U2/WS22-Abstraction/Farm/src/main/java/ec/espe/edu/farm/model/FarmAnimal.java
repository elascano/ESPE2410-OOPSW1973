package ec.espe.edu.farm.model;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author David Cuichan
 */
public abstract class FarmAnimal {
    private int id;
    private String breed;
    private Date bornOnDate;
    private ArrayList<FoodType> FoodTypes;


    public FarmAnimal(int id, String breed, Date bornOnDate, ArrayList<FoodType> FoodTypes) {
        this.id = id;
        this.breed = breed;
        this.bornOnDate = bornOnDate;
        this.FoodTypes = FoodTypes;
    }
    
    @Override
    public String toString() {
        return "FarmAnimal{" + "id=" + id + ", breed=" + breed + ", bornOnDate=" + bornOnDate + ", FoodTypes=" + FoodTypes + '}';
    }

    public int getAgeInMonths(){
        //TODO
        return getBornOnDate().getYear();
    }
    
    public abstract FoodType food();
    public abstract Product produce();
    public abstract float computeCostOfFood();

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the breed
     */
    public String getBreed() {
        return breed;
    }

    /**
     * @param breed the breed to set
     */
    public void setBreed(String breed) {
        this.breed = breed;
    }

    /**
     * @return the bornOnDate
     */
    public Date getBornOnDate() {
        return bornOnDate;
    }

    /**
     * @param bornOnDate the bornOnDate to set
     */
    public void setBornOnDate(Date bornOnDate) {
        this.bornOnDate = bornOnDate;
    }

    /**
     * @return the FoodTypes
     */
    public ArrayList<FoodType> getFoodTypes() {
        return FoodTypes;
    }

    /**
     * @param FoodTypes the FoodTypes to set
     */
    public void setFoodTypes(ArrayList<FoodType> FoodTypes) {
        this.FoodTypes = FoodTypes;
    }
    
}
