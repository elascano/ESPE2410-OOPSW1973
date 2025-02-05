
package ec.edu.espe.salestaxes;

/**
 *
 * @author USUARIO
 */
public class SalesTax {
    
public static float computeIva(float amount, float ivaPercentage){
    float tax;
    tax = amount * ivaPercentage/100;
    return tax;
}

public static float computeIce(){
    //TODO compute Ice and complet the parameters of this methos 
    return 0.0F;
}

}
