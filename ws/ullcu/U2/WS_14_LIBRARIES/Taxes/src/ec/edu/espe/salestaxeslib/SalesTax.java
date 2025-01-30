package ec.edu.espe.salestaxeslib;

/**
 *
 * @author Alan Arias
 */
public class SalesTax {
    public static float computeIva(float amount, float ivaPercentage){
        float tax;
        tax = amount * ivaPercentage/100;
        return tax;
    }
    private static float computeIce(){
        //TODO compute Ice and complete the parameters of this method
        return 0.0F;
    }
}
