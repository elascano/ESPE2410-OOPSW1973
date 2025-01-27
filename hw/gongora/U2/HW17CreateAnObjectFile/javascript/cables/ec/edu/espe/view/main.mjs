import { resolve } from "path";
import { JsonFileManager } from "../../../../utils/JsonFileManager.mjs";
import { Cable } from "../model/cable.mjs";
import readline from "readline";

class Menu {
    #jsonFile;
    #consoleCreateInterface;

    constructor() {
        this.#jsonFile = new JsonFileManager("cables.json");
        this.#consoleCreateInterface = readline.createInterface({
            input: process.stdin,
            output: process.stdout,
        })
    }

    async runMenu() {
        let condition = true

        do {
            console.log("\t MENU \t")
            console.log("1. Create cable")
            console.log("2. View cables")
            console.log("3. Delete cable")
            console.log("4. Update cable")
            console.log("5. Exit")

            const option = await this.askQuestion("Enter the option according your number: ")

            switch (option) {
                case "1":
                    await this.addCable()
                    break;
                case "2":
                    await this.viewCables()
                    break;
                case "3":
                    await this.deleteCale()
                    break;
                case "4":
                    await this.updateCable()
                    break;
                case "5":
                    this.#consoleCreateInterface.close();
                    condition = false;
                    break;
                default:
                    console.log("Enter the correct option")

            }

        } while (condition)
    }

    async addCable(){
        const id = await this.askQuestion("\nEnter the id: ")
        const type = await this.askQuestion("Enter the type: ")
        const numberOfConductors = await this.askQuestion("Enter the number of conductors: ")
        const price = await this.askQuestion("Enter the price: ")

        const cable = new Cable(id,type,numberOfConductors,price)

        this.#jsonFile.create(cable)
    }

    async viewCables(){
        const cables = this.#jsonFile.read()

        cables.forEach(cable => {

            console.log(cable.toString())
            
        });
    }

    async deleteCale(){
        const id = await this.askQuestion("Enter the id of the cable: ")

        this.#jsonFile.delete(id)
    }

    async updateCable(){
        const id = await this.askQuestion("Enter the id to cable: ")
        const type = await this.askQuestion("Enter the new type: ")
        const numberOfConductors = await this.askQuestion("Enter the new  number of conductors: ")
        const price = await this.askQuestion("Enter the new price: ")

        const cable = new Cable(id,type,numberOfConductors,price)
        this.#jsonFile.update(cable)

    }

    askQuestion(query) {
        return new Promise((resolve)=> this.#consoleCreateInterface.question(query, (answer) => {resolve(answer)}))
    }
}

const main =  new Menu()

main.runMenu()