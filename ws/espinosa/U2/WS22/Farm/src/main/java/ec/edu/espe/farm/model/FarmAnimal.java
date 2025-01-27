package ec.edu.espe.farm.model;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Andrés Espinosa
 */
public abstract class FarmAnimal {
    private int id;
    private String breed;
    private Date bornOnDate;
    private ArrayList<FoodType> foodType;

    public FarmAnimal(int id, String breed, Date bornOnDate, ArrayList<FoodType> foodType) {
        this.id = id;
        this.breed = breed;
        this.bornOnDate = bornOnDate;
        this.foodType = foodType;
    }

    @Override
    public String toString() {
        return "FarmAnimal{" + "id=" + id + ", breed=" + breed + ", bornOnDate=" + bornOnDate + ", foodType=" + foodType + '}';
    }
    
    
    
    public int getAgeinMonts(){
            //TODO
            return getBornOnDate().getYear();
    }
    
    public abstract FoodType feed();
    
    public abstract Product product();
    
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
     * @return the foodType
     */
    public ArrayList<FoodType> getFoodType() {
        return foodType;
    }

    /**
     * @param foodType the foodType to set
     */
    public void setFoodType(ArrayList<FoodType> foodType) {
        this.foodType = foodType;
    }
}
