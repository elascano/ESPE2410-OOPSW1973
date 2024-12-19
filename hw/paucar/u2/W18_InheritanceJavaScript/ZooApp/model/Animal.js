class Animal {
    constructor(id, name, bornOnDate, weight, sex, vaccines) {
        this.id = id;
        this.name = name;
        this.bornOnDate = bornOnDate;
        this.weight = weight;
        this.sex = sex;
        this.vaccines = vaccines;
    }

    toString() {
        return `
Animal:
    ID: ${this.id}
    Name: ${this.name}
    Born On: ${this.bornOnDate.toLocaleDateString()}
    Weight: ${this.weight} kg
    Sex: ${this.sex === 'f' ? 'Female' : 'Male'}
    Vaccines: ${this.vaccines.map(v => v.name).join(", ")}
        `;
    }
}

module.exports = Animal;
