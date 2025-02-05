// Mammal.js
import { Animal } from './Animal.js';

export class Mammal extends Animal {
    #hairLength;
    #mammaryGlands;

    constructor(id, name, bornOnDate, weight, sex, hairLength, mammaryGlands) {
        super(id, name, bornOnDate, weight, sex);
        this.#validateMammalParams(hairLength, mammaryGlands);
        this.#hairLength = hairLength;
        this.#mammaryGlands = mammaryGlands;
    }

    #validateMammalParams(hairLength, mammaryGlands) {
        if (hairLength < 0) throw new Error("Hair length cannot be negative");
        if (mammaryGlands < 0) throw new Error("Mammary glands count cannot be negative");
    }

    breastFeed() {
        if (this.sex !== Animal.Sex.FEMALE) {
            throw new Error("Only female mammals can breastfeed");
        }
        console.log(`Mammal ${this.name} is breastfeeding`);
    }

    get hairLength() { return this.#hairLength; }
    get mammaryGlands() { return this.#mammaryGlands; }

    toString() {
        return `Mammal {
            ${super.toString()},
            hairLength: ${this.#hairLength},
            mammaryGlands: ${this.#mammaryGlands}
        }`;
    }
}