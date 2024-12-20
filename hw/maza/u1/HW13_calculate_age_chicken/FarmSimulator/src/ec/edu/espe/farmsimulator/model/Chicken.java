package ec.edu.espe.farmsimulator.model;

import java.util.Date;

public class Chicken {
    private int id;
    private String name;
    private String color;
    private Date bornOnDate;
    private boolean notMolting;

    // Constructor sin argumentos (necesario para Gson)
    public Chicken() {}

    // Constructor con argumentos
    public Chicken(int id, String name, String color, Date bornOnDate, boolean notMolting) {
        this.id = id;
        this.name = name;
        this.color = color;
        this.bornOnDate = bornOnDate;
        this.notMolting = notMolting;
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

    @Override
    public String toString() {
        return "Chicken{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", bornOnDate=" + bornOnDate +
                ", notMolting=" + notMolting +
                '}';
    }
}

