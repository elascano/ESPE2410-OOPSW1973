package ec.edu.espe.contacts.view;

import ec.edu.espe.contacts.model.Contact;
import java.util.Date;

/**
 *
 * @author Sebastian Charij
 */
public class ContactsApp {

    public static void main(String[] args) {
        System.out.println("Contact book from Sebastian Charij");

        int id;
        String name;
        Date birthDate;
        String email;
        int numberOfMutualFriends;
        int numberOfOtherFriends;
        int totalFriends;

        id = 1;
        name = "Sebastian";
        birthDate = new Date(2002, 4, 6);
        email = "jscharij@espe.edu.ec";
        numberOfMutualFriends = 25;
        numberOfOtherFriends = 5;
        totalFriends = numberOfMutualFriends + numberOfOtherFriends;

        Contact contact = new Contact(id, name, birthDate, email, numberOfMutualFriends, numberOfOtherFriends, totalFriends);

        System.out.println("My firts contact is -->\n" + contact);

        System.out.println("The total number of friend is -->" + computeTotalFriends(numberOfMutualFriends, numberOfOtherFriends));
        
        System.out.println("Total --> " + computeTotalFriends(numberOfMutualFriends, numberOfOtherFriends));
    }

    public static int computeTotalFriends(int numberOfMutualFriends, int numberOfOtherFriends) {
        int total;
        total = numberOfMutualFriends + numberOfOtherFriends;
        return total;
    }

}
