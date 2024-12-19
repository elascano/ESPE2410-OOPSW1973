
package ec.edu.espe.zooapp.model;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author David Pilatasig
 */
public class Mammal extends Animal {
    private float maxHairSize;
    private int mammaryGlandNumber;
    
    public void breastFeed(){
        System.out.println("Breastfeeding the children ");
    }

    public float getMaxHairSize() {
        return maxHairSize;
    }

    public void setMaxHairSize(float maxHairSize) {
        this.maxHairSize = maxHairSize;
    }

    public int getMammaryGlandNumber() {
        return mammaryGlandNumber;
    }

    public void setMammaryGlandNumber(int mammaryGlandNumber) {
        this.mammaryGlandNumber = mammaryGlandNumber;
    }

    public Mammal(float maxHairSize, int mammaryGlandNumber, int id, String name, Date bornOnDate, float weight, char sex, ArrayList<Vaccine> vaccines) {
        super(id, name, bornOnDate, weight, sex, vaccines);
        this.maxHairSize = maxHairSize;
        this.mammaryGlandNumber = mammaryGlandNumber;
    }

    @Override
    public String toString() {
        return "Mammal{" + super.toString()+ ", maxHairSize=" + maxHairSize + ", mammaryGlandNumber=" + mammaryGlandNumber + '}';
    }
    
    
    
}
