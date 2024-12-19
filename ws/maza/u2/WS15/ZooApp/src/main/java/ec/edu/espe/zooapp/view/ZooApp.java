
package ec.edu.espe.zooapp.view;

import ec.edu.espe.zooapp.model.Animal;
import ec.edu.espe.zooapp.model.Mammal;
import ec.edu.espe.zooapp.model.Vaccine;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Alexander Maza
 */
public class ZooApp {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        System.out.println("This is Alexander zoo");
        
        Animal animal;
        int animalId;
        String name;
        Date bornOnDate;
        float weigth;
        char sex; 
        ArrayList<Vaccine> vaccines;
        int vaccineId;
        String vaccineName;
        
        vaccineId=4;
        vaccineName= "Paracetamol";
        animalId=1;
        name= "Lucy";
        bornOnDate= new Date(2024, 0, 21);
        weigth = 4.57F;
        sex= 'f';
        Vaccine vaccine;
        vaccine = new Vaccine(vaccineId, vaccineName);
        vaccines = new ArrayList<>();
        vaccines.add(vaccine);
        
        animal= new Animal(animalId, name, bornOnDate, weigth, sex, vaccines);
        System.out.println("My animal is --> \n" + animal);
        
        Mammal mammal = new Mammal(0.27F, 2, animalId, name, bornOnDate, weigth, sex, vaccines);
        System.out.println("my mammal is --> " + mammal);
    }
}
