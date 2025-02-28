/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main;

import controller.ControllerAnimal;
import view.FrmMain;

public class MateoAnimalesMongo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        FrmMain frmMain = new FrmMain();
        ControllerAnimal ctlAnimales = new ControllerAnimal(frmMain);
        frmMain.show();
        
    }
    
}
