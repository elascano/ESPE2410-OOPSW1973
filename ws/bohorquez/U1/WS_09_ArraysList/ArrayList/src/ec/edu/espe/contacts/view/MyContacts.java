package ec.edu.espe.contacts.view;

import ec.edu.espe.contacts.model.Person;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

/**
 *
 * @author Camila Bohorquez
 */
public class MyContacts {
    public static void main(String[] args){
        System.out.println("----> My Book of contacts <-----");
        
        int id=1;
        String name = "Bohorquez";
        String lastName = "Camila";
        float salary = 4078.0F;
        
        Person person;
        person= new Person(id, name, lastName, salary);
                
        
        Collection things;
    
        things = new ArrayList<>();
        
        things.add(2);
        things.add(834.45F);
        things.add('A');
        things.add(true);
        things.add("Camila Bohorquez");
        things.add(person);
        
        System.out.println("things ----> "+ things);
        
        things.add(new Date());
        things.add(id);
        System.out.println("things ----> "+ things);

        Collection<Person> persons;
        persons = new ArrayList<>();
        for (int i = 0 ; i <5 ; i++ ) {
        persons.add(new Person(i+1, "Camila"+(i+1),"Bohorquez"+(i+1),(i+1)*1000));
            }   
        persons.forEach((p) -> {
        System.out.println("Person --> " + p);
        });
        
        System.out.println("persons ---> " + persons);
        
        int setOfNumbers[]={1,6,9,4,6,0,-12};
        System.out.println("setOfNumbers size ---> "+ setOfNumbers.length);
        
        for(int n:setOfNumbers){
            System.out.println("no. ---> " + n);
        }
        for(Person p:persons){
            System.out.println("person ---> " +p);
        }
        
        for(int i=0; i < persons.size();i++){
   
        }
    }
}