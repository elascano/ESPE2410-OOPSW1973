export class Cage {
    #id;
    #animals;

    constructor(id, animals) {
        this.#id = id;
        this.#animals = animals;
    }

    toString() {
        return `Cage {id: ${this.#id}, animals: ${this.#animals.join(', ')}}`;
    }

    getId() {
        return this.#id;
    }

    setId(id) {
        this.#id = id;
    }

    getAnimals() {
        return this.#animals;
    }

    setAnimals(animals) {
        this.#animals = animals;
    }
}
