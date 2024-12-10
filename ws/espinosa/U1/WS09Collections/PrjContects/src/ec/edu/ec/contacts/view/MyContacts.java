package ec.edu.ec.contacts.view;

import ec.edu.ec.contacts.model.Person;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

/**
 *
 * @author Andrés Espinosa
 */
public class MyContacts {
    public static void main(String[] args) {
        System.out.println("--->My Book of Contacts <---");
        int id=1;
        String name="Andrés";
        String lastName="Espinosa";
        float salary=5;
        
        Person person;
        person = new Person(id, name, lastName, salary);
        
        Collection things;
        things = new ArrayList<>();
        
        things.add(2);
        things.add(834.45F);
        things.add("A");
        things.add(true);
        things.add("Andres Espinosa");
        things.add(person);
        
        System.out.println("things -->" + things);
        
        things.add(new Date());
        things.add(id);
        
        System.out.println("things -->" + things);
        
        Collection<Person> persons;
        persons = new ArrayList<>();
        for (int i = 0; i < 5; i++){
            persons.add(new Person(i + 1,"Edison" + 1, "Edison Lascano" + 1, (i + 1)*1000));
        }
        persons.forEach((p) -> {
            System.out.println("Person -->" + p);
        });
        
        System.out.println("persons-->" + persons);
        
        int setOfNumbers[] = {1, 6, 9, 4, 6, 0, -12};
        System.out.println("setOfNUmbers size -->" + setOfNumbers.length);
        
        for(int n:setOfNumbers){
            System.out.println("no. -->" + n);
        }
        
        for(Person p:persons){
            System.out.println("person -->" + p);
        }
        for (int i = 0 ; 1 < persons.size();i++){
            
        }
    }
}
