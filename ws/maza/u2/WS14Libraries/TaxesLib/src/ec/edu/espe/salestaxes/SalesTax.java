package ec.edu.espe.salestaxes;

/**
 *
 * @author Alexander Maza
 */
public class SalesTax {

    public static float computeIva(float amount, float ivaPercentage) {
        //static for methods no necesito instanciar para usarlo
        //static en variables todos los tipos tienen ese valor
        float tax;
        tax = amount * ivaPercentage / 100;
        return tax;
    }

    public static float computeIce(){
        //TODO compute Ice and complete the parameters of this method
        return 0.0F;
    }
    
    
    
}
