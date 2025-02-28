package ec.edu.espe.stockbill.controller;

import ec.edu.espe.stockbill.model.Customer;
import ec.edu.espe.stockbill.model.CustomersRecord;
import ec.edu.espe.stockbill.model.Inventory;
import ec.edu.espe.stockbill.model.Product;
import ec.edu.espe.stockbill.model.ProfilesRecord;
import ec.edu.espe.stockbill.model.Supplier;
import ec.edu.espe.stockbill.model.SuppliersRecord;
import ec.edu.espe.stockbill.model.Voucher;
import java.util.ArrayList;

/**
 *
 * @author Lucas Gongora
 */
public class SaleController {

    private ProfilesRecord profilesRecord;
    private Supplier supplier;
    private CustomersRecord customersRecord;
    private Inventory inventory;
    private ArrayList<Product> shoppingCart;
    private ArrayList<Product> inventoryForSale;
    private Customer customer;
    private Voucher voucher;

    public SaleController() {
        customer = null;
        profilesRecord = new ProfilesRecord();
        supplier = profilesRecord.getBySupplier();
        customersRecord = new CustomersRecord();
        inventory = new Inventory();
        shoppingCart = new ArrayList<>();
        inventoryForSale = new ArrayList<>();
    }

    public void getCustomer(String id) {

        this.customer = customersRecord.findCustomerById(id);
        if (customer != null) {

            inventoryForSale = inventory.updateInventoryByTypeCustomer(customer.getType());
        }

    }
    
    public void addProduct(String id){
        
    }

}
