package ec.edu.espe.zooapp.model;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @authorRobinson Bonilla
 */
public class Mammal  extends  Animal{
    private float maximumHairSize;
    private int mammaryGlandsNumber;

    @Override
    public String toString() {
        return "Mammal{" + super.toString()+"maximumHairSize=" + maximumHairSize + ", mammaryGlandsNumber=" + mammaryGlandsNumber + '}';
    }

    public Mammal(float maximumHairSize, int mammaryGlandsNumber, int id, String name, Date bornOnDate, float weight, char sex, ArrayList<Vaccine> vaccines) {
        super(id, name, bornOnDate, weight, sex, vaccines);
        this.maximumHairSize = maximumHairSize;
        this.mammaryGlandsNumber = mammaryGlandsNumber;
    }
    
    
    public void breastFeed(){
        System.out.println("breastfeending the children ");
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
