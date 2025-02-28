

package ec.edu.espe.zooapp.model;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Robinson Bonilla
 */
public class Mammal extends Animal {
    private float maximumHairSize;
    private int mammaryGlandsNumber;
    
    public void breastFeed(){
        System.out.println("breast feeding the children ");
    }

    public Mammal(float maximumHairSize, int mammaryGlandsNumber, int id, String name, Date BornOnDate, float weight, char sex, ArrayList<Vaccine> vaccines) {
        super(id, name, BornOnDate, weight, sex, vaccines);
        this.maximumHairSize = maximumHairSize;
        this.mammaryGlandsNumber = mammaryGlandsNumber;
    }

    @Override
    public String toString() {
        return "Mammal{" + "maximumHairSize=" + maximumHairSize + ", mammaryGlandsNumber=" + mammaryGlandsNumber + '}';
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
