class Cage {
    constructor(id, animals) {
        this.id = id;
        this.animals = animals;
    }

    toString() {
        return `
Cage:
    ID: ${this.id}
    Number of Animals: ${this.animals.length}
        `;
    }
}

module.exports = Cage;
