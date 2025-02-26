import { Animal } from "./Animal.mjs";


export class Reptile extends Animal {
    #typeOfScales;
    #isPoisonous;
    #hasLegs;

    constructor(typeOfScales, isPoisonous, hasLegs, id, name, bornOnDate, weight, sex, vaccines) {
        super(id, name, bornOnDate, weight, sex, vaccines);
        this.#typeOfScales = typeOfScales;
        this.#isPoisonous = isPoisonous;
        this.#hasLegs = hasLegs;
    }

    shedSkin() {
        console.log(`${super.getName()} is shedding its skin`);
    }

    toString() {
        return `Reptile{${super.toString()} typeOfScales=${this.#typeOfScales}, isPoisonous=${this.#isPoisonous}, hasLegs=${this.#hasLegs}}`;
    }


    getTypeOfScales() {
        return this.#typeOfScales;
    }

    setTypeOfScales(typeOfScales) {
        this.#typeOfScales = typeOfScales;
    }

    isIsPoisonous() {
        return this.#isPoisonous;
    }

    setIsPoisonous(isPoisonous) {
        this.#isPoisonous = isPoisonous;
    }

    isHasLegs() {
        return this.#hasLegs;
    }

    setHasLegs(hasLegs) {
        this.#hasLegs = hasLegs;
    }
}
