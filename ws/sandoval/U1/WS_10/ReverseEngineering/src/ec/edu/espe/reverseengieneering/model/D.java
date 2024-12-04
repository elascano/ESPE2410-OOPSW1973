package ec.edu.espe.reverseengieneering.model;

/**
 *
 * @author Andres Sandoval
 */
public class D {

    @Override
    public String toString() {
        return "D{" + '}';
    }
    
    
    
    public E m(){
        System.out.println("Return E from D.m");
        return new E(5, 0.1F, 'a', "Hello Andrew");
    }
}
