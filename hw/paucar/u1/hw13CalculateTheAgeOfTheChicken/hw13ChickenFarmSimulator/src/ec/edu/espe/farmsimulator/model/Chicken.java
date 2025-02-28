package ec.edu.espe.farmsimulator.model;

import java.util.Calendar;
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
        
    
        this.ageInMonths = computeAgeInMonths();
    }

    public int computeAgeInMonths() {
        Calendar currentDate = Calendar.getInstance(); 
        Calendar birthDate = Calendar.getInstance();
        birthDate.setTime(bornOnDate); 

        
        int yearsDifference = currentDate.get(Calendar.YEAR) - birthDate.get(Calendar.YEAR);
        int monthsDifference = currentDate.get(Calendar.MONTH) - birthDate.get(Calendar.MONTH);

       
        if (monthsDifference < 0) {
            yearsDifference--;
            monthsDifference += 12;
        }

        return (yearsDifference * 12) + monthsDifference;
    }    
    


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAgeInMonths() {
        return ageInMonths;
    }

    public void setAgeInMonths(int ageInMonths) {
        this.ageInMonths = ageInMonths;
    }

    public Date getBornOnDate() {
        return bornOnDate;
    }

    public void setBornOnDate(Date bornOnDate) {
        this.bornOnDate = bornOnDate;
    }

    public boolean isNotMolting() {
        return notMolting;
    }

    public void setNotMolting(boolean notMolting) {
        this.notMolting = notMolting;
    }
}
