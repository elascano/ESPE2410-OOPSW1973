package ec.edu.espe.reverseEngineering.model;

/**
 *
 * @author David Cuichan
 */
public class E {
    private int a;
    private float f;
    private char c;
    private String s;

    public E(int a, float f, char c, String s) {
        this.a = a;
        this.f = f;
        this.c = c;
        this.s = s;
    }

    @Override
    public String toString() {
        return "E{" + "a=" + a + ", f=" + f + ", c=" + c + ", s=" + s + '}';
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
     * @return the f
     */
    private float getF() {
        return f;
    }

    /**
     * @param f the f to set
     */
    private void setF(float f) {
        this.f = f;
    }

    /**
     * @return the c
     */
    private char getC() {
        return c;
    }

    /**
     * @param c the c to set
     */
    private void setC(char c) {
        this.c = c;
    }

    /**
     * @return the s
     */
    private String getS() {
        return s;
    }

    /**
     * @param s the s to set
     */
    private void setS(String s) {
        this.s = s;
    }
    
    
}
