

package ec.edu.espe.zooapp.model;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @authorRobinson Bonilla
 */
public class Reptile extends Animal{
    private String typeOfScales;
    private boolean isPoisonous;
    private boolean hasLegs;

    public void shedSkin(){
        System.out.println(super.getName()+" is shedding its skin");
    }
    @Override
    public String toString() {
        return "Reptile{" +super.toString()+ "typeOfScales=" + typeOfScales + ", isPoisonous=" + isPoisonous + ", hasLegs=" + hasLegs + '}';
    }
    
    

    public Reptile(String typeOfScales, boolean isPoisonous, boolean hasLegs, int id, String name, Date bornOnDate, float weight, char sex, ArrayList<Vaccine> vaccines) {
        super(id, name, bornOnDate, weight, sex, vaccines);
        this.typeOfScales = typeOfScales;
        this.isPoisonous = isPoisonous;
        this.hasLegs = hasLegs;
    }
    
    

    /**
     * @return the typeOfScales
     */
    public String getTypeOfScales() {
        return typeOfScales;
    }

    /**
     * @param typeOfScales the typeOfScales to set
     */
    public void setTypeOfScales(String typeOfScales) {
        this.typeOfScales = typeOfScales;
    }

    /**
     * @return the isPoisonous
     */
    public boolean isIsPoisonous() {
        return isPoisonous;
    }

    /**
     * @param isPoisonous the isPoisonous to set
     */
    public void setIsPoisonous(boolean isPoisonous) {
        this.isPoisonous = isPoisonous;
    }

    /**
     * @return the hasLegs
     */
    public boolean isHasLegs() {
        return hasLegs;
    }

    /**
     * @param hasLegs the hasLegs to set
     */
    public void setHasLegs(boolean hasLegs) {
        this.hasLegs = hasLegs;
    }
    
    
}
