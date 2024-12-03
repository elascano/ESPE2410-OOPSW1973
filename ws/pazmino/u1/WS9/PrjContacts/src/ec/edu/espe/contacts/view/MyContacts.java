package ec.edu.espe.contacts.view;

import ec.edu.espe.contacts.model.Person;
import java.util.ArrayList;
import java.util.Collection;

/**
 *
 * @author Brandon Pazmino
 */
public class MyContacts {

    public static void main(String[] args) {
        System.out.println("My book of contacts -->");
        int id = 1;
        String name = "Brandon";
        String lastName = "Pazmino";
        float salary = 4078.0F;

        Person person;
        person new Person(id, name, lastName, salary);

        Collection things;

        things = new ArrayList<>();

        things.add(2);
        things.add(834.45F);
        things.add('A');
        things.add(true);
        things.add("Brandon Pazmino");
        things.add(person);

        System.out.println("things -->" + things);

        things.add(new Date());
        things.add(id);
        System.out.println("things -->" + things);

        Collection<Person> persons;
        persons = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            persons.add(new Person(i + 1, "Brandon" + (i + 1), "Pazmino" + (i + 1), (i + 1) * 100));

        }
        persons.forEach((p)->{
        System.out.println("Person -->" + p);
        });
        System.out.println("persons -->" + persons);
        int setOfNumbers[] = {1, 6, 9, 

    }

}
