

import { FileJSONManager } from "../../../../utils/FileJSONManager.mjs";
import { Cable } from "../model/Cable.mjs";
import readline from "readline";

class Main {
    #fileJson;

    constructor() {
        this.#fileJson = new FileJSONManager('cables.json');
    }

    async runMainMenu() {
        const createConsoleInterface = readline.createInterface({
            input: process.stdin,
            output: process.stdout,
        });

        const askQuestion = (query) => {
            return new Promise((resolve) => {
                createConsoleInterface.question(query, (answer) => {
                    resolve(answer);
                });
            });
        };

        let condition = true;
        do {
            console.log("Menu\n");
            console.log("1. Add cable\n");
            console.log("2. Read cables\n");
            console.log("3. Exit\n");

            const option = await askQuestion("Enter the option: ");

            switch (option) {
                case "1":
                    await this.addCable(askQuestion);
                    break;
                case "2":
                    await this.readCables();
                    break;
                case "3":
                    condition = false;
                    createConsoleInterface.close();
                    break;
                default:
                    console.log("Enter the number 1 or number 2 or number 3\n");
            }
        } while (condition);
    }

    async addCable(askQuestion) {
        const id = await askQuestion("Enter the id: ");
        const type = await askQuestion("Enter the type: ");
        const numberOfConductors = await askQuestion("Enter the number of conductors: ");
        const price = await askQuestion("Enter the price: ");

        const cable = new Cable(id, type, numberOfConductors, price);
        this.#fileJson.create(cable);
        console.log("Cable added successfully!\n");
    }

    async readCables() {
        const cables = this.#fileJson.getAll();
        console.log("Cables:\n");
        cables.forEach((cable) => {
            console.log(cable.toString());
        });
        console.log("\n");
    }
}


const main = new Main();
main.runMainMenu();