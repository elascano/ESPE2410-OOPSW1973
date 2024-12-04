package practicas.crud2;

import java.util.ArrayList;
import java.util.Scanner;

public class PracticasCRUD2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        JSONHandler jsonHandler = new JSONHandler("people.json");
        ArrayList<Person> people = jsonHandler.readFromJSON();
        String stillAdding;
        boolean found;
        found= false;
        do {
            System.out.println("Do you want to add a Person? (Select the number)");
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

                System.out.println("Insert direction: ");
                String direction = scan.nextLine();

                System.out.println("Insert phoneNumber: ");
                String phoneNumber = scan.nextLine();

                System.out.println("Insert idCard: ");
                String idCard = scan.nextLine();

                Person person = new Person(name, direction, idCard, phoneNumber);
                people.add(person);
                System.out.println("Person added!!");
            }
        } while (stillAdding.equals("1"));
        
        do{
            System.out.println("Do you want to change the data of a person? (Select the number)");
            System.out.println("1. Yes");
            System.out.println("2. No");
            stillAdding = scan.nextLine();

            while (!stillAdding.equals("1") && !stillAdding.equals("2")) {
                System.out.println("Invalid option, please select 1 or 2");
                stillAdding = scan.nextLine();
            }
            
            if (stillAdding.equals("1")){
                System.out.println("Write the Id: ");
                String searchId=scan.nextLine();
                for(Person person:people){
                    if (searchId.equalsIgnoreCase(person.getIdCard())){
                        found=true;
                        System.out.println("Change direction: ");
                        String direction=scan.nextLine();
                        person.setDirection(direction);
                        System.out.println("Change phone: ");
                        String phoneNumber=scan.nextLine();
                        person.setPhoneNumber(phoneNumber);
                    }
                }
                if (!found){
                    found=false;
                    System.out.println("The person does exist.");
                }
            }
        }while(stillAdding.equals("1"));
        

        jsonHandler.writeToJSON(people);  // Guardar en JSON
        System.out.println("Data saved!");

        for (Person person : people) {
            System.out.println(person);
            
            
            
            
        }
    }
}
