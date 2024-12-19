package ec.edu.espe.zooapp.model;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author David Cuichan
 */
public class Mammal extends Animal {
    private float maximumHairSize;
    private int mammaryGlandNumber;
    
    public void breastFeed(){
        System.out.println("\nbreastfeeding the children ");
    }

    public Mammal(float maximumHairSize, int mammaryGlandNumber, int id, String name, Date bornOnDate, float weight, char sex, ArrayList<Vaccine> vaccines) {
        super(id, name, bornOnDate, weight, sex, vaccines);
        this.maximumHairSize = maximumHairSize;
        this.mammaryGlandNumber = mammaryGlandNumber;
    }

    @Override
    public String toString() {
        return "Mammal{" + super.toString() + ", maximumHairSize=" + maximumHairSize + ", mammaryGlandNumber=" + mammaryGlandNumber + '}';
    }
    
    

    /**
     * @return the maximumHairSize
     */
    public float getMaximumHairSize() {
        return maximumHairSize;
    }

    /**
     * @param maximumHairSize the maximumHairSize to set
     */
    public void setMaximumHairSize(float maximumHairSize) {
        this.maximumHairSize = maximumHairSize;
    }

    /**
     * @return the mammaryGlandNumber
     */
    public int getMammaryGlandNumber() {
        return mammaryGlandNumber;
    }

    /**
     * @param mammaryGlandNumber the mammaryGlandNumber to set
     */
    public void setMammaryGlandNumber(int mammaryGlandNumber) {
        this.mammaryGlandNumber = mammaryGlandNumber;
    }
    
    
}
