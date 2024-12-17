package ec.edu.espe.salestaxes;

/**
 *
 * @author Lucas Gongora
 */
public class SalesTax {

    public static float computeIva(float amount, float ivaPerecentage) {
        float tax;
        tax = amount * ivaPerecentage / 100;
        return tax;
    }

    public static float computeIce() {
        //TODO compute Ice and complet the parameters of this method
        return 0.0F;
    }

}
