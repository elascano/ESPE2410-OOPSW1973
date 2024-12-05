export class Cable {
    #id;
    #type;
    #numberOfConductors;
    #price;

    constructor(id, type, numberOfConductors, price) {
        this.#id = id;
        this.#type = type;
        this.#numberOfConductors = numberOfConductors;
        this.#price = price;
    }

    get id() {
        return this.#id;
    }

    get type() {
        return this.#type;
    }

    get numberOfConductors() {
        return this.#numberOfConductors;
    }

    get price() {
        return this.#price;
    }

    toJSON() {
        return {
            id: this.#id,
            type: this.#type,
            numberOfConductors: this.#numberOfConductors,
            price: this.#price,
        };
    }

    toString() {
        return `id: ${this.#id}, type: ${this.#type}, numberOfConductors: ${this.#numberOfConductors}, price: ${this.#price}`;
    }
}