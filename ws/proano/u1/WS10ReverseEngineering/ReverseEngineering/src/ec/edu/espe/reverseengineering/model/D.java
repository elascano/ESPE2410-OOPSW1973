package ec.edu.espe.reverseengineering.model;

/**
 *
 * @author Esteban Quiroga
 */
public class D {

    @Override
    public String toString() {
        return "D{" + '}';
    }
    
    public E m(){
        
        System.out.println("return E from D.m()");
        return new E(5,0.1F,'a',"Joer");
    }
}
