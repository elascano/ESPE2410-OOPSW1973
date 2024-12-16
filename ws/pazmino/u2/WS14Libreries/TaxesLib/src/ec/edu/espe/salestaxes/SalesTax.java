package ec.edu.espe.salestaxes;

/**
 *
 * @author Brandon Pazmino
 */
public class SalesTax {
    public float computeIva(float amount, float ivaPercentage){
        float tax;
        tax = amount * ivaPercentage/100;
        return tax;
    }
            

}
