
package espe.edu.ec.model;

/**
 *
 * @author denni
 */
public class Invoice {
    String budgetId;
    String description;
    double estimatedAmount;
    double iva = 0.0;
    Date creationDate;
    Date dueDate;
    String status;
    int totalProducts;
    double totalCost;
    double totalExpense;
    double subtotal;
    double totalAmount;
    
}
