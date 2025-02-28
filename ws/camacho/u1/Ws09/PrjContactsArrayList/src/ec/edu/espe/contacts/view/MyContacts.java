package ec.edu.espe.contacts.view;

import ec.edu.espe.contacts.model.Person;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

/**
 *
 * @author mateo
 */
public class MyContacts {
    public static void main(String[] args){
        System.out.println("--->My Book Contacts<----");
        int id =1;
        String name ="Mateo";
        String lastName="Camacho";
        float salary =4037.2F;
        
        Person person;
        person = new Person(id, name, name, salary);
        
        Collection things;
        things = new ArrayList<>();
        
        things.add(3);
        things.add(789.3F);
        things.add('A');
        things.add(true);
        things.add("RamirezPortuano");
        things.add(person);
        
        System.out.println("Things -->; " + things);
        
        things.add(new Date());
        things.add(id);
        System.out.println("TOMA:\n" + things);
        
        Collection<Person>persons;
        persons = new ArrayList<>();
        
        for (int i = 0; i < 5; i++) {
            persons.add(new Person(i + 1, "Mateo" + (i+1), "Yucateco" + (i+1), (i + 1)*1000));
        }
        
        persons.forEach((p) ->{
            System.out.println("person-->: " + person);
        });
        System.out.println("toma: \n" + persons);
        
        int setOfNumbers []={1, 2, 4, 5, 6, 7, 8};
        
        for (int n:setOfNumbers) {
            System.out.println("No. " + n);
        }
        
        for (Person p:persons) {
            System.out.println("person ---> " + p);
        }
        
        for (int i = 0; i < persons.size(); i++) {
            
        }
    }
}
