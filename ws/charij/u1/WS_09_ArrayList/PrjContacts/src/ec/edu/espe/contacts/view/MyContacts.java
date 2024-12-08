package ec.edu.espe.contacts.view;

import ec.edu.espe.contacts.model.Person;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

/**
 *
 * @author Sebastian Charij
 */
public class MyContacts {

    public static void main(String[] args) {

        System.out.println("---> My book of Contacs:");

        int id = 1;
        String name = "Sebastian";
        String lastName = "Charij";
        float salary = 4078.0f;

        Person person;
        person = new Person(id, name, lastName, salary);

        Collection things;
        things = new ArrayList<>();

        things.add(2);
        things.add(834.45F);
        things.add('A');
        things.add(true);
        things.add("Sebastian Charij");
        things.add(person);

        System.out.println("things--->" + things);

        things.add(new Date());
        things.add(id);

        System.out.println("things --> " + things);

        Collection<Person> persons;
        persons = new ArrayList<>();
        
        for (int i = 0; i < 5; i++) {
            persons.add(new Person(i + 1, "Sebastian" + (i+1), "Charij" + (i+1), (i+1)*1000));
        }
        persons.forEach((p) -> {
            System.out.println("Person --> " + p);
        });
        
        int setOfNumbers[] = {1 ,5 ,7 ,8 ,9 ,3};
        System.out.println("setOfNumbers --->" + setOfNumbers.length);
        
        for (int n:setOfNumbers){
            System.out.println("no. -->" + n);
        }
        
        for (Person p:persons){
            System.out.println("person --> " + p );
        }                   

    }
}
