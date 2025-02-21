

package ec.edu.espe.calculator.model;

/**
 *
 * @author Sebastian Charij
 */
public class BasicOperation {
    private float term1;
    private float term2;

    public BasicOperation(float term1, float term2) {
        this.term1 = term1;
        this.term2 = term2;
    }
    

    /**
     * @return the term1
     */
    public float getTerm1() {
        return term1;
    }

    /**
     * @param term1 the term1 to set
     */
    public void setTerm1(float term1) {
        this.term1 = term1;
    }

    /**
     * @return the term2
     */
    public float getTerm2() {
        return term2;
    }

    /**
     * @param term2 the term2 to set
     */
    public void setTerm2(float term2) {
        this.term2 = term2;
    }
    
    
}
