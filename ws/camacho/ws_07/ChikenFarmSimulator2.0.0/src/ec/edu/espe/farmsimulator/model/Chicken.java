package ec.edu.espe.farmsimulator.model;

import java.util.Date;

/**
 *
 * @author Mateo Camacho
 */
public class Chicken {

    private int id;
    private String name;
    private String color;
    private int ageMonths;
    private Date bornOfDate;
    private boolean notMolting;

    @Override
    public String toString() {
        return "Chicken{" + "id=" + id + ", name=" + name + ", color=" + color + ", age=" + ageMonths + ", bornOfDate=" + bornOfDate + ", notMolting=" + notMolting + '}';
    }

    public Chicken(int id, String name, String color, Date bornOfDate, boolean notMolting) {
        this.id = id;
        this.name = name;
        this.color = color;
        this.bornOfDate = bornOfDate;
        this.notMolting = notMolting;
        
        //TODO algoritm for compute the ageMonths
    }

    public int computeAgeInMonths(){
        //TODO compute ageMonths
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
     * @return the ageMonths
     */
    public int getAgeMonths() {
        return ageMonths;
    }

    /**
     * @param ageMonths the ageMonths to set
     */
    public void setAgeMonths(int ageMonths) {
        //TODO compute the ageMonths based on the date atribute
        this.ageMonths = ageMonths;
    }

    /**
     * @return the bornOfDate
     */
    public Date getBornOfDate() {
        return bornOfDate;
    }

    /**
     * @param bornOfDate the bornOfDate to set
     */
    public void setBornOfDate(Date bornOfDate) {
        this.bornOfDate = bornOfDate;
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
