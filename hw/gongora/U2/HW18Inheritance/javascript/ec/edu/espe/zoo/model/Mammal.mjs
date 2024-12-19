import { Animal } from "./Animal.mjs";

export class Mammal extends Animal {
    #maximumHairSize;
    #mammaryGlandsNumber;

    constructor(maximumHairSize, mammaryGlandsNumber, id, name, bornOnDate, weight, sex, vaccines) {
        super(id, name, bornOnDate, weight, sex, vaccines);
        this.#maximumHairSize = maximumHairSize;
        this.#mammaryGlandsNumber = mammaryGlandsNumber;
    }

    toString() {
        return `Mammal {${super.toString()}, maximumHairSize: ${this.#maximumHairSize}, mammaryGlandsNumber: ${this.#mammaryGlandsNumber}}`;
    }

    breastFeed() {
        console.log("Breastfeeding the children");
    }

    getMaximumHairSize() {
        return this.#maximumHairSize;
    }

    setMaximumHairSize(maximumHairSize) {
        this.#maximumHairSize = maximumHairSize;
    }

    getMammaryGlandsNumber() {
        return this.#mammaryGlandsNumber;
    }

    setMammaryGlandsNumber(mammaryGlandsNumber) {
        this.#mammaryGlandsNumber = mammaryGlandsNumber;
    }
}
