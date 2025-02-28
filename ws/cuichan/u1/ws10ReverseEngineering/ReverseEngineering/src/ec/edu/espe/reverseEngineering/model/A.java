package ec.edu.espe.reverseEngineering.model;

/**
 *
 * @author David Cuichan
 */
public class A {
    private int a;
    private B b;

    @Override
    public String toString() {
        return "A{" + "a=" + a + ", b=" + b + '}';
    }

    public A(int a, B b) {
        this.a = a;
        this.b = b;
    }

    /**
     * @return the a
     */
    private int getA() {
        return a;
    }

    /**
     * @param a the a to set
     */
    private void setA(int a) {
        this.a = a;
    }

    /**
     * @return the b
     */
    private B getB() {
        return b;
    }

    /**
     * @param b the b to set
     */
    private void setB(B b) {
        this.b = b;
    }
}
