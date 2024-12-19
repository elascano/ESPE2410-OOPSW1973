
package ec.edu.espe.zooapp.model;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Alexander Maza
 */
public class Animal {
    private int id;
    private String name;
    private Date bornOnDate;
    private float weigth;
    private char sex;
    private ArrayList<Vaccine> vaccines;

    @Override
    public String toString() {
        return "Animal{" + "id=" + getId() + ", name=" + getName() + ", bornOnDate=" + getBornOnDate() + ", weigth=" + getWeigth() + ", sex=" + getSex() + ", vaccines=" + getVaccines() + '}';
    }

    
    
    public Animal(int id, String name, Date bornOnDate, float weigth, char sex, ArrayList<Vaccine> vaccines) {
        this.id = id;
        this.name = name;
        this.bornOnDate = bornOnDate;
        this.weigth = weigth;
        this.sex = sex;
        this.vaccines = vaccines;
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

   