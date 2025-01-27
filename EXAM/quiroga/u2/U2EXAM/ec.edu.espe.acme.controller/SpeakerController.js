import readline from 'readline';
import { CRUDMongo } from './CRUDMongo.mjs';

export class Menu {
    #formConsole;
    #database;
    #executionMenu;

    constructor() {
        this.#formConsole = readline.createInterface({
            input: process.stdin,
            output: process.stdout
        });
        this.#executionMenu = true;
        this.#database = new CRUDMongo("mongodb+srv://equiroga:equiroga@cluster0.ioba4.mongodb.net/?retryWrites=true&w=majority&appName=Cluster0", "oop");
    }

    async initialize() {
        try {
            await this.#database.connectDB();
        } catch (error) {
            console.error("Failed to initialize database connection.");
            process.exit(1);
        }
    }

    input(question) {
        return new Promise((resolve) => {
            this.#formConsole.question(question, answer => {
                resolve(answer);
            });
        });
    }

    async run() {
        await this.initialize();
        do {
            this.showOptions();
            let option = await this.input("Enter the option: ");
            await this.processOption(option);
        } while (this.#executionMenu);

        this.#formConsole.close();
    }

    showOptions() {
        console.log("Students Menu");
        console.log("1. Add student");
        console.log("2. View all students");
        console.log("3. Update student");
        console.log("4. Delete student");
        console.log("5. Exit");
    }



    async viewAllStudents() {
        try {
            let students = await this.#database.findData("Speaker");
            if (students.length === 0) {
                console.log("No students found.");
            } else {
                console.log("Speakers List:");
                students.forEach(student => {
                    console.log(`ID: ${student.id}, Name: ${student.name}, PGA: ${student.PGA}, Age: ${student.ageInYears}`);
                });
            }
        } catch (err) {
            console.error("Error fetching students:", err);
        }
    }

   
}
