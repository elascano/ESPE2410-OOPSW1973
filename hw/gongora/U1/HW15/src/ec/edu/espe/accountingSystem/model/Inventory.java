package ec.edu.espe.accountingSystem.model;

import ec.edu.espe.accountingSystem.model.Product;
import java.util.ArrayList;

/**
 *
 * @author Lucas Gongora
 * @version 0.1.0
 * @since 2024
 */
public class Inventory {

    private ArrayList<Product> productos;

    /**
     * @return the productos
     */
    public ArrayList<Product> getProductos() {
        return productos;
    }

    /**
     * @param productos the productos to set
     */
    public void setProductos(ArrayList<Product> productos) {
        this.productos = productos;
    }
    
    public void add (Product product){
        //TODO algorithm
    }
    
    public void delete(int productId){
        //TODO algorithm
    }
    public void update(int productId){
        //TODO algorithm
    }

}
