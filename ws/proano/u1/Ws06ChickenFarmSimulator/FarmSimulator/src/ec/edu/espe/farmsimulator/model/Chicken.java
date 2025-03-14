package ec.edu.espe.farmsimulator.model;

import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.util.Date;


/**
 *
 * @author Esteban Quiroga
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

    public Chicken(int id, String name, String color, Date bornOnDate, boolean notMolting, int ageInMonths) {
        this.id = id;
        this.name = name;
        this.color = color;
        this.bornOnDate = bornOnDate;
        this.notMolting = notMolting;
        
        //DONE algorithm to compute age
        this.ageInMonths=computeAgeInMonths(bornOnDate);
    }
    
    /**
     *
     * @param bornOnDate
     * @return
     */
    public int computeAgeInMonths(Date bornOnDate){
        //DONE compute age
        LocalDate castedBornOnDate = bornOnDate.toInstant()
                                         .atZone(ZoneId.systemDefault())
                                         .toLocalDate();
        LocalDate actualDate = LocalDate.now();
        Period period = Period.between(castedBornOnDate, actualDate);
        ageInMonths = period.getYears()*12 + period.getMonths();
        
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
     * @return the age
     */
    public int getAge() {
        return ageInMonths;
    }

    /**
     * @param age the age to set
     */
    public void setAge(int age) {
        //TODO compute age based on born on date attribute.
        this.ageInMonths = age;
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
