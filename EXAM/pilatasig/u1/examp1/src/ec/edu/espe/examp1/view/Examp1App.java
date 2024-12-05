package ec.edu.espe.examp1.view;

import ec.edu.espe.examp1.model.Goalkeeper;
import util.JSONHandler;
import java.util.ArrayList;
import java.util.Scanner;

public class Examp1App {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        JSONHandler jsonHandler = new JSONHandler("people.json");
        ArrayList<Goalkeeper> people = jsonHandler.readFromJSON();
        String stillAdding;
        boolean found;
        found= false;
        do {
            System.out.println("Do you want to add a GoalKeeper? (Select the number)");
            System.out.println("1. Yes");
            System.out.println("2. No");
            stillAdding = scan.nextLine();

            while (!stillAdding.equals("1") && !stillAdding.equals("2")) {
                System.out.println("Invalid option, please select 1 or 2");
                stillAdding = scan.nextLine();
            }

            if (stillAdding.equals("1")) {
                System.out.println("Insert name: ");
                String name = scan.nextLine();

                System.out.println("Insert the team: ");
                String team = scan.nextLine();
                
                System.out.println("Insert idCard: ");
                String idCard = scan.nextLine();
                
                System.out.println("Insert the age: ");
                int age = scan.nextInt();

                Goalkeeper person = new Goalkeeper(name, name, idCard, age);
                people.add(person);
                System.out.println("Person added!!");
            }
        } while (stillAdding.equals("1"));
        
        

        jsonHandler.writeToJSON(people); 
        System.out.println("Data saved!");

        for (Goalkeeper person : people) {
            System.out.println(person);
            
            
            
            
        }
    }
}
