
package ec.edu.espe.taxes.salestaxes;

/**
 *
 * @author marlo
 */
public class SalesTax {
public static float computeIva(float ammount, float ivaPercentage){
        float tax;
        tax = ammount * ivaPercentage/100;
        return tax;
    }
public static float computeIce(){
    //TODO compute ICE
    return 0.00f;
}

}
