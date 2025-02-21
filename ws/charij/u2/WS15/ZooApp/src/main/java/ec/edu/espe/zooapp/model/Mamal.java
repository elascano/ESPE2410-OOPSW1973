package ec.edu.espe.zooapp.model;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Sebastian Charij
 */
public class Mamal extends Animal{
    private float maximumHairSize;
    private int mamaryGlandsNumber;
    
    public void breastfeed(){
        System.out.println("breastfeeding the children");
    }

    public Mamal(float maximumHairSize, int mamaryGlandsNumber, int id, String name, Date BornOnDate, float weight, char sex, ArrayList<Vaccine> vaccines) {
        super(id, name, BornOnDate, weight, sex, vaccines);
        this.maximumHairSize = maximumHairSize;
        this.mamaryGlandsNumber = mamaryGlandsNumber;
    }

    @Override
    public String toString() {
        return "Mamal{" + super.toString() +"maximumHairSize=" + maximumHairSize + ", mamaryGlandsNumber=" + mamaryGlandsNumber + '}';
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
