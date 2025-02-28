package ec.edu.espe.farmsimulator.model;

import java.util.Date;

/**
 *
 * @author Brandon Pazmino <www.espe.edu.ec>
 */
public class Chicken {

    private int id;
    private String name;
    private String color;
    private int ageInMonths;
    private Date bornOnDate;
    private boolean notMotlting;

    @Override
    public String toString() {
        return "Chicken{" + "id=" + id + ", name=" + name + ", color=" + color + ", age=" + ageInMonths + ", bornOnDate=" + bornOnDate + ", notMotlting=" + notMotlting + '}';
    }

    public Chicken(int id, String name, String color, Date bornOnDate, boolean notMotlting) {
        this.id = id;
        this.name = name;
        this.color = color;
        this.bornOnDate = bornOnDate;
        this.notMotlting = notMotlting;
        //TODO algorithm to compute ageInMonths
        this.ageInMonths = computeAgeInMonths;
    }

    public int computeAgeInMonths() {
        //TODO compute ageInMonths
        Date currentDate = new Date();
        Date = ageInMonths;
        ageInMonths = currentDate = bornOnDate;
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
        //TODO compute ageInMonths based on the born on date attribute
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
     * @return the notMotlting
     */
    public boolean isNotMotlting() {
        return notMotlting;
    }

    /**
     * @param notMotlting the notMotlting to set
     */
    public void setNotMotlting(boolean notMotlting) {
        this.notMotlting = notMotlting;
    }

}
