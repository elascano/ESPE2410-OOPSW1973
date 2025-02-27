/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package es.espe.edu.contacts.view;

import ec.espe.edu.model.contacts.Person;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

/**
 *
 * @author LABS-DCCO
 */
public class MyContacts {
    public static void main(String[] args){
        System.out.println("----> My Book of contacts <-----");
        
        int id=1;
        String name = "Lisbeth ";
        String lastName = "Tipan";
        float salary = 4078.0F;
        
        Person person;
        person= new Person(id, name, lastName, salary);
                
        
        Collection things;
    
        things = new ArrayList<>();
        
        things.add(2);
        things.add(834.45F);
        things.add('A');
        things.add(true);
        things.add("Lisbeth Tipan");
        things.add(person);
        
        System.out.println("things ----> "+ things);
        
        things.add(new Date());
        things.add(id);
        System.out.println("things ----> "+ things);

        Collection<Person> persons;
        persons = new ArrayList<>();
        for (int i = 0 ; i <5 ; i++ ) {
        persons.add(new Person(i+1, "Lisbeth"+(i+1),"Tipan"+(i+1),(i+1)*1000));
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
