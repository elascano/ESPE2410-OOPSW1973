export class Food {
    #id;
    #amount;
    #type;

    constructor(id, amount, type) {
        this.#id = id;
        this.#amount = amount;
        this.#type = type;
    }

    toString() {
        return `Food {id: ${this.#id}, amount: ${this.#amount}, type: ${this.#type}}`;
    }

    getId() {
        return this.#id;
    }

    setId(id) {
        this.#id = id;
    }

    getAmount() {
        return this.#amount;
    }

    setAmount(amount) {
        this.#amount = amount;
    }

    getType() {
        return this.#type;
    }

    setType(type) {
        this.#type = type;
    }
}
