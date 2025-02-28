

package ec.edu.espe.zooapp.model;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Robinson Bonilla
 */
public class Bird extends Animal{
    private float wingSize;
    private boolean canFly;
    
    public void chirp(){
        System.out.println(super.getName()+" is chirping");
    }
    public void migrate(String location){
        System.out.println(super.getName()+" is migrating to"+location);
    }
    @Override
    public String toString() {
        return "Bird{" +super.toString()+ "wingSize=" + wingSize + ", canFly=" + canFly + '}';
    }
    
    

    public Bird(float wingSize, boolean canFly, int id, String name, Date bornOnDate, float weight, char sex, ArrayList<Vaccine> vaccines) {
        super(id, name, bornOnDate, weight, sex, vaccines);
        this.wingSize = wingSize;
        this.canFly = canFly;
    }
    
    

    /**
     * @return the wingSize
     */
    public float getWingSize() {
        return wingSize;
    }

    /**
     * @param wingSize the wingSize to set
     */
    public void setWingSize(float wingSize) {
        this.wingSize = wingSize;
    }

    /**
     * @return the canFly
     */
    public boolean isCanFly() {
        return canFly;
    }

    /**
     * @param canFly the canFly to set
     */
    public void setCanFly(boolean canFly) {
        this.canFly = canFly;
    }
    

}
