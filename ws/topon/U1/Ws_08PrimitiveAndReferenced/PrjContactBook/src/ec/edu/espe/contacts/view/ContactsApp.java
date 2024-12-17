package ec.edu.espe.contacts.view;

import ec.edu.espe.contacts.model.Contact;
import java.util.Date;

/**
 *
 * @author Mateo Topon
 */
public class ContactsApp {
    public static void main(String[] args) {
        System.out.println("Contact Book From Mateo Topon");
        
        int id;
        String name;
        Date birthDate;
        String email;
        int numberOfMutualFriends;
        int numberOfOtherFriends;
        int totalFriends;
        
        id=1;
        name="Mateo";
        birthDate = new Date(2003, 5, 9);
        email = "jmtopon@espe.edu,ec";
        numberOfMutualFriends = 24;
        numberOfOtherFriends = 6;
        totalFriends = numberOfMutualFriends + numberOfOtherFriends;
    
        Contact contact = new Contact(id, name, birthDate, email, numberOfMutualFriends, numberOfOtherFriends);
        System.out.println("My first contact is --> \n" +contact);
        
        System.out.println("The total number of friends is --> " +computeTotalFriends(numberOfMutualFriends, numberOfOtherFriends));
        
    }
   
     public static int computeTotalFriends(int numberOfMutualFriends, int numberOfOtherFriends){
        int total;
        total = numberOfMutualFriends + numberOfOtherFriends;
        return total;
    }
    
}
