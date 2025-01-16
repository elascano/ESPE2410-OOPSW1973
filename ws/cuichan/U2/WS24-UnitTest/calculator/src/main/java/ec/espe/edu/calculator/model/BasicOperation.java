package ec.espe.edu.calculator.model;

/**
 *
 * @author LABS-DCCO
 */
public class BasicOperation {
    private float num1;
    private float num2;

    public BasicOperation(float num1, float num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    @Override
    public String toString() {
        return "BasicOperation{" + "num1=" + getNum1() + ", num2=" + getNum2() + '}';
    }

    /**
     * @return the num1
     */
    public float getNum1() {
        return num1;
    }

    /**
     * @param num1 the num1 to set
     */
    public void setNum1(float num1) {
        this.num1 = num1;
    }

    /**
     * @return the num2
     */
    public float getNum2() {
        return num2;
    }

    /**
     * @param num2 the num2 to set
     */
    public void setNum2(float num2) {
        this.num2 = num2;
    }
}
