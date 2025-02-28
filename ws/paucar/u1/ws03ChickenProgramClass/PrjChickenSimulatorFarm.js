class Chicken {
    constructor(id, name, color, age, bornOnDate, notMolting) {
        let id = id;
        let name = name;
        let color = color;
        let age = age;
        let bornOnDate = bornOnDate;
        let notMolting = notMolting;
    }
}


function main() {
    console.log("Hello Chickens");
    let chicken = new Chicken();
    console.log("Chicken -->", chicken.toString());
}
main();
