package ec.edu.espe.reverseenginering.model;

/**
 *
 * @author Jose Leiton
 */
public class D {

    @Override
    public String toString() {
        return "D{" + '}';
    }
    
    public E m(){
        System.out.println("return E from D.m()");
        return new E(5, 0.1F, 'a', "Hola Leiton");
    }
}
