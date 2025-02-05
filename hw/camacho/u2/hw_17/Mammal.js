import { Animal } from './Animal.js';

export class Mammal extends Animal {
    constructor(name, age) {
        super(name, age);
    }

    speak() {
        console.log(`${this.name} el mamífero hace un sonido.`);
    }
}
