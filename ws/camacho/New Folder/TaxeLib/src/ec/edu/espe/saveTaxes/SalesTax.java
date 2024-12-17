package ec.edu.espe.saveTaxes;

/**
 *
 * @author mateo
 */
public class SalesTax {
    public float computeIva(float amount, float ivaPercentage){
        float tax;
        tax = amount * ivaPercentage/100;
        return tax;
    } 
    
    public static float computeIce(){
        return 0.0F;
    }
}
