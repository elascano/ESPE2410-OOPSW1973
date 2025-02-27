package ec.edu.espe.farmsimulator.model;

import java.util.Date;

/**
 *
 * @author Lisbeth Tipan
 */
public class Chicken {
    private int id;
    private String name;
    private String color;
    private int ageInMonths;
    private Date bornOnDate;
    private boolean notHoling;

    @Override
    public String toString() {
        return "Chicken{" + "id=" + id + ", name=" + name + ", color=" + color + ", age=" + ageInMonths + ", bornOnDate=" + bornOnDate + ", notHoling=" + notHoling + '}';
    }

    public Chicken(int id, String name, String color, Date bornOnDate, boolean notHoling) {
        this.id = id;
        this.name = name;
        this.color = color;
        this.bornOnDate = bornOnDate;
        this.notHoling = notHoling;
        
        //TODO algorithm to compute age
        this.ageInMonths=computeAge();
    }
    
    
    public int computeAge(){
        //TODO compute age
        Date currentDate=new Date();
        Date age;
        age = currentDate = bornOnDate;
        
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
     * @return the age
     */
    public int getAge() {
        return ageInMonths;
    }

    /**
     * @param age the age to set
     */
    public void setAge(int age) {
        // TODO compute the age based on the born on date attribute
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
     * @return the notHoling
     */
    public boolean isNotHoling() {
        return notHoling;
    }

    /**
     * @param notHoling the notHoling to set
     */
    public void setNotHoling(boolean notHoling) {
        this.notHoling = notHoling;
    }
    
    
}
