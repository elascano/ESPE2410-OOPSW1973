package ec.edu.espe.zooapp.view;

import ec.edu.espe.zooapp.model.Animal;
import ec.edu.espe.zooapp.model.Cage;
import ec.edu.espe.zooapp.model.Food;
import ec.edu.espe.zooapp.model.Mammal;
import ec.edu.espe.zooapp.model.Vaccine;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Jose Leiton
 */
public class ZooApp {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        System.out.println("This is Jose's Zoo");
        
        Animal animal;
        int animalId;
        String name;
        Date bornOnDate;
        float weight;
        char sex;
        ArrayList<Vaccine> vaccines;
        int vaccineId;
        
        vaccineId=4;
        String vaccineName = "Paracetamol";
        
        animalId=1;
        name="Lucy";
        bornOnDate = new Date(2024, 0, 21);
        weight = 4.5F;
        sex='f';
        
        Vaccine vaccine;
        int VaccineId = 0;
        vaccine = new Vaccine(VaccineId, vaccineName);
        vaccines = new ArrayList<>();
        vaccines.add(vaccine);
        
        ArrayList<Animal>animals = new ArrayList<>();
        Cage cage;
        cage = new Cage(animalId, animals);
                
        animal = new Animal(animalId, name, bornOnDate, weight, sex, vaccines);
        System.out.println("My animal is -->"+animal);
        
        Mammal mammal = new Mammal(0.21F, 2, animalId, name, bornOnDate, weight, sex, vaccines);
        System.out.println("My mammal is -->"+mammal);
        
        vaccine = new Vaccine(5, "Ibuprofeno");
        
        mammal.breastFeed();
        mammal.assignCage(cage);
        mammal.feed(new Food());
        mammal.register();
        mammal.provideVaccination(vaccine);
        
        System.out.println("Mammal -->"+mammal);
        
        System.out.println("cage --> "+cage);
    }
}
