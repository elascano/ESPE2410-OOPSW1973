package ec.edu.espe.readandaddobjects.view;

import ec.edu.espe.readandaddobjects.model.Goalkeeper;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import utils.GoalkeeperManager;
/**
 *
 * @author David Pilatasig
 */
public class ReadAndAddObjectsApp {
    public static void main(String[] args){
        Scanner scan= new Scanner(System.in);
        List<Goalkeeper> goalkeepers= new ArrayList<>();
        boolean isRunning= true;
        Goalkeeper goalkeeper;
        
         do{
             printMainMenu();
             int stillAdding=scan.nextInt();
             
             while (stillAdding<=0 || stillAdding>3) {
                System.out.println("Invalid option, please select a valid option");
                stillAdding = scan.nextInt();
                }
             
             switch(stillAdding){
                 case 1:
                     goalkeeper=createGoalkeeper();
                     goalkeepers.add(goalkeeper);
                     GoalkeeperManager.writeGoalkeepers(goalkeepers);
                     System.out.println("New goalkeeper was added and recording successfully!!");
                     System.out.println("New goalkeeper: \n" + goalkeeper);
                 break;
                   
                 case 2:
                     List<Goalkeeper> readGoalkeeper= GoalkeeperManager.readGoalkeepers();
                     System.out.println("\n--- Saved Goalkeepers ---");
                     if(readGoalkeeper.isEmpty()){
                         System.out.println("There are not saved goalkeepers yet");
                     }else{
                         for(Goalkeeper gk: readGoalkeeper){
                             System.out.println(gk);
                         }
                     }
                 break;
                 
                 case 3:
                     isRunning=false;
                     System.out.println("Thanks for use this program");
                 break;
            }
         }while(isRunning);
    }
    
    private static void printMainMenu(){
        System.out.println("Welcome to Goalkeepers Manager System");
        System.out.println("1. Add a goalkeeper");
        System.out.println("2. Read list of goalkeepers");
        System.out.println("3. Exit");
        System.out.println("Select an option: (Select the number)");
    }
    
    private static Goalkeeper createGoalkeeper(){
        Scanner scan= new Scanner(System.in);
        
        System.out.println("\n--- Add new Goalkeeper ---");
        System.out.println("Enter name: ");
        String name= scan.nextLine();
        System.out.println("Enter Team: ");
        String team= scan.nextLine();
        System.out.println("Enter ID card: ");
        String idCard=scan.nextLine();
        System.out.println("Enter age: ");
        int age= scan.nextInt();
        
        Goalkeeper goalkeeper= new Goalkeeper(name, team, idCard, age);
        return goalkeeper;
    }
}
