/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main;

import Controller.Student;
import View.FrmMain;

public class MateoEstudianteMongo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {


        FrmMain frmMain = new FrmMain();
        Student ctlEstudiante = new Student(frmMain);
        
        frmMain.show();
                
        
    }
    
}
