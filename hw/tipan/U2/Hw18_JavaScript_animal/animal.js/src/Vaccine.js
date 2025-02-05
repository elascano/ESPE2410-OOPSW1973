const Animal = require('./Animal.js');

class Vaccine {
    constructor(id, description) {
        this.id = id;
        this.description = description;
    }

    toString() {
        return `Vaccine{id=${this.id}, description=${this.description}}`;
    }

    
    getId() {
        return this.id;
    }

    setId(id) {
        this.id = id;
    }

    getDescription() {
        return this.description;
    }

    setDescription(description) {
        this.description = description;
    }
}

module.exports = Vaccine;
  