package ec.edu.espe.reverseengineering.model;

/**
 *
 * @author Andrés Espinosa
 */
public class D {

    @Override
    public String toString() {
        return "D{" + '}';
    }
    
    
    public E m(){
        System.out.println("retirm E from D,");
        return new E(5, 0.1F, 'a', "Hola");
    }
}
