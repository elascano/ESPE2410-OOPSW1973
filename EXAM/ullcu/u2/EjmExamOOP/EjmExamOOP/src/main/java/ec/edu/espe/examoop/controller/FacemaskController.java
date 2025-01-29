/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.examoop.controller;

import ec.edu.espe.examoop.model.Facemask;
import ec.edu.espe.examoop.utils.CloudDB;
import javax.swing.JOptionPane;

/**
 *
 * @author Alexander Ullco
 */
public class FacemaskController {
    CloudDB cloudDB = new CloudDB();

    public void addCustomerToDB(Facemask customer){
        cloudDB.uploadCustomerData(customer);
        JOptionPane.showMessageDialog(null, "Mascara Agregada Correctamente");
    }
}
