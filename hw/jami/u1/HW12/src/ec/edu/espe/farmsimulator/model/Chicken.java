package ec.edu.espe.farmsimulator.model;

import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.util.Date;

/**
 *
 * @author Klever Jami
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

        this.ageInMonths = computeAgeInMonths();
    }

    public int computeAgeInMonths() {
        LocalDate bornDate = bornOnDate.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        LocalDate currentDate = LocalDate.now();
        Period age = Period.between(bornDate, currentDate);
        return age.getYears() * 12 + age.getMonths();
    }

    public String computeAgeInYearsAndMonths() {
        LocalDate bornDate = bornOnDate.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        LocalDate currentDate = LocalDate.now();
        Period age = Period.between(bornDate, currentDate);

        return age.getYears() + " years and " + age.getMonths() + " months";
    }

    @Override
    public String toString() {
        return "Chicken{"
                + "id=" + id
                + ", name='" + name + '\''
                + ", color='" + color + '\''
                + ", age=" + computeAgeInYearsAndMonths()
                + ", bornOnDate=" + bornOnDate
                + ", notMolting=" + notMolting
                + '}';
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
        //T
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
