/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main;

import controlador.ctl_animales;
import vista.frm_main;

public class MateoAnimalesMongo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        frm_main frmMain = new frm_main();
        ctl_animales ctlAnimales = new ctl_animales(frmMain);
        frmMain.show();
        
    }
    
}
