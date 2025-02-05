package ec.edu.espe.molesimulator.model;

import java.util.Date;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.Period;

/**
 *
 * @author David Pilatasig
 */
public class Chicken {
    private int id;
    private String name;
    private String color;
    private int ageInMonths;
    private Date bornOnDate;
    private boolean notMolting;

    public Chicken(int id, String name, String color, Date bornOnDate, boolean notMolting) {
        this.id = id;
        this.name = name;
        this.color = color;
        this.bornOnDate = bornOnDate;
        this.notMolting = notMolting;
        this.ageInMonths = computeAgeInMonths(); // Calcula automáticamente la edad
    }

    private int computeAgeInMonths() {
        LocalDate bornOnLocalDate = bornOnDate.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        LocalDate currentDate = LocalDate.now();
        Period periodAge = Period.between(bornOnLocalDate, currentDate);
        return periodAge.getYears() * 12 + periodAge.getMonths();
    }

    @Override
    public String toString() {
        return String.format(
            "Chicken {id=%d, name='%s', color='%s', ageInMonths=%d, bornOnDate=%s, notMolting=%b}",
            id, name, color, ageInMonths, bornOnDate, notMolting
        );
    }

    // Getters y Setters
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
        return computeAgeInMonths(); // Calcula la edad dinámicamente
    }

    public Date getBornOnDate() {
        return bornOnDate;
    }

    public void setBornOnDate(Date bornOnDate) {
        this.bornOnDate = bornOnDate;
        this.ageInMonths = computeAgeInMonths(); // Recalcula la edad
    }

    public boolean isNotMolting() {
        return notMolting;
    }

    public void setNotMolting(boolean notMolting) {
        this.notMolting = notMolting;
    }
}

