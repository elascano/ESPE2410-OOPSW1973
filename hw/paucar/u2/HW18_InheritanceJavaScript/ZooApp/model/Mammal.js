const Animal = require('./Animal');

class Mammal extends Animal {
    constructor(weight, age, id, name, bornOnDate, sex, vaccines) {
        super(id, name, bornOnDate, weight, sex, vaccines);
        this.age = age;
    }

    breastfeed() {
        console.log(`${this.name} is breastfeeding.`);
    }

    assignCage(cage) {
        this.cage = cage;
        cage.animals.push(this);
    }

    feed(food) {
        console.log(`${this.name} is being fed with ${food.name}.`);
    }

    register() {
        console.log(`${this.name} is being registered.`);
    }

    provideVaccination(vaccine) {
        this.vaccines.push(vaccine);
        console.log(`${this.name} has been vaccinated with ${vaccine.name}.`);
    }

    toString() {
        return `
Mammal:
    ID: ${this.id}
    Name: ${this.name}
    Born On: ${this.bornOnDate.toLocaleDateString()}
    Weight: ${this.weight} kg
    Age: ${this.age} years
    Sex: ${this.sex === 'f' ? 'Female' : 'Male'}
    Vaccines: ${this.vaccines.map(v => v.name).join(", ")}
        `;
    }
}

module.exports = Mammal;
