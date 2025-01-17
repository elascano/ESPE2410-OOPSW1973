package ec.edu.espe.model;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Camila Bohorquez
 */
public class Animal {
    private int id;
    private String name;
    private Date bornOnDate;
    private float weight;
    private char sex;
    private ArrayList<Vaccine> vaccines;

    public Animal(int id, String name, Date bornOnDate, float weight, char sex, ArrayList<Vaccine> vaccines) {
        this.id = id;
        this.name = name;
        this.bornOnDate = bornOnDate;
        this.weight = weight;
        this.sex = sex;
        this.vaccines = vaccines;
    }

    public void feed(Food food) {
        System.out.println("Feeding the animal " + name + " with " + food);
    }

    public void register() {
        System.out.println("Registering the animal " + name);
    }

    public void assignCage(Cage cage) {
        System.out.println("Assigning the animal " + name + " to cage " + cage);
        cage.getAnimals().add(this);
    }

    public void provideVaccination(Vaccine vaccine) {
        System.out.println("Providing vaccination to the animal " + name + " with " + vaccine);
        this.vaccines.add(vaccine);
    }

    @Override
    public String toString() {
        return "Animal{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", bornOnDate=" + bornOnDate +
                ", weight=" + weight +
                ", sex=" + sex +
                ", vaccines=" + vaccines +
                '}';
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

    public Date getBornOnDate() {
        return bornOnDate;
    }

    public void setBornOnDate(Date bornOnDate) {
        this.bornOnDate = bornOnDate;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public ArrayList<Vaccine> getVaccines() {
        return vaccines;
    }

    public void setVaccines(ArrayList<Vaccine> vaccines) {
        this.vaccines = vaccines;
    }
}
