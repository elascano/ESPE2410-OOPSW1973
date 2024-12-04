package ec.edu.espe.farmsimulator.model;

import java.util.Date;

/**
 *
 * @author Gabriel Manosalvas
 */
public class Chicken {
    private int id;
    private String name;
    private String color;
    private int computeAgeInMonths;
    private Date bornofDate;
    private boolean notMoling;

    @Override
    public String toString() {
        return "Chicken{" + "id=" + id + ", name=" + name + ", color=" + color + ", age=" + computeAgeInMonths + ", bornofDate=" + bornofDate + ", notMoling=" + notMoling + '}';
    }

    public Chicken(int id, String name, String color, Date bornofDate, boolean notMoling) {
        this.id = id;
        this.name = name;
        this.color = color;
        this.bornofDate = bornofDate;
        this.notMoling = notMoling;
        
    //TODO algorithm to compute computeAgeInMonths
    this.computeAgeInMonths=3;
    }

    public int computeAge(){
    //TODO compute computeAgeInMonths como usar el date

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
     * @return the computeAgeInMonths
     */
    public int getComputeAgeInMonths() {
        return computeAgeInMonths;
    }

    /**
     * @param computeAgeInMonths the computeAgeInMonths to set
     */
    public void setComputeAgeInMonths(int computeAgeInMonths) {
        //TODO compute the computeAgeInMonths based on the born on date attribute
        this.computeAgeInMonths = computeAgeInMonths;
    }

    /**
     * @return the bornofDate
     */
    public Date getBornofDate() {
        return bornofDate;
    }

    /**
     * @param bornofDate the bornofDate to set
     */
    public void setBornofDate(Date bornofDate) {
        this.bornofDate = bornofDate;
    }

    /**
     * @return the notMoling
     */
    public boolean isNotMoling() {
        return notMoling;
    }

    /**
     * @param notMoling the notMoling to set
     */
    public void setNotMoling(boolean notMoling) {
        this.notMoling = notMoling;
    }
    
    
}
