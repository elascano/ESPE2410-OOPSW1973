// Importar las clases desde sus respectivos archivos
import { Animal } from "../model/Animal.js";
import { Cage } from "../model/Cage.js";
import { Mammal } from "../model/Mammal.js";
import { Vaccine } from "../model/Vaccine.js";

console.log("Hello World!");
console.log("This is David's Zoo");

let animal;
let animalId;
let name;
let bornOnDate;
let weight;
let sex;
let vaccines = [];
let animals = [];

// Definir los datos del ejemplo
let vaccineId = 1;
let vaccineName = "Paracetamol";

animalId = 1;
name = "Lucy";
bornOnDate = new Date(2024, 0, 21); // Meses en JavaScript van de 0 a 11
weight = 4.57;
sex = "F";

// Crear una vacuna
let vaccine = new Vaccine(vaccineId, vaccineName);
vaccines.push(vaccine);

// Crear un animal
animal = new Animal(animalId, name, bornOnDate, weight, sex, vaccines);
console.log("My animal is --> \n" + animal.toString());

// Crear un mamífero
let mammal = new Mammal(0.21, 2, animalId, name, bornOnDate, weight, sex, vaccines);
console.log("My mammal is --> " + mammal.toString());

// Crear una jaula
let cage = new Cage(1, animals);
mammal.assignCage(cage);

// Añadir una nueva vacuna
vaccine = new Vaccine(5, "Ibuprofen");
vaccines.push(vaccine);

// Métodos adicionales del mamífero
mammal.breastFeed();
mammal.register();
mammal.provideVaccination(vaccine);

console.log("Cage --> " + cage.toString());
