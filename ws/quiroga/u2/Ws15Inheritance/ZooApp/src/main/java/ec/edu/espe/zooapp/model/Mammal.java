
package ec.edu.espe.zooapp.model;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Esteban Quiroga 
 */
public class Mammal extends Animal {
    private float maxHairSize;
    private int mammaryGlandsNumber;
    
    
    
    public void breastfeed(){
        System.out.println("Breastfeeding the children");
    }

    public Mammal(float maxHairSize, int mammaryGlandsNumber, int id, String name, Date bornOnDate, float weigth, char sex, ArrayList<Vaccine> vaccines) {
        super(id, name, bornOnDate, weigth, sex, vaccines); //Constructor of the animal
        this.maxHairSize = maxHairSize;
        this.mammaryGlandsNumber = mammaryGlandsNumber;
    }

    @Override
    public String toString() {
        return "Mammal{" + super.toString()+ "maxHairSize=" + maxHairSize + ", mammaryGlandsNumber=" + mammaryGlandsNumber + '}';
    }

    
    /**
     * @return the maxHairSize
     */
    public float getMaxHairSize() {
        return maxHairSize;
    }

    /**
     * @param maxHairSize the maxHairSize to set
     */
    public void setMaxHairSize(float maxHairSize) {
        this.maxHairSize = maxHairSize;
    }

    /**
     * @return the mammaryGlandsNumber
     */
    public int getMammaryGlandsNumber() {
        return mammaryGlandsNumber;
    }

    /**
     * @param mammaryGlandsNumber the mammaryGlandsNumber to set
     */
    public void setMammaryGlandsNumber(int mammaryGlandsNumber) {
        this.mammaryGlandsNumber = mammaryGlandsNumber;
    }
}
