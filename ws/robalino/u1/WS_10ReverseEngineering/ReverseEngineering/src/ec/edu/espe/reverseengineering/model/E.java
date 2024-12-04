

package ec.edu.espe.reverseengineering.model;

/**
 *
 * @author Benjamin Robalino <jabasteam>
 */
public class E {
   private int a;
   private float f;
   private char c;
   private String s;

    @Override
    public String toString() {
        return "E{" + "a=" + a + ", f=" + f + ", c=" + c + ", s=" + s + '}';
    }

    public E(int a, float f, char c, String s) {
        this.a = a;
        this.f = f;
        this.c = c;
        this.s = s;
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
     * @return the f
     */
    public float getF() {
        return f;
    }

    /**
     * @param f the f to set
     */
    public void setF(float f) {
        this.f = f;
    }

    /**
     * @return the c
     */
    public char getC() {
        return c;
    }

    /**
     * @param c the c to set
     */
    public void setC(char c) {
        this.c = c;
    }

    /**
     * @return the s
     */
    public String getS() {
        return s;
    }

    /**
     * @param s the s to set
     */
    public void setS(String s) {
        this.s = s;
    }
   
}
