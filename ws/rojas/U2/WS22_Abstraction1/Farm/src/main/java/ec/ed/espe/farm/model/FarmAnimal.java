
package ec.ed.espe.farm.model;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author G406
 */
public abstract class FarmAnimal {
    private int id;
    private String bread;
    private Date bornOnDate;
    private ArrayList<FoodType> foodTypes;

    public FarmAnimal(int id, String bread, Date bornOnDate, ArrayList<FoodType> foodTypes) {
        this.id = id;
        this.bread = bread;
        this.bornOnDate = bornOnDate;
        this.foodTypes = foodTypes;
    }

    @Override
    public String toString() {
        return "FarmAnimal{" + "id=" + id + ", bread=" + bread + ", bornOnDate=" + bornOnDate + ", foodTypes=" + foodTypes + '}';
    }
    
    
    
    
    public int getAgeMonths(){
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
     * @return the bread
     */
    public String getBread() {
        return bread;
    }

    /**
     * @param bread the bread to set
     */
    public void setBread(String bread) {
        this.bread = bread;
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
     * @return the foodTypes
     */
    public ArrayList<FoodType> getFoodTypes() {
        return foodTypes;
    }

    /**
     * @param foodTypes the foodTypes to set
     */
    public void setFoodTypes(ArrayList<FoodType> foodTypes) {
        this.foodTypes = foodTypes;
    }
            
}

   
