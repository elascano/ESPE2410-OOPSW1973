export class Animal {
    _id;
    #name;
    #bornOnDate;
    #weight;
    #sex;
    #vaccines;

    constructor(id, name, bornOnDate, weight, sex, vaccines) {
        this._id = id;
        this.#name = name;
        this.#bornOnDate = bornOnDate;
        this.#weight = weight;
        this.#sex = sex;
        this.#vaccines = vaccines;
    }

    feed(food) {
        console.log("Feeding the animal with -->" + food);
    }

    register() {
        console.log("Registering the animal --> " + this.#name);
    }

    assignCage(cage) {
        console.log("Assigning an animal -- >" + this.#name + " in cage -->" + cage);
        cage.getAnimals().push(this);
    }

    provideVaccination(vaccine) {
        console.log("Providing vaccine --> 0" + vaccine + "<-- to " + this.#name);
        this.#vaccines.push(vaccine);
    }

    toString() {
        return `Animal {id: ${this._id}, name: ${this.#name}, bornOnDate: ${this.#bornOnDate}, weight: ${this.#weight}, sex: ${this.#sex}, vaccines: ${this.#vaccines.join(', ')}}`;
    }

    getId() {
        return this._id;
    }

    setId(id) {
        this._id = id;
    }

    getName() {
        return this.#name;
    }

    setName(name) {
        this.#name = name;
    }

    getBornOnDate() {
        return this.#bornOnDate;
    }

    setBornOnDate(bornOnDate) {
        this.#bornOnDate = bornOnDate;
    }

    getWeight() {
        return this.#weight;
    }

    setWeight(weight) {
        this.#weight = weight;
    }

    getSex() {
        return this.#sex;
    }

    setSex(sex) {
        this.#sex = sex;
    }

    getVaccines() {
        return this.#vaccines;
    }

    setVaccines(vaccines) {
        this.#vaccines = vaccines;
    }
}
