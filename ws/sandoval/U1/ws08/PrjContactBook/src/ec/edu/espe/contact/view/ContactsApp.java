package ec.edu.espe.contact.view;

import ec.edu.espe.contact.model.Contact;
import java.util.Date;

/**
 *
 * @author Andres Sandoval
 */
public class ContactsApp {
    public static void main(String[] args){
        System.out.println("Contact book from Andres Sandoval");
        
         int id;
         String name;
         Date birthDate;
         String email;
         int numberOfMutualFriends;
         int numberOfOtherFriends;
         int totalFriends;
         
         id = 1;
         name = "Andres";
         birthDate = new Date(2003, 12, 26);
         email = "Andres1S1@hotmail.com";
         numberOfMutualFriends = 10;
         numberOfOtherFriends = 5;
         totalFriends = numberOfMutualFriends + numberOfOtherFriends;
         
         Contact contact = new Contact(id, name, birthDate, email, numberOfMutualFriends, numberOfOtherFriends);
        
         System.out.println("My First contact is -->\n" + contact);
         
         System.out.println("The number of friends is --->" + computeTotalFriends(numberOfMutualFriends, numberOfOtherFriends));
         
         System.out.println("Total -->");
    }
    
    public static int computeTotalFriends(int numberOfMutualFriends, int numberOtherFriends){
        int total;
        total = numberOfMutualFriends + numberOtherFriends;
        return total;
        
        
    }
    
}
