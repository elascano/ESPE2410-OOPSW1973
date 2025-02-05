package ec.edu.espe.contacts.view;

import ec.edu.espe.contacts.model.Contact;
import java.util.Date;

/**
 *
 * @author Brandon Pazmino
 */
public class ContactsApp {
    public static void main(String[] args) {
        System.out.println("Contact Book From Brandon Pazmino");
        
        int id;
        String name;
        Date birthDate;
        String email;
        int numberOfMutualFriends;
        int numberOfOtherFriends;
        int totalFriends;
        
        id=1;
        name="Brandon";
        birthDate = new Date(2005, 6, 9);
        email = "bapazmino5@espe.edu,ec";
        numberOfMutualFriends = 23;
        numberOfOtherFriends = 5;
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
