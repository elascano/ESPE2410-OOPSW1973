
package ec.edu.espe.surefinventoryc.model;

import java.time.LocalDate;
import java.util.Date;

/**
 *
 * @author Benjamin Robalino <jabasteam>
 */
public class Invoice {
     private String invoiceNumber;
     private String customerName;
     private double amount;
     private LocalDate dueDate;
     private boolean isPaid;
     private int date; 

    public Invoice() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String toString() {
        return "Invoice{" + "invoiceNumber=" + invoiceNumber + ", customerName=" + customerName + ", amount=" + amount + ", dueDate=" + dueDate + ", isPaid=" + isPaid + ", date=" + date + '}';
    }

    public Invoice(String invoiceNumber, String customerName, double amount, String dueDate, boolean isPaid) {
        this.invoiceNumber = invoiceNumber;
        this.customerName = customerName;
        this.amount = amount;
         LocalDate LocalDate = null;
        this.dueDate = LocalDate;
        this.isPaid = isPaid;
        //algorythm to compute date
        this.date=3;
    }
     
     public int computeDate(Date Date){
//TODO code this
         Date  = new Date();
         Date date;
         return 0;
         
     }

    /**
     * @return the invoiceNumber
     */
    public String getInvoiceNumber() {
        return invoiceNumber;
    }

    /**
     * @param invoiceNumber the invoiceNumber to set
     */
    public void setInvoiceNumber(String invoiceNumber) {
        this.invoiceNumber = invoiceNumber;
    }

    /**
     * @return the customerName
     */
    public String getCustomerName() {
        return customerName;
    }

    /**
     * @param customerName the customerName to set
     */
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    /**
     * @return the amount
     */
    public double getAmount() {
        return amount;
    }

    /**
     * @param amount the amount to set
     */
    public void setAmount(double amount) {
        this.amount = amount;
    }

    /**
     * @return the dueDate
     */
    public LocalDate getDueDate() {
        return dueDate;
    }

    /**
     * @param dueDate the dueDate to set
     */
    public void setDueDate(String dueDate) {
        this.dueDate = dueDate;
    }

    /**
     * @return the isPaid
     */
    public boolean isIsPaid() {
        return isPaid;
    }

    /**
     * @param isPaid the isPaid to set
     */
    public void setIsPaid(boolean isPaid) {
        this.isPaid = isPaid;
    }

    /**
     * @return the age
     */
    public int getDate() {
        return date;
    }

    /**
     * @param date the age to set
     */
    public void setDate(int date) {
        //TODO compute this date 
        this.date = date;
    }

    
}
