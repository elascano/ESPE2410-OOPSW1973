class Chicken {
    constructor(id, name, color, bornOnDate, notMolting) {
        this.id = id;
        this.name = name;
        this.color = color;
        this.bornOnDate = new Date(bornOnDate);  
        this.notMolting = notMolting;
        
      
        this.ageInMonths = this.computeAgeInMonths();
    }

    computeAgeInMonths() {
        const currentDate = new Date();  
        const birthDate = this.bornOnDate;

      
        let yearsDifference = currentDate.getFullYear() - birthDate.getFullYear();
        let monthsDifference = currentDate.getMonth() - birthDate.getMonth();

        if (monthsDifference < 0) {
            yearsDifference--;
            monthsDifference += 12;
        }

        return (yearsDifference * 12) + monthsDifference;
    }

    // Métodos getter
    getId() {
        return this.id;
    }

    getName() {
        return this.name;
    }

    getColor() {
        return this.color;
    }

    getAgeInMonths() {
        return this.ageInMonths;
    }

    getBornOnDate() {
        return this.bornOnDate;
    }

    isNotMolting() {
        return this.notMolting;
    }
    
    
    setId(id) {
        this.id = id;
    }

    setName(name) {
        this.name = name;
    }

    setColor(color) {
        this.color = color;
    }

    setAgeInMonths(ageInMonths) {
        this.ageInMonths = ageInMonths;
    }

    setBornOnDate(bornOnDate) {
        this.bornOnDate = new Date(bornOnDate);
    }

    setNotMolting(notMolting) {
        this.notMolting = notMolting;
    }
}


const chicken = new Chicken(1, "Lucy", "White", "2020-11-25", true);
console.log("Months: " + chicken.getAgeInMonths());
