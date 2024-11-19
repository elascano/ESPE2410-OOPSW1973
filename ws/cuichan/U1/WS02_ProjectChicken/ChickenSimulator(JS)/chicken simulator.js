class Chicken {
    constructor() {
        this.id = 0;
        this.name = "";
        this.color = "";
        this.age = 0;
        this.bornOnDate = new Date();
        this.notMolting = false;
    };
    
}

console.log("Hello Chickens");
const chicken = new Chicken();
console.log("Chicken -->", chicken.toString());
