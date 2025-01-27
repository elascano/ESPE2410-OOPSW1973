import { Animal } from "../model/Animal.mjs";
import { Cage } from "../model/Cage.mjs";
import { Food } from "../model/Food.mjs";
import { Mammal } from "../model/Mammal.mjs";
import { Bird } from "../model/Bird.mjs";
import { Reptile } from "../model/Reptile.mjs";
import { Amphibian } from "../model/Amphibian.mjs";
import { Fish } from "../model/Fish.mjs";
import { Vaccine } from "../model/Vaccine.mjs";
import { ZooPrinter } from "../model/ZooPrinter.mjs";  

console.log("Hello World!");
console.log("This is Lucas's zoo\n");

let vaccineId = 1;
let vaccineName = "Paracetamol";
let bornOnDate = new Date(2024, 0, 21);  
let sex = 'F';
let weight = 4.57;
let vaccines = [new Vaccine(vaccineId, vaccineName)];

let animalId = 1;
let animal = new Animal(animalId, "Lucy", bornOnDate, weight, sex, vaccines);

let animals = [animal];
let cage = new Cage(1, animals);

let mammal = new Mammal(0.21, 2, animalId, "Max", new Date(2023, 5, 12), 5.2, 'M', vaccines);
vaccineId = 2;
mammal.feed(new Food(1, 5.2, "corn"));
mammal.breastFeed();
mammal.register();
mammal.provideVaccination(new Vaccine(vaccineId, "Amoxiciline"));
mammal.assignCage(cage);

ZooPrinter.printAnimalDetails(mammal, cage);

let bird = new Bird(1.5, true, 2, "condor", new Date(2023, 3, 15), 3.1, 'M', [new Vaccine(3, "Bird Vaccine")]);
bird.chirp();
bird.migrate("Northern Europe");
bird.provideVaccination(new Vaccine(4, "Super vaccine"));
bird.assignCage(cage);

ZooPrinter.printAnimalDetails(bird, cage);

let reptile = new Reptile("Scales", true, true, 3, "Iguana", new Date(2022, 8, 19), 7.5, 'F', [new Vaccine(5, "Reptile Vaccine")]);
reptile.shedSkin();
reptile.provideVaccination(new Vaccine(6, "Anti-poison Vaccine"));
reptile.assignCage(cage);

ZooPrinter.printAnimalDetails(reptile, cage);

let amphibian = new Amphibian("Smooth", "Juvenile", 4, "Frog", new Date(2023, 6, 25), 0.45, 'M', [new Vaccine(7, "Amphibian Vaccine")]);
amphibian.hop();
amphibian.transition();
amphibian.provideVaccination(new Vaccine(8, "insects vaccine"));
amphibian.assignCage(cage);

ZooPrinter.printAnimalDetails(amphibian, cage);

let fish = new Fish("Golden", true, 5, "Goldfish", new Date(2023, 2, 10), 0.1, 'M', [new Vaccine(9, "Fish Vaccine")]);
fish.swim();
fish.provideVaccination(new Vaccine(10, "Aquatic Health"));
fish.assignCage(cage);

ZooPrinter.printAnimalDetails(fish, cage);

console.log("----- Cage -----");
console.log(cage.toString());
