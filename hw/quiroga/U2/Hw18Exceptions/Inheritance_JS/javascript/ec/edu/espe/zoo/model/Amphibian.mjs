import { Animal } from "./Animal.mjs";


export class Amphibian extends Animal {
    #skinType;
    #stage;

    constructor(skinType, stage, id, name, bornOnDate, weight, sex, vaccines) {
        super(id, name, bornOnDate, weight, sex, vaccines);
        this.#skinType = skinType;
        this.#stage = stage;
    }

    hop() {
        console.log(`The ${super.getName()} is hopping`);
    }

    transition() {
        console.log(`The ${super.getName()} is transforming`);
    }

    toString() {
        return `Amphibian{${super.toString()} skinType=${this.#skinType}, stage=${this.#stage}}`;
    }

    getSkinType() {
        return this.#skinType;
    }

    setSkinType(skinType) {
        this.#skinType = skinType;
    }

    getStage() {
        return this.#stage;
    }

    setStage(stage) {
        this.#stage = stage;
    }
}
