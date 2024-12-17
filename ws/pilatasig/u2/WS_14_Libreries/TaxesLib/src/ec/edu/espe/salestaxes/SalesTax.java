
package ec.edu.espe.salestaxes;

/**
 *
 * @author David Pilatasig
 */
public class SalesTax{
    public static float computeIva(Float amount, float ivaPercentage){
        float tax;
        tax=amount*ivaPercentage/100;
        return tax;
    }
    
    public static float computeIce(){
        //TODO compute Ice and complete the parameters of this method
        return 0F;
    }
    
}
