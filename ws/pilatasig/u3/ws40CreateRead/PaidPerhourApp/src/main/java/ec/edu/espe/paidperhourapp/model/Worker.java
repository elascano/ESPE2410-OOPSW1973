
package ec.edu.espe.paidperhourapp.model;

import org.bson.Document;

/**
 *
 * @author David Pilatasig
 */
public class Worker {
    private String id;
    private String name;
    private int workedHours;
    private float payPerHour;
    private float pay;

    public Worker(String id, String name, int workedHours, float paidPerHour, float pay) {
        this.id = id;
        this.name = name;
        this.workedHours = workedHours;
        this.payPerHour = paidPerHour;
        this.pay = pay;
    }

    public Worker(String id, String name, int workedHours, float payPerHour) {
        this.id = id;
        this.name = name;
        this.workedHours = workedHours;
        this.payPerHour = payPerHour;
    }
    
    

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWorkedHours() {
        return workedHours;
    }

    public void setWorkedHours(int workedHours) {
        this.workedHours = workedHours;
    }

    public float getPaidPerHour() {
        return payPerHour;
    }

    public void setPaidPerHour(float paidPerHour) {
        this.payPerHour = paidPerHour;
    }

    public float getPay() {
        return pay;
    }

    public void setPay(float pay) {
        this.pay = pay;
    }

    @Override
    public String toString() {
        return new Document("id", id)
            .append("name", name)
            .append("workedHours", workedHours)
            .append("payPerHour", payPerHour)
            .append("pay", pay)
            .toJson();
    }
    
    
}



