package ec.edu.espe.contacts.view;

import ec.edu.espe.contacts.model.Person;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

/**
 *
 * @author Esteban Quiroga
 */
public class MyContacts {
    
    public static void main(String[] args) {
        System.out.println("My Book of contacts <---");
        int id = 1;
        String name = "Esteban";
        String lastName = "Quiroga";
        float salary = 4012.26F;
        
        Person person;
        person = new Person(id, name, lastName, salary);
        
        Collection things;
        things = new ArrayList<>();
        
        things.add(2);
        things.add(834.45F);
        things.add('A');
        things.add(true);
        things.add("Esteban Quiroga");
        things.add(person);
        
        System.out.println("things --> "+ things);
        
        things.add(new Date());
        things.add(id = 2);
        
        System.out.println("things --> "+ things);
        
        Collection<Person> people;
        people = new ArrayList<>();
        
        for (int i=0; i<5; i++){
            people.add(new Person(i+1, "Esteban" + (i+1), "Quiroga" + (i+1), 4.5F  + (i+1)));
        }
        
        people.forEach((p)->{
        System.out.println("People -->" + people);
    });
        
        System.out.println("people --> "+ people);  
        
        int setOfNumbers[]={1,6,9,4,6,0,-12};
        System.out.println("setOfNumbers size --> " + setOfNumbers.length);
        
        for (int n:setOfNumbers){
            System.out.println("no. --> " + n);
        }
        
        for(Person p:people){
            System.out.println("person --> "+ p);
        }
        
        for(int i = 0; i<people.size();i++){
            
        }
        
    }
}
