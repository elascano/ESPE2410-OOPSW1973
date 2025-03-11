
package ec.edu.espe.interestrate.model;

import org.bson.Document;

/**
 *
 * @author gustavo
 */
public class Investment {
    private String id;
    private String monto;
    private String tiempo;
    private final double tasaInteres = 7.6;
    
    public Investment(String id, String monto, String tiempo) {
        this.id = id;
        this.monto = monto;
        this.tiempo = tiempo;
    }
    
    public Document toDocument() {
        return new Document("id", id)
                .append("monto", monto)
                .append("tiempo", tiempo)
                .append("tasaInteres", tasaInteres);
    }
}

