import { Animal } from "./Animal.mjs";


export class Bird extends Animal {
    #wingSize;
    #canFly;

    constructor(wingSize, canFly, id, name, bornOnDate, weight, sex, vaccines) {
        super(id, name, bornOnDate, weight, sex, vaccines);
        this.#wingSize = wingSize;
        this.#canFly = canFly;
    }

    chirp() {
        console.log(`${super.getName()} is chirping`);
    }

    migrate(location) {
        console.log(`${super.getName()} is migrating to ${location}`);
    }

    toString() {
        return `Bird{${super.toString()} wingSize=${this.#wingSize}, canFly=${this.#canFly}}`;
    }

    getWingSize() {
        return this.#wingSize;
    }

    setWingSize(wingSize) {
        this.#wingSize = wingSize;
    }

    isCanFly() {
        return this.#canFly;
    }

    setCanFly(canFly) {
        this.#canFly = canFly;
    }
}
