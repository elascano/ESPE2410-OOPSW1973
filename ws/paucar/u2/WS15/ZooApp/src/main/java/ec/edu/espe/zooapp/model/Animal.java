package ec.edu.espe.zooapp.model;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Dennis Paucar
 */
public class Animal {
    private int id;
    private String name;
    private Date bornOnDate;
    private float weight;
    private char sex;
    private ArrayList<Vaccine> vaccines;
    
    public void feed(Food food){
        System.out.println(" Feeding the animal " + name + "with -->" + food);
    }
    
    public void register(){
        System.out.println("Registering the animal" + name);
    }
    
    public void assignCage(Cage cage){
        //TODO assign this animal to a cage
        System.out.println("Assigning an animal " + name + "to cage -->" + cage);
        cage.getAnimals().add(this);
        
    }
    
    public void provideVaccination(Vaccine vaccine){
        System.out.println(" providing vaccine -->" + vaccine + "<-- to" + name);
        vaccines.add(vaccine);
    }
    

    public Animal(int id, String name, Date bornOnDate, float weight, char sex, ArrayList<Vaccine> vaccines) {
        this.id = id;
        this.name = name;
        this.bornOnDate = bornOnDate;
        this.weight = weight;
        this.sex = sex;
        this.vaccines = vaccines;
    }

    @Override
    public String toString() {
        return "Animal{" + "id=" + id + ", name=" + name + ", bornOnDate=" + bornOnDate + ", weight=" + weight + ", sex=" + sex + ", vaccines=" + vaccines + '}';
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
     * @return the weight
     */
    public float getWeight() {
        return weight;
    }

    /**
     * @param weight the weight to set
     */
    public void setWeight(float weight) {
        this.weight = weight;
    }

    /**
     * @return the sex
     */
    public char getSex() {
        return sex;
    }

    /**
     * @param sex the sex to set
     */
    public void setSex(char sex) {
        this.sex = sex;
    }

    /**
     * @return the vaccines
     */
    public ArrayList<Vaccine> getVaccines() {
        return vaccines;
    }

    /**
     * @param vaccines the vaccines to set
     */
    public void setVaccines(ArrayList<Vaccine> vaccines) {
        this.vaccines = vaccines;
    }
    
    
    
}