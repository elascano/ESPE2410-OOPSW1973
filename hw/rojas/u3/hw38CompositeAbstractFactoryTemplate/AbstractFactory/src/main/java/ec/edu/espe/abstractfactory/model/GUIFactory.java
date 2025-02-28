/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.abstractfactory.model;

import utils.ConfigFileReader;

/**
 *
 * @author USUARIO
 */
public abstract class GUIFactory {
     public static GUIFactory getFactory(){
        int sys = ConfigFileReader.readFromConfigFile("OS_TYPE");
        if(sys==0)
            return(new WinFactory());
        else
            return(new LinuxFactory());
    }
    
    public abstract Button createButton();
    public abstract Menu createMenu();
}
