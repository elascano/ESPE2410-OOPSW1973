

package ec.edu.espe.volumecalculator.model;

/**
 *
 * @author abner
 */
public class Volume {
    
    private int id;
    private float Long;
    private float Width;
    private float High;

    public Volume(int id, float Long, float Width, float High) {
        this.id = id;
        this.Long = Long;
        this.Width = Width;
        this.High = High;
    }

    /**
     * @return the High
     */
    public float getHigh() {
        return High;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @return the Long
     */
    public float getLong() {
        return Long;
    }

    /**
     * @return the Width
     */
    public float getWidth() {
        return Width;
    }

    /**
     * @param High the High to set
     */
    public void setHigh(float High) {
        this.High = High;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @param Long the Long to set
     */
    public void setLong(float Long) {
        this.Long = Long;
    }

    /**
     * @param Width the Width to set
     */
    public void setWidth(float Width) {
        this.Width = Width;
    }
    
    
    



}
