export class Animal {
    constructor(id, name, bornOnDate, weight, sex, vaccines = []) {
        this._id = id; // int
        this._name = name; // String
        this._bornOnDate = bornOnDate; // Date
        this._weight = weight; // float
        this._sex = sex; // char
        this._vaccines = vaccines; // Array of Vaccine objects
    }

    // Getters
    get id() {
        return this._id;
    }

    get name() {
        return this._name;
    }

    get bornOnDate() {
        return this._bornOnDate;
    }

    get weight() {
        return this._weight;
    }

    get sex() {
        return this._sex;
    }

    get vaccines() {
        return this._vaccines;
    }

    set id(value) {
        this._id = value;
    }

    set name(value) {
        this._name = value;
    }

    set bornOnDate(value) {
        this._bornOnDate = value;
    }

    set weight(value) {
        this._weight = value;
    }

    set sex(value) {
        this._sex = value;
    }

    set vaccines(value) {
        this._vaccines = value;
    }

    toString() {
        return `Animal{id=${this._id}, name=${this._name}, bornOnDate=${this._bornOnDate}, weight=${this._weight}, sex=${this._sex}, vaccines=${this._vaccines.map(v => v.toString()).join(", ")}}`;
    }

    feed(food) {
        console.log(`Feeding the animal ${this._name} with --> ${food}`);
    }

    register() {
        console.log(`Registering the animal ${this._name}`);
    }

    assignCage(cage) {
        console.log(`Assigning an animal ${this._name} to cage --> ${cage}`);
        cage.animals.push(this);
    }

    provideVaccination(vaccine) {
        console.log(`Providing vaccine --> ${vaccine} <-- to animal ${this._name}`);
        this._vaccines.push(vaccine);
    }
}

