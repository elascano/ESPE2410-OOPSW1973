import readline from "readline";
import SortingController from "../controller/SortingController.js";

const rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout
});

function startApp() {
    rl.question("Enter numbers separate for comes: ", (input) => {
        const controller = new SortingController();
        controller.sortArray(input);
        rl.close();
    });
}

export default startApp;
