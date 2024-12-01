
package ec.edu.espe.surefinventoryc.model;

/**
 *
 * @author Benjamin Robalino <jabasteam>
 */
import com.google.gson.Gson;
import java.io.FileWriter;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InvoiceDataSaver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Invoice> invoices = new ArrayList<>();
        Gson gson = new Gson();

        while (true) {
            System.out.print("Enter Invoice Number: ");
            String invoiceNumber = scanner.nextLine();

            System.out.print("Enter Customer Name: ");
            String customerName = scanner.nextLine();

            System.out.print("Enter Amount: ");
            double amount = Double.parseDouble(scanner.nextLine());

            System.out.print("Enter Due Date (YYYY-MM-DD): ");
            String dueDate = scanner.nextLine();

            System.out.print("Is the Invoice Paid? (true/false): ");
            boolean isPaid = Boolean.parseBoolean(scanner.nextLine());

            invoices.add(new Invoice(invoiceNumber, customerName, amount, dueDate, isPaid));

            System.out.print("Do you want to add another invoice? (yes/no): ");
            String response = scanner.nextLine();
            if (!response.equalsIgnoreCase("yes")) {
                break;
            }
        }

        try (FileWriter writer = new FileWriter("invoices.json")) {
            gson.toJson(invoices, writer);
        } catch (Exception e) {
            e.printStackTrace();
        }

        try (FileReader reader = new FileReader("invoices.json")) {
            Invoice[] loadedInvoices = gson.fromJson(reader, Invoice[].class);
            for (Invoice invoice : loadedInvoices) {
                System.out.println(invoice);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

class Invoice {
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

    @Override
    public String toString() {
        return "Invoice{" +
                "invoiceNumber='" + invoiceNumber + '\'' +
                ", customerName='" + customerName + '\'' +
                ", amount=" + amount +
                ", dueDate='" + dueDate + '\'' +
                ", isPaid=" + isPaid +
                '}';
    }
}
