// Animal.js
export class Animal {
    static Sex = {
        MALE: 'M',
        FEMALE: 'F'
    };

    #id;
    #name;
    #bornOnDate;
    #weight;
    #sex;
    #vaccines;

    constructor(id, name, bornOnDate, weight, sex) {
        this.#validateConstructorParams(id, name, weight, sex);
        this.#id = id;
        this.#name = name;
        this.#bornOnDate = bornOnDate;
        this.#weight = weight;
        this.#sex = sex;
        this.#vaccines = [];
    }

    #validateConstructorParams(id, name, weight, sex) {
        if (id < 0) throw new Error("ID must be non-negative");
        if (!name || name.trim() === "") throw new Error("Name cannot be empty");
        if (weight <= 0) throw new Error("Weight must be positive");
        if (!Object.values(Animal.Sex).includes(sex)) {
            throw new Error("Invalid sex value");
        }
    }

    feed(food) {
        if (!food) throw new Error("Food cannot be null");
        console.log(`Feeding ${this.#name} with ${food.toString()}`);
    }

    register() {
        console.log(`Registering animal ${this.#name}`);
    }

    assignCage(cage) {
        if (!cage) throw new Error("Cage cannot be null");
        console.log(`Assigning ${this.#name} to cage ${cage.toString()}`);
        cage.addAnimal(this);
    }

    provideVaccine(vaccine) {
        if (!vaccine) throw new Error("Vaccine cannot be null");
        this.#vaccines.push(vaccine);
        console.log(`Providing vaccine ${vaccine.toString()} to ${this.#name}`);
    }

    get id() { return this.#id; }
    get name() { return this.#name; }
    get bornOnDate() { return this.#bornOnDate; }
    get weight() { return this.#weight; }
    get sex() { return this.#sex; }
    get vaccines() { return [...this.#vaccines]; }

    toString() {
        return `Animal {
            id: ${this.#id},
            name: ${this.#name},
            bornOnDate: ${this.#bornOnDate.toISOString()},
            weight: ${this.#weight},
            sex: ${this.#sex},
            vaccines: ${this.#vaccines.map(v => v.toString())}
        }`;
    }
}