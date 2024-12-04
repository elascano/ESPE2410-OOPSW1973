

package ec.edu.espe.reverseengineering.model;

/**
 *
 * @author Benjamin Robalino <jabasteam>
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
    public int getA() {
        return a;
    }

    /**
     * @param a the a to set
     */
    public void setA(int a) {
        this.a = a;
    }

    /**
     * @return the b
     */
    public B getB() {
        return b;
    }

    /**
     * @param b the b to set
     */
    public void setB(B b) {
        this.b = b;
    }
}
