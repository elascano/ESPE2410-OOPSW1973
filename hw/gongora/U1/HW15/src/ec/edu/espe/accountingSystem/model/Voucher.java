package ec.edu.espe.accountingSystem.model;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Lucas Gongora
 */
public class Voucher {

    private String type;
    private int id;
    private Date issueDate;
    private ArrayList<Product> products;
    private Supplier supplier;
    private Client client;
    private float VAT;

    @Override
    public String toString() {
        return "Voucher{" + "type=" + type + ", id=" + id + ", issueDate=" + issueDate + ", products=" + products + ", supplier=" + supplier + ", client=" + client + ", VAT=" + VAT + '}';
    }

    
    public Voucher(String type, int id, Date issueDate, ArrayList<Product> products, Supplier supplier, Client client, float VAT) {
        this.type = type;
        this.id = id;
        this.issueDate = issueDate;
        this.products = products;
        this.supplier = supplier;
        this.client = client;
        this.VAT = VAT;
    }
    
    

    /**
     * @return the type
     */
    public String getType() {
        return type;
    }

    /**
     * @param type the type to set
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the issueDate
     */
    public Date getIssueDate() {
        return issueDate;
    }

    /**
     * @param issueDate the issueDate to set
     */
    public void setIssueDate(Date issueDate) {
        this.issueDate = issueDate;
    }

    /**
     * @return the products
     */
    public ArrayList<Product> getProducts() {
        return products;
    }

    /**
     * @param products the products to set
     */
    public void setProducts(ArrayList<Product> products) {
        this.products = products;
    }

    /**
     * @return the supplier
     */
    public Supplier getSupplier() {
        return supplier;
    }

    /**
     * @param supplier the supplier to set
     */
    public void setSupplier(Supplier supplier) {
        this.supplier = supplier;
    }

    /**
     * @return the client
     */
    public Client getClient() {
        return client;
    }

    /**
     * @param client the client to set
     */
    public void setClient(Client client) {
        this.client = client;
    }

    /**
     * @return the VAT
     */
    public float getVAT() {
        return VAT;
    }

    /**
     * @param VAT the VAT to set
     */
    public void setVAT(float VAT) {
        this.VAT = VAT;
    }
    
    public void calculateVAT() {
        //TODO algorithm
    }
    
    public float calculateSubtotal(){
        //TODO algorithm
        return 0;
    }
    public float calculateTotal(){
        //TODO algorithm
        return 0;
    }
}
