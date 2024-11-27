package ec.edu.espe.contacts.view;

import ec.edu.espe.contacts.model.Contact;
import java.util.Date;

/**
 *
 * @author Brandon Pazmino <www.espe.edu.ec>
 */
public class ContactsApp {

    public static void main(String[] args) {
        System.out.println("Contact book from Brandon Pazmino");
        
        int id;
        String name;
        Date birthDate;
        String email;
        int numberOfMutualFriends;
        int numberOfOtherFriends;
        int totalFriends;
        id = 1;
        name = "Brandon";
        birthDate = new Date(2005, 6, 9);
        email = "bapazmino5@espe.edu.ec";
        numberOfMutualFriends = 23;
        numberOfOtherFriends = 5;
        totalFriends = numberOfMutualFriends + numberOfOtherFriends;
        
        Contact contact = new Contact(id, name, birthDate, email, numberOfMutualFriends, numberOfOtherFriends);
        System.out.println("My first Class is --> \n" + contact );
        int total = computeTotalFriends(numberOfMutualFriends, numberOfOtherFriends)
       
        System.out.println("The total number of friends is -->" + computeTotalFriends(numberOfMutualFriends, numberOfOtherFriends));
        System.out.println("");
        System.out.println("total --> " + computeTotalFriends(numberOfMutualFriends, numberOfOtherFriends));
        
        changeContact(contact);
        System.out.println("contact name -->" + contact.getName());
 
    }
    public static int computeTotalFriends(int numerOfMutualFriends,int numberOfOtherFriends){
        int total;
        int numberOfMutualFriends = 90;
        total = numerOfMutualFriends + numberOfOtherFriends
        return total;
    }
    public static void changeContact(Contact contact) {
        contact.setName("Brandon");
        
    }
}
