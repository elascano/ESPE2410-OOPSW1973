const Vaccine = require('./Vaccine.js');
const Animal = require('./Animal.js');
const Mammal = require('./Mammal.js');
const Cage = require('./Cage.js');
const Food = require('./Food.js');


console.log("Hello World!");
console.log("This is TIPAN LISBETH´s zoo");

let vaccineId = 4;
let vaccineName = "Paracetamol";
let animalId = 1;
let name = "Lucy";
let bornOnDate = new Date(2024, 0, 21); 
let weight = 4.57;
let sex = 'f';



let vaccine = new Vaccine(vaccineId, vaccineName);
let vaccines = [vaccine];

let animal = new Animal(animalId, name, bornOnDate, weight, sex, vaccines);
console.log("My animal is --> \n" + animal);

let animals = [];
let cage = new Cage(1, animals);

let mammal = new Mammal(0.21, 2, animalId, name, bornOnDate, weight, sex, vaccines);
console.log("My mammal is --> " + mammal);

mammal.breastFeed();
mammal.assignCage(cage);

let food = new Food(1, 5, "maiz");
mammal.feed(food);

let newVaccine = new Vaccine(5, "Ibuprofeno");

mammal.register();
mammal.provideVaccination(newVaccine);

console.log("Mammal --> " + mammal);
console.log("Cage --> " + cage);