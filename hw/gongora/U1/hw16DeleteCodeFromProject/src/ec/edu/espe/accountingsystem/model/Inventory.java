package ec.edu.espe.accountingsystem.model;

import java.util.ArrayList;

/**
 *
 * @author Sebastian Charij
 * @author Lucas Gongora
 */
public class Inventory {

    private ArrayList<Product> products;

    @Override
    public String toString() {
        return "Inventory{" + "products=" + products + '}';
    }

    public Inventory(ArrayList<Product> products) {
        this.products = products;
    }
    
    public void add(Product product){
        //TODO algorithm
    }
    
    public void delete(String productId){
        //TODO algorithm
    }
    
    public void update(String productId){
        //TODO algorithm
    }

    
    
}
