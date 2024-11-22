package ec.espe.edu.farmsimulator.model;

import java.util.Date;

/**
 *
 * @author Andrés Espinosa
 */
public class Chicken {
    private int id;
    private String name;
    private String color;
    private int ageInMonths;
    private Date bornOnDate;
    private boolean notMoltin;

    @Override
    public String toString() {
        return "Chicken{" + "id=" + id + ", name=" + name + ", color=" + color + ", ageInMonths=" + ageInMonths + ", bornOnDate=" + bornOnDate + ", notMoltin=" + notMoltin + '}';
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

    public boolean isNotMoltin() {
        return notMoltin;
    }

    public void setNotMoltin(boolean notMoltin) {
        this.notMoltin = notMoltin;
    }
    
    
}


