const readline = require('readline');


const Animal = require('../model/Animal');
const Cage = require('../model/Cage');
const Food = require('../model/Food');
const Mammal = require('../model/Mammal');
const Vaccine = require('../model/Vaccine');


let animals = [];
let cage = new Cage(1, animals);
let vaccine1 = new Vaccine(4, "Paracetamol");
let vaccine2 = new Vaccine(5, "Ibuprophene");

let mammal = new Mammal(0.21, 2, 1, "Lucy", new Date(2024, 0, 21), 'f', [vaccine1]);
cage.animals.push(mammal);

const rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout
});

function showMenu() {
    return new Promise((resolve) => {
        const menu = `
Choose an option:
1. Show Animal Info
2. Show Mammal Info
3. Feed Mammal
4. Breastfeed Mammal
5. Assign Mammal to Cage
6. Register Mammal
7. Provide Vaccination to Mammal
8. Show Cage Info
9. Exit
        `;
        rl.question(menu, (option) => {
            resolve(option);
        });
    });
}

async function main() {
    let exit = false;
    while (!exit) {
        const option = await showMenu();
        
        switch(option) {
            case '1':
                console.log(mammal.toString());
                break;
            case '2':
                console.log(mammal.toString());
                break;
            case '3':
                rl.question("Enter the food name to feed: ", (foodName) => {
                    mammal.feed(new Food(1, 5.2, foodName));
                    main(); 
                });
                return;  
            case '4':
                mammal.breastfeed();
                break;
            case '5':
                mammal.assignCage(cage);
                console.log(`${mammal.name} has been assigned to cage ${cage.id}`);
                break;
            case '6':
                mammal.register();
                break;
            case '7':
                rl.question("Enter the vaccine name: ", (vaccineName) => {
                    rl.question("Enter the vaccine ID: ", (vaccineId) => {
                        let vaccine = new Vaccine(vaccineId, vaccineName);
                        mammal.provideVaccination(vaccine);
                        main();  
                    });
                });
                return;  
            case '8':
                console.log(cage.toString());
                break;
            case '9':
                exit = true;
                console.log("Exiting...");
                rl.close();
                break;
            default:
                console.log("Invalid option. Please try again.");
                break;
        }
    }
}

main();
