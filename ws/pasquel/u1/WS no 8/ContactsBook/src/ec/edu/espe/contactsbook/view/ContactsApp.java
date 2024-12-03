package ec.edu.espe.contactsbook.view;

import ec.edu.espe.contactsbook.model.Contact;
import java.util.Date;

/**
 *
 * @author Marlon Pasquel
 */
public class ContactsApp {
    public static void main(String[] args) {
        System.out.println("Contact Book by Marlon Pasquel");
    
    int id;
    String name;
    Date birthDate;
    String email;
    int numberOfMutualFriends;
    int numberOfOtherFriends;
    int totalFriends;
    
    id = 1;
    name = "Marlon Pasquel";
    birthDate = new Date(2004, 2, 22);
    email = "mapasquel1@espe.edu.ec";
    numberOfMutualFriends = 23;
    numberOfOtherFriends = 5;
    totalFriends = numberOfMutualFriends + numberOfOtherFriends;
    
   /* Contact contact = new Contact(id, name, birthDate, email, numberOfMutualFriends, numberOfOtherFriends, totalFriends);
           
        System.out.println("My first contact is --> \n"+ contact);
   //     int total = computeTotalFriends(numberOfMutualFriends, numberOfOtherFriends);*/
        System.out.println("The total number of friends is --> " + computeTotalFriends(numberOfMutualFriends, numberOfOtherFriends));
        
            
    }
    
    public static int computeTotalFriends (int numberOfMutualFriends, int numberOfOtherFriends){
        int total;
        total = numberOfMutualFriends + numberOfOtherFriends;       
        return total; 
    }
}
