package ec.edu.espe.contacts.view;

import ec.edu.espe.contacts.model.Contact;
import java.util.Date;

/**
 *
 * @author Alexander Maza
 */
public class ContactsApp {
    public static void main(String[] args) {
        System.out.println("Contact Book from Alexander Maza");
            
    int id;
    String name;
    Date birthDate;
    String email;
    int numberOfMutualFriends;
    int numberOfOtherFriends;
    int totalFriends;

    id = 1;
    name = "Alexander";
    birthDate = new Date(2005, 12, 16);
    email= "jamaza6@espe.edu.ec";
    numberOfMutualFriends = 23;
    numberOfOtherFriends = 5;
    totalFriends = numberOfMutualFriends + numberOfOtherFriends;
    Contact contact = new Contact(id, name, birthDate, email, numberOfMutualFriends, numberOfOtherFriends, totalFriends);
        System.out.println("My first contact is --> \n" + contact);
        
        System.out.println("The total number of friends is -->" + computeTotalFriends(numberOfMutualFriends, numberOfOtherFriends));
        
        System.out.println("total --> " + computeTotalFriends(numberOfMutualFriends, numberOfOtherFriends));
    }
    
    public static int computeTotalFriends(int numberOfMutualFriends, int numberOfOtherFriends){
        int total;
        total = numberOfMutualFriends + numberOfOtherFriends;
        return total;
    }
}
