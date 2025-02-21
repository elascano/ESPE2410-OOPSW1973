

package ec.edu.espe.farm.model;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Sebastian Charij
 */
public abstract class FarmAnimal {
    private int id;
    private String breed;
    private Date bornOnDate;
    private ArrayList<FoodType> foodtypes;

    public FarmAnimal(int id, String breed, Date bornOnDate, ArrayList<FoodType> foodtypes) {
        this.id = id;
        this.breed = breed;
        this.bornOnDate = bornOnDate;
        this.foodtypes = foodtypes;
    }

    @Override
    public String toString() {
        return "FarmAnimal{" + "id=" + id + ", breed=" + breed +
                ", bornOnDate=" + bornOnDate + ", foodtypes=" + foodtypes + '}';
    }
    
    
    public int getAgeInMonths(){
        //compute age based on current date and born on date
        return getBornOnDate().getYear();
    }
    
    public abstract FoodType feed();
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
     * @return the foodtypes
     */
    public ArrayList<FoodType> getFoodtypes() {
        return foodtypes;
    }

    /**
     * @param foodtypes the foodtypes to set
     */
    public void setFoodtypes(ArrayList<FoodType> foodtypes) {
        this.foodtypes = foodtypes;
    }
    
    
    
}
