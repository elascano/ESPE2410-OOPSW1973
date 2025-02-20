/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.hwUstax.model;

/**
 *
 * @author Lisbeth Tipan
 */
public class USTax {
    
    private static USTax instance;
    private double taxRate = 0.15; 


    private USTax() {}

    // Método estático para obtener la única instancia de USTax (Singleton)
    public static USTax getInstance() {
        if (instance == null) {
            instance = new USTax();
        }
        return instance;
    }

    public float calculateTax(float saleAmount) {
        return (float) (saleAmount * taxRate);
    }

    public float salesTotal(float saleAmount) {
        return saleAmount + calculateTax(saleAmount);
    }

}
