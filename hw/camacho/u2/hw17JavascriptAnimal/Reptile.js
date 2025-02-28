import { Animal } from './Animal.js';

export class Reptile extends Animal {
    constructor(name, age) {
        super(name, age);
    }

    speak() {
        console.log(`${this.name} el reptil hace un sonido.`);
    }
}
