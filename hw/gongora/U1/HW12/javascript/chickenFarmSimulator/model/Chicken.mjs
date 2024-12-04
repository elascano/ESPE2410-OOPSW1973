export class Chicken {
    id;
    name;
    color;
    ageInMonths;
    bornOnDate;
    notMolting;
    
    constructor(id, name, color, bornOnDate, notMolting) {
        this.id = id;
        this.name = name;
        this.color = color;
        this.bornOnDate = bornOnDate;
        this.notMolting = notMolting;
        this.ageInMonths = this.computeAgeInMonths();
    }

    toString() {
        return `Chicken [id=${this.id}, name=${this.name}, color=${this.color}, born on=${this.bornOnDate.toLocaleDateString()}, not molting=${this.notMolting}]`;
    }

    computeAgeInMonths() {
        let currentDate = new Date();
        let yearsLived = currentDate.getFullYear() - this.bornOnDate.getFullYear();
        let fullYearsLived = yearsLived - 1;
        let monthsOfFullYears = 12 * fullYearsLived;
        let firstYearMonths = 12 - this.bornOnDate.getMonth();
        let lastYearMonths = currentDate.getMonth();
        let ageInMonths = firstYearMonths + monthsOfFullYears + lastYearMonths;

        return ageInMonths;
    }

    getId() {
        return this.id;
    }

    setId(id) {
        this.id = id;
    }

    getName() {
        return this.name;
    }

    setName(name) {
        this.name = name;
    }

    getColor() {
        return this.color;
    }

    setColor(color) {
        this.color = color;
    }

    getAgeInMonths() {
        return this.ageInMonths;
    }

    getBornOnDate() {
        return this.bornOnDate;
    }

    setBornOnDate(bornOnDate) {
        this.bornOnDate = bornOnDate;
    }

    getNotMolting() {
        return this.notMolting;
    }

    setNotMolting(notMolting) {
        this.notMolting = notMolting;
    }
}
