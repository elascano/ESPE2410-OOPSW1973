
package ec.edu.espe.zoo.zooapp.model;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author USUARIO
 */
public class Mammal extends Animal {
    private float maximumHairSize;
    private int mammaryGlandsNumber;

   
    
    public void breastfeed(){
        System.out.println("breastfeeding the children ");
    }

    public Mammal(float maximumHairSize, int mammaryGlandsNumber, int id, String name, Date bornOnDate, float weight, char sex, ArrayList<Vaccine> vaccines) {
        super(id, name, bornOnDate, weight, sex, vaccines);
        this.maximumHairSize = maximumHairSize;
        this.mammaryGlandsNumber = mammaryGlandsNumber;
        
    }

    @Override
    public String toString() {
        return "Mammal{" + super.toString() + "maximumHairSize=" + maximumHairSize + ", mammaryGlandsNumber=" + mammaryGlandsNumber + '}';
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

    public void provideVaccination(Vaccine vaccine) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
    
}
