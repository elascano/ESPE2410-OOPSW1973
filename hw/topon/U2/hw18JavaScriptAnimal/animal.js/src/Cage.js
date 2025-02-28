const Animal = require('./Animal.js');

class Cage {
    constructor(id, animals = []) {
      this._id = id; 
      this._animals = animals; 
    }
  
  
    get id() {
      return this._id;
    }
  
    set id(value) {
      this._id = value;
    }
  
    get animals() {
      return this._animals;
    }
  
    set animals(value) {
      if (Array.isArray(value) && value.every(animal => animal instanceof Animal)) {
        this._animals = value;
      } else {
        throw new Error("animals must be an array of Animal instances");
      }
    }
  
   
    addAnimal(animal) {
      if (animal instanceof Animal) {
        this._animals.push(animal);
      } else {
        throw new Error("Only instances of Animal can be added to the cage");
      }
    }
  
   
    toString() {
      const animalDescriptions = this._animals.map(animal => animal.toString()).join(', ');
      return `Cage { id: ${this._id}, animals: [${animalDescriptions}] }`;
    }
  }
  
  module.exports = Cage;