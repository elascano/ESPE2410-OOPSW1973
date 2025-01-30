
class Animal {
    constructor(name) {
        this.name = name;
    }

    speak() {
        console.log(`${this.name} hace un sonido.`);
    }
}

class Dog extends Animal {
    constructor(name, breed) {
        super(name);
        this.breed = breed;
    }

    speak() {
        console.log(`${this.name} ladra.`);
    }

    getBreed() {
        return this.breed;
    }
}

const myDog = new Dog('Rex', 'Labrador');

myDog.speak();
console.log(`Raza: ${myDog.getBreed()}`);

const myAnimal = new Animal('Genérico');

myAnimal.speak();
