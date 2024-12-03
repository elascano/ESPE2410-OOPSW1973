package ec.edu.espe.contacts.view;

import ec.edu.espe.contacts.model.Person;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

/**
 *
 * @author David Pilatasig
 */
public class MyContact {
    public static void main(String[] args){
        System.out.println("My Book of Contacts");
        int id=1;
        String name= "David";
        String lastName="Pilatasig";
        float salary=4078.0F;
        
        Person person;
        person= new Person(id, name, lastName, salary);
        
        Collection things;
        things=new ArrayList<>();
        
        things.add(2);
        things.add(834.45F);
        things.add("A");
        things.add(true);
        things.add("David Pilatasig");
        things.add(person);
        
        System.out.println("things -->" + things);
        
        things.add(new Date());
        things.add(id);
        System.out.println("things -->" + things);
        
        Collection<Person> persons;
        persons= new ArrayList<>();
        
        for (int i=0; i<5; i++){
        persons.add(new Person(i+1, "david" + (1+i), "Pilatasig" + (1+i), (i+1)*1000));
    }
        persons.forEach((p) ->{
            System.out.println("Person-->" + p);
        });
        
        System.out.println("persons -->" + persons);
        
        int setOfnumbers[]={1,6,9,4,6,0,-12};
        System.out.println("serOfNumbers size -->"+ setOfnumbers.length);
        
        for (int n:setOfnumbers){
            System.out.println("no. -->"+ n);
        }
        
        for (Person p:persons){
            System.out.println("person -->"+ p);
        }
        
        for(int i=0; i<person.size();i++){
            person.getId();
            person.getName();
            person.getLastName();
            person.getSalary();
        }
    }
}

