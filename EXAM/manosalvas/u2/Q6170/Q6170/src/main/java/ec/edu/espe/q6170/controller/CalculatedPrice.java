package ec.edu.espe.q6170.controller;

/**
 *
 * @author G406
 */
public class CalculatedPrice {
    public static int calculedPrice(int price, int time){
        int totalPrice = 0;
        
        totalPrice = price * time;
        
        return totalPrice;
    }
}
