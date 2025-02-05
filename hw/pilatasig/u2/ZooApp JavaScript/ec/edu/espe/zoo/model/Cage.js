export class Cage {
    constructor(id, animals = []) {
        this._id = id; // int
        this._animals = animals; // Array of Animal objects
    }

    // Getter para id
    get id() {
        return this._id;
    }

    // Setter para id
    set id(value) {
        this._id = value;
    }

    // Getter para animals
    get animals() {
        return this._animals;
    }

    // Setter para animals
    set animals(value) {
        this._animals = value;
    }

    // Método toString
    toString() {
        const animalsString = this._animals.map(animal => animal.toString()).join(", ");
        return `Cage{id=${this._id}, animals=[${animalsString}]}`;
    }
}
