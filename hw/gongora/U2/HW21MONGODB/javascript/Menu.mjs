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
        this.#database = new CRUDMongo("mongodb+srv://lngongora:lngongora@cluster0.y73d4.mongodb.net/", "OOP");
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

    async processOption(option) {
        switch (option) {
            case "1":
                await this.addStudent();
                break;
            case "2":
                await this.viewAllStudents();
                break;
            case "3":
                await this.updateStudent();
                break;
            case "4":
                await this.deleteStudent();
                break;
            case "5":
                this.#executionMenu = false;
                await this.#database.closeConnection();
                console.log("Exiting...");
                break;
            default:
                console.log("Invalid option, please try again.");
                break;
        }
    }

    async addStudent() {
        let id = await this.input("Enter the id: ");
        let name = await this.input("Enter the name: ");
        let PGA = parseFloat(await this.input("Enter the PGA: "));
        let ageInYears = parseInt(await this.input("Enter the age in years: "), 10);

        let json = {
            id: String(id),
            name: String(name),
            PGA: Number(PGA),
            ageInYears: Number(ageInYears)
        };

        try {
            await this.#database.insertData("students", json);
            console.log("Student added successfully!");
        } catch (err) {
            console.error("Error adding student:", err);
        }
    }

    async viewAllStudents() {
        try {
            let students = await this.#database.findData("students");
            if (students.length === 0) {
                console.log("No students found.");
            } else {
                console.log("Students List:");
                students.forEach(student => {
                    console.log(`ID: ${student.id}, Name: ${student.name}, PGA: ${student.PGA}, Age: ${student.ageInYears}`);
                });
            }
        } catch (err) {
            console.error("Error fetching students:", err);
        }
    }

    async updateStudent() {
        let id = await this.input("Enter the id of the student you want to update: ");
        let student = await this.#database.findData("students", { id });

        if (student.length === 0) {
            console.log("No student found with that ID.");
            return;
        }

        let name = await this.input(`Enter the new name (current: ${student[0].name}): `);
        let PGA = parseFloat(await this.input(`Enter the new PGA (current: ${student[0].PGA}): `));
        let ageInYears = parseInt(await this.input(`Enter the new age (current: ${student[0].ageInYears}): `), 10);

        let updateDoc = {
            name: String(name),
            PGA: Number(PGA),
            ageInYears: Number(ageInYears)
        };

        try {
            await this.#database.updateData("students", { id }, updateDoc);
            console.log("Student updated successfully!");
        } catch (err) {
            console.error("Error updating student:", err);
        }
    }

    async deleteStudent() {
        let id = await this.input("Enter the id of the student you want to delete: ");
        let student = await this.#database.findData("students", { id });

        if (student.length === 0) {
            console.log("No student found with that ID.");
            return;
        }

        try {
            await this.#database.deleteData("students", { id });
            console.log("Student deleted successfully!");
        } catch (err) {
            console.error("Error deleting student:", err);
        }
    }
}
