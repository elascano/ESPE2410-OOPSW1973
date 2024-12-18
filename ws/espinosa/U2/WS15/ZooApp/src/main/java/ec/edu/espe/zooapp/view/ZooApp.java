package ec.edu.espe.zooapp.view;

import ec.edu.espe.zooapp.model.Animal;
import ec.edu.espe.zooapp.model.Cage;
import ec.edu.espe.zooapp.model.Food;
import ec.edu.espe.zooapp.model.Mamal;
import ec.edu.espe.zooapp.model.Vaccine;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Andrés Espinosa
 */
public class ZooApp {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        System.out.println("This is Andrés's zoo");
        
        Animal animal;
        int animalId;
        String name;
        Date bornOnDate;
        float weight;
        char sex;
        ArrayList<Vaccine> vaccines;
        int vaccineId;
        String vaccineName;
        
        animalId=1;
        name="Lucy";
        bornOnDate = new Date(2024, 8, 21);
        weight = 0.5F;
        sex = 'f';
        
        vaccineId = 1;
        vaccineName = "paracetamol";
        Vaccine vaccine = new Vaccine (vaccineId, vaccineName);
        vaccines = new ArrayList<Vaccine>();
        vaccines.add(vaccine);
        
        float hairSize = 50.5F;
        int numberOfMamaryGlands = 3;
        
        animal = new Animal(animalId, name, bornOnDate, weight, sex, vaccines);
        System.out.println("animal -->" + animal);
        
        Mamal mamal = new Mamal(hairSize, numberOfMamaryGlands, animalId, name, bornOnDate, weight, sex, vaccines);
        System.out.println("mamal --> " + mamal);
        
        vaccine = new Vaccine(3, "Ibuprofeno");
        vaccines.add(vaccine);
        
        ArrayList animals = new ArrayList<Animal>();
        animals.add(animal);
        
        mamal.feed(new Food(1, 5.0F, "Orange"));
        mamal.asignCage(new Cage(3, animals));

    }
}
