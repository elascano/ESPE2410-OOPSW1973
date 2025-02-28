/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main;

import controlador.ctl_estudiante;
import vista.frm_main;

public class MateoEstudianteMongo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {


        frm_main frmMain = new frm_main();
        ctl_estudiante ctlEstudiante = new ctl_estudiante(frmMain);
        
        frmMain.show();
                
        
    }
    
}
