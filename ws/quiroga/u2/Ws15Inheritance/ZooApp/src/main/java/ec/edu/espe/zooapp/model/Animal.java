
package ec.edu.espe.zooapp.model;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Esteban Quiroga 
 */
public class Animal {
    protected int id;
    private String name;
    private Date bornOnDate;
    private float weigth;
    private char sex;
    private ArrayList<Vaccine> vaccines;
    
    public void feed(Food food){
        System.out.println("Feeding the animal with --> " + food);
    }
    
    public void register(){
        System.out.println("Registering animal...");
    }
    
    public void assignCage(Cage cage, Animal animal){
        //TODO assign animal to a cage
        System.out.println("Assigning an animal " + animal+ " to cage --> " + cage);
        cage.getAnimals().add(this);
    }
     
    public void provideVaccination(Vaccine vaccine){
        System.out.println("Providing vaccine --> " + vaccine + " <-- to "+ name);
        vaccines.add(vaccine);
    }

    public Animal(int id, String name, Date bornOnDate, float weigth, char sex, ArrayList<Vaccine> vaccines) {
        this.id = id;
        this.name = name;
        this.bornOnDate = bornOnDate;
        this.weigth = weigth;
        this.sex = sex;
        this.vaccines = vaccines;
    }

    @Override
    public String toString() {
        return "Animal{" + "id=" + id + ", name=" + name + ", bornOnDate=" + bornOnDate + ", weigth=" + weigth + ", sex=" + sex + ", vaccines=" + vaccines + '}';
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
     * @return the weigth
     */
    public float getWeigth() {
        return weigth;
    }

    /**
     * @param weigth the weigth to set
     */
    public void setWeigth(float weigth) {
        this.weigth = weigth;
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
