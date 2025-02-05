package ec.edu.espe.salestaxes;

/**
 *
 * @author Matias Rojas
 */
public class SalesTax {
    
    public static float computeIva(float amount, float ivaPercentage){
        float tax;
        tax = amount * ivaPercentage/100;
        return tax;
               
    }
    
    public static float computeIce(){
        //TODO compute ice and complete the parameters of this method 
        return 0.0F;
    }
    
    
}
