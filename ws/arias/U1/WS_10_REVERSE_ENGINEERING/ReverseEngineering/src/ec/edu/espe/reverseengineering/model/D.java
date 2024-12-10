
package ec.edu.espe.reverseengineering.model;

/**
 *
 * @author Alan Arias
 */
public class D {

    @Override
    public String toString() {
        return "D{" + '}';
    }
    
   
    
    public E m(){
        System.out.println("return E from D.m()");
        return new E(0, 0.1F, 'a', "Hola");
    }    
}
