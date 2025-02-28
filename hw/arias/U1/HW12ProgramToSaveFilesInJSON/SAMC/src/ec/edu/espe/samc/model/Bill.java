package ec.edu.espe.samc.model;

/**
 *
 * @author Alan
 */
public class Bill {
    private Customer customer;
    private long numberOfBill;
    private float total;

    public Bill(Customer customer, long numberOfBill, float total) {
        this.customer = customer;
        this.numberOfBill = numberOfBill;
        this.total = total;
    }
    
    
    
}
