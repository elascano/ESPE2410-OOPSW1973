

package ec.edu.espe.salestaxes;

/**
 *
 * @author Benjamin Robalino <jabasteam>
 */
public class SelesTax {
    
    public static float computeIva(float amount, float ivaPercentage){
        float tax;
        tax = amount * ivaPercentage/100;
        return tax;
    }
    public static float computeIce(){
        //TODO  compute Ice and complete the parameters
        return 0.0F;
    }
}
