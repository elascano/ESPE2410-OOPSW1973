
class House {
    constructor(numberHouse, expense, pets, vehicles, residents) {
        this.numberHouse = numberHouse;
        this.expense = expense;     
        this.pets = pets;      
        this.vehicles = vehicles;   
        this.residents = residents;
    }
}

class Administrator {
    constructor(name) {
        this.name = name;
    }
}

class Condominium {
    constructor(name) {
        this.name = name;
        this.houses = [];
    }
}

class Owner {
    constructor(name, id) {
        this.name = name;
        this.id = id;
        this.condos = [];
    }
}
