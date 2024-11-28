package ec.edu.espe.contacts.view;

import ec.edu.espe.contacts.model.Contact;
import java.util.Date;

/**
 *
 * @author Jose Leiton
 */
public class ContactsApp {
    public static void main(String[] args) {
        System.out.println("Contact Book from Jose Leiton");
        
    int id;
    String name;
    Date birthOfDate;
    String email;
    int numberOfMutualFriends;
    int numberOfOtherFriends;
    int totalFriends;

    id= 1;
    name="Jose Leiton";
    birthOfDate= new Date(2000,3,26);
    email="jileit@hotmail.com";
    numberOfMutualFriends=23;
    numberOfOtherFriends=5;
    totalFriends= numberOfMutualFriends + numberOfOtherFriends;
        
     
    Contact contact = new Contact(id, name, birthOfDate, email, numberOfMutualFriends, numberOfOtherFriends, totalFriends);
    
        System.out.println("My first contact is --> \n"+contact);
        
        int total = computeTotalFriends(numberOfMutualFriends, numberOfOtherFriends);
        
        
        System.out.println("The total number of friends is -->"+computeTotalFriends(numberOfMutualFriends, numberOfOtherFriends));
        

        System.out.println("number of mutual friends -->"+numberOfMutualFriends);
        System.out.println("number of other friends --> "+numberOfOtherFriends);
        
        System.out.println("Total -->"+computeTotalFriends(numberOfMutualFriends, numberOfOtherFriends));
        
    }
    
    
    public static int computeTotalFriends(int numberOfMutualFriends, int numberOfOtherFriends){
    
        int total;
        numberOfMutualFriends=90;
        total = numberOfMutualFriends + numberOfOtherFriends;    
        return total;
    }    

    public static void changeContact(Contact contact) {
        contact.setName("Jorge");
    }
    
    
}
