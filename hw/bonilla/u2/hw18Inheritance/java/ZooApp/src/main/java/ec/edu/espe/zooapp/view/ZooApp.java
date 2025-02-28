package ec.edu.espe.zooapp.view;

import ec.edu.espe.zooapp.model.Animal;
import ec.edu.espe.zooapp.model.Cage;
import ec.edu.espe.zooapp.model.Food;
import ec.edu.espe.zooapp.model.Mammal;
import ec.edu.espe.zooapp.model.Bird;
import ec.edu.espe.zooapp.model.Reptile;
import ec.edu.espe.zooapp.model.Amphibian;
import ec.edu.espe.zooapp.model.Fish;
import ec.edu.espe.zooapp.model.Vaccine;
import ec.edu.espe.zooapp.model.ZooPrinter;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Robinson Bonilla
 */

public class ZooApp {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        System.out.println("This is Robinson zoo\n");

        int vaccineId = 1;
        String vaccineName = "Paracetamol";
        Date bornOnDate = new Date(2024, 0, 21);  
        char sex = 'F';
        float weight = 4.57F;
        ArrayList<Vaccine> vaccines = new ArrayList<>();
        vaccines.add(new Vaccine(vaccineId, vaccineName));

        int animalId = 1;
        Animal animal = new Animal(animalId, "Lucy", bornOnDate, weight, sex, vaccines);
        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(animal);
        Cage cage = new Cage(1, animals);

        Mammal mammal = new Mammal(0.21F, 2, animalId, "Max", new Date(2023, 5, 12), 5.2F, 'M', vaccines);
        Vaccine mammalVaccine = new Vaccine(5, "Ibuprophene");
        mammal.feed(new Food(1, 5.2F, "mouse"));
        mammal.breastFeed();
        mammal.register();
        mammal.provideVaccination(mammalVaccine);
        mammal.assignCage(cage);

        ZooPrinter.printAnimalDetails(mammal, cage);

        Bird bird = new Bird(1.5F, true, 2, "Eagle", new Date(2023, 3, 15), 3.1F, 'M', new ArrayList<>());
        bird.chirp();
        bird.migrate("Northern Europe");
        bird.provideVaccination(new Vaccine(3, "Bird Flu Vaccine"));
        bird.assignCage(cage);

        ZooPrinter.printAnimalDetails(bird, cage);

        Reptile reptile = new Reptile("Scales", true, true, 3, "Iguana", new Date(2022, 8, 19), 7.5F, 'F', new ArrayList<>());
        reptile.shedSkin();
        reptile.provideVaccination(new Vaccine(6, "Anti-poison Vaccine"));
        reptile.assignCage(cage);

        ZooPrinter.printAnimalDetails(reptile, cage);

        Amphibian amphibian = new Amphibian("Smooth", "Juvenile", 4, "Frog", new Date(2023, 6, 25), 0.45F, 'M', new ArrayList<>());
        amphibian.hop();
        amphibian.transition();
        amphibian.provideVaccination(new Vaccine(7, "Skin Protection"));
        amphibian.assignCage(cage);

        ZooPrinter.printAnimalDetails(amphibian, cage);

        Fish fish = new Fish("Golden", true, 5, "Goldfish", new Date(2023, 2, 10), 0.1F, 'M', new ArrayList<>());
        fish.swim();
        fish.provideVaccination(new Vaccine(8, "Aquatic Health"));
        fish.assignCage(cage);

        ZooPrinter.printAnimalDetails(fish, cage);

        System.out.println("----- Cage -----");
        System.out.println(cage);
    }
}
