
package ec.edu.espe.juicebar.model;

/**
 *
 * @author LABS-DCCO
 */
public class Juice {
    private String juiceType;
    private int weight;

    public Juice(String juiceType, int weight) {
        this.juiceType = juiceType;
        this.weight = weight;
    }

    /**
     * @return the juiceType
     */
    public String getJuiceType() {
        return juiceType;
    }

    /**
     * @param juiceType the juiceType to set
     */
    public void setJuiceType(String juiceType) {
        this.juiceType = juiceType;
    }

    /**
     * @return the weight
     */
    public int getWeight() {
        return weight;
    }

    /**
     * @param weight the weight to set
     */
    public void setWeight(int weight) {
        this.weight = weight;
    }
    
    
}
