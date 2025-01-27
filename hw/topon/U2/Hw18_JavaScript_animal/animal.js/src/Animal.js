
class Animal {
    constructor(id, name, bornOnDate, weight, sex, vaccines = []) {
        this.id = id;
        this.name = name;
        this.bornOnDate = bornOnDate;
        this.weight = weight;
        this.sex = sex;
        this.vaccines = vaccines;  
    }

    toString() {
        return `Animal{id=${this.id}, name=${this.name}, BornOnDate=${this.bornOnDate}, weight=${this.weight}, sex=${this.sex}, vaccines=[${this.vaccines.map(vaccine => vaccine.toString()).join(", ")}]}`;
    }

    feed(food) {
        console.log(`Feeding the animal ${this.name} with --> ${food}`);
    }

    register() {
        console.log(`Registering the animal ${this.name}`);
    }

    assignCage(cage) {
        console.log(`Assigning the animal ${this.name} to cage --> ${cage}`);
        cage.addAnimal(this); 
    }

    provideVaccination(vaccine) {
        console.log(`Providing vaccine --> ${vaccine} <-- to ${this.name}`);
        this.vaccines.push(vaccine);  
    }
}

module.exports = Animal;


    
      

