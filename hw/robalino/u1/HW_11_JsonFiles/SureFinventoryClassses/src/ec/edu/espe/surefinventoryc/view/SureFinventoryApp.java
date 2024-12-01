package ec.edu.espe.surefinventoryc.view;

import ec.edu.espe.surefinventoryc.model.Invoice;

/**
 *
 * @author Benjamin Robalino <jabasteam>
 */
public class SureFinventoryApp {

    public static void main(String[] args, String Benjamin) {
        System.out.println("Benjamin's SureFinventoryApp");
        Invoice invoice;
       
        String customerName="Benjamin";
        double amount=12.54; 
        
        invoice = new Invoice();
        
        System.out.println("Invoice-->" + invoice);
        System.out.println("CustomerName-->" + invoice.getCustomerName() );
        
        invoice.setAmount(12.54);
        invoice.setCustomerName(Benjamin);
    }
}
