package ec.edu.espe.farmsimulator.view;

import ec.edu.espe.farmsimulator.model.Chicken;
import ec.edu.espe.farmsimulator.utils.JsonForm;
import java.util.Date;
import javax.swing.SwingUtilities;
import java.util.Scanner;

/**
 *
 * @author Esteban Quiroga
 */
public class FarmSimulatorApp {
    
    
    public static void main(String[] args) {
        
        Menu mainMenu = new Menu();
        
        mainMenu.initMainMenu();
        
        int menuOption = 0;

        
        do{

            menuOption = mainMenu.selectMenuOption(menuOption, mainMenu);        


                switch (menuOption){
                    case 1: mainMenu.initCase1();
                    break;

                    case 2: mainMenu.initCase2();
                    break;
                    
                    case 3:
                    break;

                }
            }while(menuOption!=3);
    }
}
