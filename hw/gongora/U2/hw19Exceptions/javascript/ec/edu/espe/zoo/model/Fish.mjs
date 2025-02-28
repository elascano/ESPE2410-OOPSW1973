import { Animal } from "./Animal.mjs";


export class Fish extends Animal {
    #scaleColor;
    #isSaltWater;

    constructor(scaleColor, isSaltWater, id, name, bornOnDate, weight, sex, vaccines) {
        super(id, name, bornOnDate, weight, sex, vaccines);
        this.#scaleColor = scaleColor;
        this.#isSaltWater = isSaltWater;
    }

    swim() {
        console.log(`${super.getName()} is swimming`);
    }

    toString() {
        return `Fish{${super.toString()} scaleColor=${this.#scaleColor}, isSaltWater=${this.#isSaltWater}}`;
    }

    getScaleColor() {
        return this.#scaleColor;
    }

    setScaleColor(scaleColor) {
        this.#scaleColor = scaleColor;
    }

    isIsSaltWater() {
        return this.#isSaltWater;
    }

    setIsSaltWater(isSaltWater) {
        this.#isSaltWater = isSaltWater;
    }
}
