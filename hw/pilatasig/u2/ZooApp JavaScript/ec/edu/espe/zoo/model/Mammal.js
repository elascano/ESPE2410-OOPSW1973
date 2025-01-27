import { Animal } from "./Animal.js";

export class Mammal extends Animal {
    constructor(maxHairSize, mammaryGlandNumber, id, name, bornOnDate, weight, sex, vaccines = []) {
        super(id, name, bornOnDate, weight, sex, vaccines); // Llamada al constructor de la clase base (Animal)
        this._maxHairSize = maxHairSize; // float
        this._mammaryGlandNumber = mammaryGlandNumber; // int
    }

   
    breastFeed() {
        console.log("Breastfeeding the children");
    }

    
    get maxHairSize() {
        return this._maxHairSize;
    }

        set maxHairSize(value) {
        this._maxHairSize = value;
    }

    r
    get mammaryGlandNumber() {
        return this._mammaryGlandNumber;
    }

    
    set mammaryGlandNumber(value) {
        this._mammaryGlandNumber = value;
    }

    // Método toString
    toString() {
        return `Mammal{${super.toString()}, maxHairSize=${this._maxHairSize}, mammaryGlandNumber=${this._mammaryGlandNumber}}`;
    }
}
