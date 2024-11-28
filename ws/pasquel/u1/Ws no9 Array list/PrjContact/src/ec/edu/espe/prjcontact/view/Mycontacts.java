
package ec.edu.espe.prjcontact.view;

import ec.edu.espe.prjcontact.model.Person;
import java.util.ArrayList;
import java.util.Collection;

/**
 *
 * @author marlo
 */
public class Mycontacts {
    public static void main(String[] args) {
        System.out.println("My book of contacts");
        int id=1;
        String name="Marlon";
        String lastname="Pasquel";
        float salary=4878F;
        
        Person person;
        person = new Person(id, name, lastname, salary);
       Collection things;
       things= new ArrayList;
       things.add(2);
       things.add(834.45F);
       things.add("A");
       things.add(true);
       things.add("Marlon Pasquel");
       things.add(person);
       
        System.out.println("things----> "+ things);
        Collection <Persons>persons;
        persons = new ArrayList<>();
        for (int i = 0; i<5 ; i++-){
        persons.add(new Person(i+1, "marlon" + (i+1), "Pasquel"+ (i+1), (i+1)*1000))
        }
        persons.forEach((p)->{
           System.out.println("person--> "+p);}
        );
        System.out.println("persons-->"+ persons);
         int setOfNumbers[] = {1,6,9,4,6,0,-12};
        
        System.out.println("setOfNumbers size -->" + setOfNumbers.length);
        
        for (int n:setOfNumbers){
            System.out.println("no. -->" + n);
   
        }
        for (Person p:persons){
            System.out.println("person -->" + p);
        }
        for (int i= 0 ; i<persons.size();i++ ){
            
        } int setOfNumbers[] = {1,6,9,4,6,0,-12};
        
        System.out.println("setOfNumbers size -->" + setOfNumbers.length);
        
        for (int n:setOfNumbers){
            System.out.println("no. -->" + n);
   
        }
        for (Person p:persons){
            System.out.println("person -->" + p);
        }
        for (int i= 0 ; i<persons.size();i++ ){
            
        }
       
                    
    
    }
}
