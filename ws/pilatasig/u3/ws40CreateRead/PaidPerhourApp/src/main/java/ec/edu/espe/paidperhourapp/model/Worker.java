
package ec.edu.espe.paidperhourapp.model;

/**
 *
 * @author David Pilatasig
 */
public class Worker {
    private String id;
    private String name;
    private int workedHours;
    private float paidPerHour;

    public Worker(String id, String name, int workedHours, float paidPerHour) {
        this.id = id;
        this.name = name;
        this.workedHours = workedHours;
        this.paidPerHour = paidPerHour;
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
        return paidPerHour;
    }

    public void setPaidPerHour(float paidPerHour) {
        this.paidPerHour = paidPerHour;
    }

    @Override
    public String toString() {
        return "Worker{" + "id=" + id + ", name=" + name + ", workedHours=" + workedHours + ", paidPerHour=" + paidPerHour + '}';
    }

   
}



