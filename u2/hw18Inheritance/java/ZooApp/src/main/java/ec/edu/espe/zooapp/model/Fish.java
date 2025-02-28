package ec.edu.espe.zooapp.model;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Robinson Bonilla
 */
public class Fish extends Animal {

    private String scaleColor;
    private boolean isSaltWater;
    
    public void swim(){
        System.out.println(super.getName()+" is swimming");
    }

    @Override
    public String toString() {
        return "Fish{" + super.toString() + "scaleColor=" + scaleColor + ", isSaltWater=" + isSaltWater + '}';
    }

    public Fish(String scaleColor, boolean isSaltWater, int id, String name, Date bornOnDate, float weight, char sex, ArrayList<Vaccine> vaccines) {
        super(id, name, bornOnDate, weight, sex, vaccines);
        this.scaleColor = scaleColor;
        this.isSaltWater = isSaltWater;
    }

    /**
     * @return the scaleColor
     */
    public String getScaleColor() {
        return scaleColor;
    }

    /**
     * @param scaleColor the scaleColor to set
     */
    public void setScaleColor(String scaleColor) {
        this.scaleColor = scaleColor;
    }

    /**
     * @return the isSaltWater
     */
    public boolean isIsSaltWater() {
        return isSaltWater;
    }

    /**
     * @param isSaltWater the isSaltWater to set
     */
    public void setIsSaltWater(boolean isSaltWater) {
        this.isSaltWater = isSaltWater;
    }

}
