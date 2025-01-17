package ec.espe.edu.calculator.model;

/**
 *
 * @author LABS-DCCO
 */
public class BasicOperation {
    private float term1;
    private float term2;

    public BasicOperation(float num1, float num2) {
        this.term1 = num1;
        this.term2 = num2;
    }

    @Override
    public String toString() {
        return "BasicOperation{" + "num1=" + getTerm1() + ", num2=" + getTerm2() + '}';
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
