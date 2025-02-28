package ec.edu.espe.farmsimulator.view;

import ec.edu.espe.farmsimulator.model.Chicken;
import ec.edu.espe.farmsimulator.utils.JsonForm;
import java.util.Date;
import java.util.Scanner;
import java.util.Set;
import javax.swing.SwingUtilities;

/**
 *
 * @author Esteban Quiroga
 */
public class Menu {
    int option;

    public int getOption() {
        return option;
    }

    public void setOption(int option) {
        this.option = option;
    }
    
    
    
    public void initMainMenu (){
        System.out.println("Welcome to Esteban's Chicken Farm Simulator \n"
            +"1. Create new Json chicken. \n"
            + "2. Start Chicken Farm Simulator! \n"
            + "3. Exit");
    }
    
    public int selectMenuOption(int menuOption, Menu menu){
   
        Scanner scanner = new Scanner(System.in);
        int option = menu.getOption();
        option = scanner.nextInt();
        menu.setOption(option);
        
        return menuOption = menu.getOption();
            
    }
    
    public void initCase1(){
        SwingUtilities.invokeLater(() -> {
                JsonForm formulario = new JsonForm();
                formulario.setVisible(true); 
            });
    }
    
    public void initCase2(){
        System.out.println("Esteban's Chicken Farm Simulator!");

            Chicken chicken;
            int id=1;
            String name="Lucy";
            String color="white";
            Date bornOnDate=new Date(123, 1, 2);
            boolean notMolting=false;
            int ageInMonths = 5;
            chicken = new Chicken(id, name, color, bornOnDate, notMolting,ageInMonths);

            System.out.println("chicken --> " + chicken);
            System.out.println("chicken id --> " + chicken.getId());

            chicken.setId(1);
            chicken.setName("Maruja");
    }
}
