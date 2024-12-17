
package ec.edu.contact.view;

import ec.edu.contact.model.Contact;
import java.util.Date;

/**
 *
 * @author Matias Rojas
 */
public class ContactsApp {
    public static void main(String[] args) {
        System.out.println("Contact Book from Matias Rojas");
        
    int id;
    String name;
    Date birthDate;
    String email;
    int numberOfMutualFriends;
    int numberOfOtherFriends;
    int totalFriends;
    
    id= 1;
    name = "Matias";
    birthDate = new Date(2006, 03, 07);    
    email = "pmroas@espe.edu.ec";
    numberOfMutualFriends = 10;
    numberOfOtherFriends = 11;
    totalFriends = numberOfMutualFriends + numberOfOtherFriends;
    
    Contact contact = new Contact(id, name, birthDate, email, numberOfMutualFriends, numberOfOtherFriends, totalFriends);
     
        System.out.println("My first contact si --> \n + contact");
        
        System.out.println("total --> " + computeTotalFriends());
                
    }
    
    public static int computeTotalFriends(int numberOfMutualFriends, int numberOfOtherFriends){
        int total; 
        int nukberOfMutualFriends = total = numberOfMutualFriends + numberOfOtherFriends;
        return total;
    }
    
}
