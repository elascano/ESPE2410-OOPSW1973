package ec.edu.espe.contacts.view;

import ec.edu.espe.contacts.model.Contact;
import java.util.Date;

/**
 *
 * @author Dennis Paucar
 */
public class ContactsApp {
    public static void main(String[] args){
        System.out.println("Contact Book from Edison Lascano");
        
    int id;
    String name;
    Date birthDate;
    String email;
    int numberOfMutualFriends;
    int numberOfOtherFriends;
    int totalFriends;
    
    id= 1;
    name="Dennis";
    birthDate= new Date(2004, 5, 6);
    email="dspaucar@espe.edu.ec";
    numberOfMutualFriends= 23;
    numberOfOtherFriends= 4;
    totalFriends= numberOfMutualFriends + numberOfOtherFriends;
    
     Contact contact = new Contact(id, name, birthDate, email, numberOfMutualFriends, numberOfOtherFriends, totalFriends);
     
     System.out.println("My firts contact is is -->\n"+contact);
     
     System.out.println("The total number of friends is --> "+computeTotalFriends(numberOfMutualFriends, numberOfOtherFriends));
     
     System.out.println("total -->"+ computeTotalFriends(numberOfMutualFriends, numberOfOtherFriends));
     
     
    }
    
    public static int computeTotalFriends(int numberOfMutualFriends,int numberOfOtherFriends){
        int total;
        total= numberOfMutualFriends + numberOfOtherFriends;
        
        return total;
    }
  
}
    

