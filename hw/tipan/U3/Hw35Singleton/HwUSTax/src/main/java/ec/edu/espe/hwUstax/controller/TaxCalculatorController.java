/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.hwUstax.controller;

import ec.edu.espe.hwUstax.model.USTax;
import ec.edu.espe.hwUstax.view.FrmUSTax;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author Lisbeth Tipan
 */
public class TaxCalculatorController {
    private USTax taxModel;
    private FrmUSTax frmUSTax;


    public TaxCalculatorController(USTax taxModel, FrmUSTax frmUSTax) {
        this.taxModel = taxModel;
        this.frmUSTax = frmUSTax;

    
      this.frmUSTax.addCalculateListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calculateAndDisplayTax();  
            }
        });
    }

    private void calculateAndDisplayTax() {

     
        String saleAmountStr = frmUSTax.getSaleAmount();  // Se obtiene el monto ingresado

        if (saleAmountStr == null || saleAmountStr.isEmpty()) {
            JOptionPane.showMessageDialog(frmUSTax, "Por favor ingrese un monto válido", "Error", JOptionPane.ERROR_MESSAGE);
            return;  
        }

    try {
        float saleAmount = Float.parseFloat(saleAmountStr);
        if (saleAmount < 0) {
            JOptionPane.showMessageDialog(frmUSTax, "El monto no puede ser negativo", "Error", JOptionPane.ERROR_MESSAGE);
            return; 
        }
        float taxAmount = taxModel.calculateTax(saleAmount);
        float totalAmount = taxModel.salesTotal(saleAmount);

        frmUSTax.showResult(saleAmount, taxAmount, totalAmount);
    } catch (NumberFormatException ex) {
   
        JOptionPane.showMessageDialog(frmUSTax, "Ingrese un número válido.", "Error", JOptionPane.ERROR_MESSAGE);
    }
    } 
}
