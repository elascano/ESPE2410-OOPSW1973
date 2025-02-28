
package surefinventory;

/**
 *
 * @author Benjamin Robalino <jabasteam>
 */
public class Invoice {
      private String invoiceNumber;
    private String customerName;
    private double amount;
    private String dueDate;
    private boolean isPaid;

    public Invoice(String invoiceNumber, String customerName, double amount, String dueDate, boolean isPaid) {
        this.invoiceNumber = invoiceNumber;
        this.customerName = customerName;
        this.amount = amount;
        this.dueDate = dueDate;
        this.isPaid = isPaid;
    }
}
