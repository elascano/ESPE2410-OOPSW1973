
package ec.edu.espe.salestaxes;

/**
 *
 * @author Esteban Quiroga 
 */
public class SalesTax {   
    
    public static float computeIva(float amount, float ivaPercentage){
        float tax;
        tax = amount * ivaPercentage/100;
        return tax;       
    }
    
    public static float computeIce(){
        //TODO compute Ice and complete parameters of this method
        return 0.0F;
    }
    
    
}
