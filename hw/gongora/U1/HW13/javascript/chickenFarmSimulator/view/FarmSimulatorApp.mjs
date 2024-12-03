import { Chicken } from "../model/Chicken.mjs";
import readline from "readline";
import { FileSaver } from "../utils/FileSaver.mjs";

const createConsoleInterface = readline.createInterface({
    input: process.stdin,
    output: process.stdout
})

const askQuestion = (query) => new Promise(resolve => createConsoleInterface.question(query,resolve))

const main = async () => {
    console.log("Lucas's Chicken Farm Simulator")

    const id = await askQuestion("Enter id: ")
    const name = await askQuestion("Enter the name: ")
    const color = await askQuestion("Enter the color: ")
    console.log("Enter de birthdate")
    const year = await askQuestion("Enter the year: ")
    const month = await askQuestion("Enter the month: ")
    const day = await askQuestion("Enter the day: ")
    const bornOnDate = new Date(year,month-1,day)
    const notMolting = await askQuestion("Is not molting? (true/false)")
    
    const chicken = new Chicken(id,name,color,bornOnDate,notMolting)
    console.log(chicken)
    
    const fileSaver = new FileSaver();
    fileSaver.saveAsCSV([chicken], 'output.csv');
    fileSaver.saveAsJSON(chicken, 'person.json');
    
    createConsoleInterface.close()

}

main()