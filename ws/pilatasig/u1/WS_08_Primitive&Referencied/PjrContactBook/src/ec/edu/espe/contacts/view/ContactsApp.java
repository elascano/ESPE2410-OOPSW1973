
package ec.edu.espe.contacts.view;

import ec.edu.espe.contacts.model.Contact;
import java.util.Date;

/**
 *
 * @author David Pilatasig
 */
public class ContactsApp {
    public static void main (String[] args){
        System.out.println("Contact Book from David Pilatasig");
        
    int id;
    String name;
    Date birthDate;
    String email;
    int numberOfMutualFriends;
    int numberOfOtherFriends;
    int totalFriends;
    
    id=1;
    name="Benjamin";
    birthDate= new Date(2002, 4, 6);
    email="abrobalino@espe.edu.ec";
    numberOfMutualFriends=23;
    numberOfOtherFriends=5;
    totalFriends=numberOfMutualFriends+numberOfOtherFriends;
    
    Contact contact= new Contact(id, name, birthDate, email, numberOfMutualFriends, numberOfOtherFriends);
        System.out.println("My first contact is -->\n" + contact);
        
        System.out.println("The total number of friends is -->" + computeTotalFriends(numberOfMutualFriends, numberOfOtherFriends));
        System.out.println("The total number of firends is -->" + totalFriends);
        
        
                
    }
    
public static int computeTotalFriends(int numberOfMutualFriends, int numberOfOtherFriends){
    int total;
    total= numberOfMutualFriends+numberOfOtherFriends;
    return total;
}
public static void changeContact(Contact contact){
   
}
}
