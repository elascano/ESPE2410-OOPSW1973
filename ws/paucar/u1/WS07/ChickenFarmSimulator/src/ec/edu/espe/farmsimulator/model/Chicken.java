package ec.edu.espe.farmsimulator.model;

import java.util.Date;

/**
 *
 * @author Dennis Paucar
 */
public class Chicken {
    private int id;
    private String name;
    private String color;
    private int ageInMonths;
    private Date bornOnDate;
    private boolean notMolting;

    @Override
    public String toString() {
        return "Chicken{" + "id=" + id + ", name=" + name + ", color=" + color + ", age=" + ageInMonths + ", bornOnDate=" + bornOnDate + ", notMolting=" + notMolting + '}';
    }

    public Chicken(int id, String name, String color, Date bornOnDate, boolean notMolting) {
        this.id = id;
        this.name = name;
        this.color = color;
        this.bornOnDate = bornOnDate;
        this.notMolting = notMolting;
        
        //TODO call the function that implements the algorithm that compute ageInMonths
        this.ageInMonths=computeAgeinMoths();
    }

    public int computeAgeinMoths(){
        //TODO compute ageInMonths
        //= new Date();
        //Date age;
        //age = currentDate - bornOnDate;
        return 0;
    }    
    
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
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the color
     */
    public String getColor() {
        return color;
    }

    /**
     * @param color the color to set
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * @return the ageInMonths
     */
    public int getAgeInMonths() {
        return ageInMonths;
    }

    /**
     * @param ageInMonths the ageInMonths to set
     */
    public void setAgeInMonths(int ageInMonths) {
        //TODO compute the ageInMonths based on the born on date attribute
        this.ageInMonths = ageInMonths;
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
     * @return the notMolting
     */
    public boolean isNotMolting() {
        return notMolting;
    }

    /**
     * @param notMolting the notMolting to set
     */
    public void setNotMolting(boolean notMolting) {
        this.notMolting = notMolting;
    }
    
}
