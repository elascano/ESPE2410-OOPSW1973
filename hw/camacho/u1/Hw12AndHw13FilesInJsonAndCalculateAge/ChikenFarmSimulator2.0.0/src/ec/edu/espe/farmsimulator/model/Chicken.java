package ec.edu.espe.farmsimulator.model;

import java.util.Date;
import java.util.Calendar;

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
        return "Chicken{" + "id=" + id + ", name=" + name + ", color=" + color + ", ageMonths=" + ageMonths + ", bornOfDate=" + bornOfDate + ", notMolting=" + notMolting + '}';
    }

    public Chicken(int id, String name, String color, Date bornOfDate, boolean notMolting) {
        this.id = id;
        this.name = name;
        this.color = color;
        this.bornOfDate = bornOfDate;
        this.notMolting = notMolting;
        this.ageMonths = computeAgeInMonths();
    }

    public int computeAgeInMonths() {
        Calendar birthCal = Calendar.getInstance();
        birthCal.setTime(bornOfDate);
        
        Calendar nowCal = Calendar.getInstance();
        nowCal.setTime(new Date());
        
        int ageInMonths = (nowCal.get(Calendar.YEAR) - birthCal.get(Calendar.YEAR)) * 12;
        ageInMonths += nowCal.get(Calendar.MONTH) - birthCal.get(Calendar.MONTH);
        
        return ageInMonths;
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getColor() { return color; }
    public void setColor(String color) { this.color = color; }

    public int getAgeMonths() { return ageMonths; }
    public void setAgeMonths(int ageMonths) {
        // Update the bornOfDate based on ageMonths if necessary
        this.ageMonths = ageMonths;
    }

    public Date getBornOfDate() { return bornOfDate; }
    public void setBornOfDate(Date bornOfDate) {
        this.bornOfDate = bornOfDate;
        this.ageMonths = computeAgeInMonths(); // Recalculate ageMonths when bornOfDate changes
    }

    public boolean isNotMolting() { return notMolting; }
    public void setNotMolting(boolean notMolting) { this.notMolting = notMolting; }

    // Método para convertir un objeto Chicken a JSON manualmente
    public String toJson() {
        return "{" +
                "\"id\":" + id + "," +
                "\"name\":\"" + name + "\"," +
                "\"color\":\"" + color + "\"," +
                "\"ageMonths\":" + ageMonths + "," +
                "\"bornOfDate\":\"" + bornOfDate + "\"," +
                "\"notMolting\":" + notMolting +
                "}";
    }
}