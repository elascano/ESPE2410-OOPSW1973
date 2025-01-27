
package ec.edu.espe.zooapp.model;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author marlo
 */
public class Mammal extends Animal {
private float maximumHairSize;
private int mamaryGlandsNumber;

public void breastFeed(){
    System.out.println("BreastFeedeng the child");
}
public void provideVaccination(Vaccine vaccine){
    System.out.println("Providing vaccines");
}

    public Mammal(float maximumHairSize, int mamaryGlandsNumber, int id, String name, Date bornOnDate, float weight, char sex, ArrayList<Vaccine> vaccines) {
        super(id, name, bornOnDate, weight, sex, vaccines);
        this.maximumHairSize = maximumHairSize;
        this.mamaryGlandsNumber = mamaryGlandsNumber;
    }

    @Override
    public String toString() {
        return "Mammal{" + "maximumHairSize=" + getMaximumHairSize() + ", mamaryGlandsNumber=" + getMamaryGlandsNumber() + '}';
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
     * @return the mamaryGlandsNumber
     */
    public int getMamaryGlandsNumber() {
        return mamaryGlandsNumber;
    }

    /**
     * @param mamaryGlandsNumber the mamaryGlandsNumber to set
     */
    public void setMamaryGlandsNumber(int mamaryGlandsNumber) {
        this.mamaryGlandsNumber = mamaryGlandsNumber;
    }

   


}