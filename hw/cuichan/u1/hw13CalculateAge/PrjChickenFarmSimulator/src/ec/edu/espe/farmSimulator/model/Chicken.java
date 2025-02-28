package ec.edu.espe.farmSimulator.model;

import java.util.Date;

/**
 *
 * @author David Cuichan!
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
        return "Chicken{" + "id=" + id + ", name=" + name + ", color=" + color + ", ageInMonths=" + ageInMonths + ", bornOnDate=" + bornOnDate + ", notMolting=" + notMolting + '}';
    }
    
    public Chicken(int id, String name, String color, Date bornOnDate, boolean notMolting) {
        this.id = id;
        this.name = name;
        this.color = color;
        this.bornOnDate = bornOnDate;
        this.notMolting = notMolting;
        this.ageInMonths = ageInMonths;
    }
    
    public int ageInMonths() {

        Date currentDate;
        int yearsLived;
        int fullYearsLived;
        int monthsOfFullYears;
        int firstYearMonths;
        int lastYearMonths;
        
        currentDate = new Date();
        yearsLived = currentDate.getYear() - this.bornOnDate.getYear();
        fullYearsLived = yearsLived - 1;
        monthsOfFullYears = 12 * fullYearsLived;
        firstYearMonths = 12 - this.bornOnDate.getMonth();
        lastYearMonths = currentDate.getMonth();
        ageInMonths = firstYearMonths + monthsOfFullYears + lastYearMonths;

        return ageInMonths;
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
    private String getName() {
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
    private String getColor() {
        return color;
    }

    /**
     * @param color the color to set
     */
    private void setColor(String color) {
        this.color = color;
    }

    /**
     * @return the ageInMonths
     */
    private int getAgeInMonths() {
        return ageInMonths;
    }

    /**
     * @param ageInMonths the ageInMonths to set
     */
    private void setAgeInMonths(int ageInMonths) {
        this.ageInMonths = ageInMonths;
    }

    /**
     * @return the bornOnDate
     */
    private Date getBornOnDate() {
        return bornOnDate;
    }

    /**
     * @param bornOnDate the bornOnDate to set
     */
    private void setBornOnDate(Date bornOnDate) {
        this.bornOnDate = bornOnDate;
    }

    /**
     * @return the notMolting
     */
    private boolean isNotMolting() {
        return notMolting;
    }

    /**
     * @param notMolting the notMolting to set
     */
    private void setNotMolting(boolean notMolting) {
        this.notMolting = notMolting;
    }
    
}
