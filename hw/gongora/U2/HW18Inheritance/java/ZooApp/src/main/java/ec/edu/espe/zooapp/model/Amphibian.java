

package ec.edu.espe.zooapp.model;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Lucas Gongora
 */
public class Amphibian extends Animal {
    private String skinType;
    private String stage;
    
    public void hop(){
        System.out.println("The "+super.getName()+" is hopping");
    }
    
    public void transition(){
        System.out.println("The "+super.getName()+"is transforming");
    }

    @Override
    public String toString() {
        return "Amphibian{" + super.toString() + "skinType=" + skinType + ", stage=" + stage + '}';
    }

    public Amphibian(String skinType, String stage, int id, String name, Date bornOnDate, float weight, char sex, ArrayList<Vaccine> vaccines) {
        super(id, name, bornOnDate, weight, sex, vaccines);
        this.skinType = skinType;
        this.stage = stage;
    }

    
    
    
    

    /**
     * @return the skinType
     */
    public String getSkinType() {
        return skinType;
    }

    /**
     * @param skinType the skinType to set
     */
    public void setSkinType(String skinType) {
        this.skinType = skinType;
    }

    /**
     * @return the stage
     */
    public String getStage() {
        return stage;
    }

    /**
     * @param stage the stage to set
     */
    public void setStage(String stage) {
        this.stage = stage;
    }
    
    
}
