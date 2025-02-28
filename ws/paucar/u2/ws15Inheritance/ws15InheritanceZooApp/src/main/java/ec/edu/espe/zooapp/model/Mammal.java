package ec.edu.espe.zooapp.model;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Dennis Paucar
 */
public class Mammal extends Animal {
    private float maxiumHairSize;
    private int mammaryGlandsNumber;
    
    public void breastfeed(){
        System.out.println("breastfeed the children");
    }

    public Mammal(float maxiumHairSize, int mammaryGlandsNumber, int id, String name, Date bornOnDate, float weight, char sex, ArrayList<Vaccine> vaccines) {
        super(id, name, bornOnDate, weight, sex, vaccines);
        this.maxiumHairSize = maxiumHairSize;
        this.mammaryGlandsNumber = mammaryGlandsNumber;
    }

    @Override
    public String toString() {
        return "Mammal{" + super.toString() + ", maxiumHairSize=" + maxiumHairSize + ", mammaryGlandsNumber=" + mammaryGlandsNumber + '}';
    }
    
    
    
    /**
     * @return the maxiumHairSize
     */
    public float getMaxiumHairSize() {
        return maxiumHairSize;
    }

    /**
     * @param maxiumHairSize the maxiumHairSize to set
     */
    public void setMaxiumHairSize(float maxiumHairSize) {
        this.maxiumHairSize = maxiumHairSize;
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
