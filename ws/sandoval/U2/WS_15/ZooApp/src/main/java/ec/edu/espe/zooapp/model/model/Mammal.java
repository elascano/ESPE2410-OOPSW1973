package ec.edu.espe.zooapp.model.model;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Andrés Sandoval
 */
public class Mammal extends Animal{
    private float maximunHairSize;
    private int mammaryGlandsNumber;
    
    public void breastfeed(){
        System.out.println("Breastfeeding the children ");
    }

    public Mammal(float maximunHairSize, int mammaryGlandsNumber, int id, String name, Date bornOnDate, float weight, char sex, ArrayList<Vaccine> vaccines) {
        super(id, name, bornOnDate, weight, sex, vaccines);
        this.maximunHairSize = maximunHairSize;
        this.mammaryGlandsNumber = mammaryGlandsNumber;
    }

    @Override
    public String toString() {
        return "Mammal{" + super.toString() + ", maximunHairSize="
                + "" + maximunHairSize + ", mammaryGlandsNumber=" + mammaryGlandsNumber + '}';
    }
    
    

    /**
     * @return the maximunHairSize
     */
    public float getMaximunHairSize() {
        return maximunHairSize;
    }

    /**
     * @param maximunHairSize the maximunHairSize to set
     */
    public void setMaximunHairSize(float maximunHairSize) {
        this.maximunHairSize = maximunHairSize;
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
