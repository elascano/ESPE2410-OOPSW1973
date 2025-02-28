package ec.edu.espe.farmsimulator.model;

import java.util.Date;
import java.util.Calendar;

public class Chicken {
    private int id;
    private String name;
    private String color;
    private int computeAgeInMonths;
    private Date bornofDate;
    private boolean notMoling;

    // Constructor
    public Chicken(int id, String name, String color, Date bornofDate, boolean notMoling) {
        this.id = id;
        this.name = name;
        this.color = color;
        this.bornofDate = bornofDate;
        this.notMoling = notMoling;

        // Calculamos la edad en meses al momento de crear la instancia
        this.computeAgeInMonths = computeAgeInMonths();
    }

    // Método para calcular la edad en meses
    public int computeAgeInMonths() {
        Calendar birthDate = Calendar.getInstance();
        birthDate.setTime(this.bornofDate);

        Calendar currentDate = Calendar.getInstance(); // Fecha actual

        int years = currentDate.get(Calendar.YEAR) - birthDate.get(Calendar.YEAR);
        int months = currentDate.get(Calendar.MONTH) - birthDate.get(Calendar.MONTH);

        // Si el mes actual es anterior al mes de nacimiento, ajustamos los años y meses
        if (months < 0) {
            years--;
            months += 12;
        }

        // Convertimos los años a meses y sumamos los meses restantes
        return years * 12 + months;
    }

    // Métodos Getters y Setters
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

    public int getComputeAgeInMonths() {
        return computeAgeInMonths;
    }

    public void setComputeAgeInMonths(int computeAgeInMonths) {
        this.computeAgeInMonths = computeAgeInMonths;
    }

    public Date getBornofDate() {
        return bornofDate;
    }

    public void setBornofDate(Date bornofDate) {
        this.bornofDate = bornofDate;
    }

    public boolean isNotMoling() {
        return notMoling;
    }

    public void setNotMoling(boolean notMoling) {
        this.notMoling = notMoling;
    }

    // Método toString para imprimir la información del pollo
    @Override
    public String toString() {
        return "Chicken{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", computeAgeInMonths=" + computeAgeInMonths +
                ", bornofDate=" + bornofDate +
                ", notMoling=" + notMoling +
                '}';
    }
}
