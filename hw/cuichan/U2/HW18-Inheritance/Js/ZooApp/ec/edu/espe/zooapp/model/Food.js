// Food.js
export class Food {
    static Type = {
        MEAT: 'MEAT',
        PLANTS: 'PLANTS',
        INSECTS: 'INSECTS',
        MIXED: 'MIXED'
    };

    #id;
    #amount;
    #type;

    constructor(id, amount, type) {
        this.#validateConstructorParams(id, amount, type);
        this.#id = id;
        this.#amount = amount;
        this.#type = type;
    }

    #validateConstructorParams(id, amount, type) {
        if (id < 0) throw new Error("Food ID must be non-negative");
        if (amount <= 0) throw new Error("Amount must be positive");
        if (!Object.values(Food.Type).includes(type)) {
            throw new Error("Invalid food type");
        }
    }

    get id() { return this.#id; }
    get amount() { return this.#amount; }
    get type() { return this.#type; }

    set amount(value) {
        if (value <= 0) throw new Error("Amount must be positive");
        this.#amount = value;
    }

    toString() {
        return `Food {
            id: ${this.#id},
            amount: ${this.#amount},
            type: ${this.#type}
        }`;
    }
}