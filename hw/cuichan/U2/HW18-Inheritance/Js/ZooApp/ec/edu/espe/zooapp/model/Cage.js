// Cage.js
export class Cage {
    static MAX_ANIMALS = 10;
    #id;
    #animals;

    constructor(id) {
        if (id < 0) throw new Error("Cage ID must be non-negative");
        this.#id = id;
        this.#animals = [];
    }

    addAnimal(animal) {
        if (!animal) throw new Error("Animal cannot be null");
        if (this.#animals.length >= Cage.MAX_ANIMALS) {
            throw new Error("Cage is at maximum capacity");
        }
        if (!this.#animals.includes(animal)) {
            this.#animals.push(animal);
        }
    }

    removeAnimal(animal) {
        if (!animal) throw new Error("Animal cannot be null");
        const index = this.#animals.indexOf(animal);
        if (index > -1) {
            this.#animals.splice(index, 1);
        }
    }

    get id() { return this.#id; }
    get animals() { return [...this.#animals]; }

    toString() {
        return `Cage {
            id: ${this.#id},
            animals: ${this.#animals.map(a => a.toString())}
        }`;
    }
}