package ec.edu.espe.zooapp.view;

import ec.edu.espe.zooapp.model.Animal;
import ec.edu.espe.zooapp.model.Cage;
import ec.edu.espe.zooapp.model.Mammal;
import ec.edu.espe.zooapp.model.Vaccine;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author David Pilatasig
 */
public class ZooApp {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        System.out.println("This is David's Zoo");
        
        Animal animal;
        int animalId;
        String name;
        Date bornOnDate;
        float weight;
        char sex;
        ArrayList<Vaccine> vaccines;
        ArrayList<Animal> animals;
        animals= new ArrayList<>();
        
        int vaccineId = 1;
        String vaccineName;
        vaccineName="Paracetamol";
        
        animalId=1;
        name="Lucy";
        bornOnDate=new Date(2024, 0, 21);
        weight= 4.57F;
        sex='F';
       
        Vaccine vaccine;
        
        vaccine= new Vaccine(vaccineId, vaccineName);
        vaccines= new ArrayList<>();
        vaccines.add(vaccine);
        
        animal= new Animal(animalId, name, bornOnDate, weight, sex, vaccines);
        
        
        System.out.println("My animal is --> \n" + animal);
        
        Mammal mammal= new Mammal(0.21F, 2, animalId, name, bornOnDate, weight, sex, vaccines);
        System.out.println("My mammal is --> " + mammal);
        
        
        Cage cage;
        cage= new Cage(1, animals);
        
        
        mammal.assignCage(cage);
        
        
        
        vaccine=new Vaccine(5,"Ibuprofhene");
        vaccines.add(vaccine);
        
        
        mammal.breastFeed();
        mammal.register();
        mammal.provideVaccination(vaccine);
        
        System.out.println("Cage -->" + cage);
    }
}
