package ec.edu.espe.contacts.view;

import ec.edu.espe.contacts.model.Contact;
import java.util.Date;

/**
 *
 * @author David Cuichan
 */
public class ContactsApp {
    public static void main(String[] args) {
        System.out.println("--> Contact Book from David Cuichan <--");
        
        int id;
        String name;
        Date birthDate;
        String email;
        int numberOfMutualfriends;
        int numberOfOtherFriends;
        int totalFriends;
        
        id = 1;
        name = "David Cuichan";
        birthDate = new Date(2002,11,22);
        email = "hdcuichan@espe.edu.ec";
        numberOfMutualfriends = 23;
        numberOfOtherFriends = 5;
        totalFriends = numberOfMutualfriends + numberOfOtherFriends;
        
        Contact contact = new Contact(id,name,birthDate,numberOfMutualfriends,numberOfOtherFriends);
        System.out.println("My 1st contact is -->\n" + contact);
        
        System.out.println("The total number of friends is --> " + computeTotalFriends(numberOfMutualfriends,numberOfOtherFriends));
        System.out.println("The total number of friends is --> " + totalFriends);
    }

    public static int computeTotalFriends(int numberOfMutualfriends, int numberOfOtherFriends){
        int total;
        total = numberOfMutualfriends + numberOfOtherFriends;
        return total;
    }
    
    public static void changeContact(Contact contact){
        
    }
}
