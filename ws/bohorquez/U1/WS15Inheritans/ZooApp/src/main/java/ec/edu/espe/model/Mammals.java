package ec.edu.espe.model;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Camila Bohorquez
 */
public class Mammals extends Animal {
    private float maximumHairSize;
    private int mammaryGlandsNumber;

    public Mammals(int id, String name, Date bornOnDate, float weight, char sex, ArrayList<Vaccine> vaccines, 
                   float maximumHairSize, int mammaryGlandsNumber) {
        super(id, name, bornOnDate, weight, sex, vaccines);
        this.maximumHairSize = maximumHairSize;
        this.mammaryGlandsNumber = mammaryGlandsNumber;
    }

    public void breastfeed() {
        System.out.println("Breastfeeding the children");
    }

    @Override
    public String toString() {
        return "Mammals{" +
                "id=" + getId() +
                ", name='" + getName() + '\'' +
                ", bornOnDate=" + getBornOnDate() +
                ", weight=" + getWeight() +
                ", sex=" + getSex() +
                ", vaccines=" + getVaccines() +
                ", maximumHairSize=" + maximumHairSize +
                ", mammaryGlandsNumber=" + mammaryGlandsNumber +
                '}';
    }

    public float getMaximumHairSize() {
        return maximumHairSize;
    }

    public void setMaximumHairSize(float maximumHairSize) {
        this.maximumHairSize = maximumHairSize;
    }

    public int getMammaryGlandsNumber() {
        return mammaryGlandsNumber;
    }

    public void setMammaryGlandsNumber(int mammaryGlandsNumber) {
        this.mammaryGlandsNumber = mammaryGlandsNumber;
    }
}
